'use strict';

/**
 * Document view controller.
 */
angular.module('docs').controller('DocumentView', function ($scope, $rootScope, $state, $stateParams, $location, $dialog, $uibModal, Restangular, $translate) {
  // Load document data from server
  Restangular.one('document', $stateParams.id).get().then(function (data) {
    $scope.document = data;
    if ($scope.document.gpascale == "4_5" ){
      $scope.document.gpascale = "4.0 - 5.0";
    }else if($scope.document.gpascale == "3_4" ){
      $scope.document.gpascale = "3.0 - 4.0";
    }else if($scope.document.gpascale == "2_3" ){
      $scope.document.gpascale = "2.0 - 3.0";
    }else if($scope.document.gpascale == "1_2" ){
      $scope.document.gpascale = "1.0 - 2.0";
    }else {
      $scope.document.gpascale = "0.0 - 1.0";
    }

    if ($scope.document.cmucollege == "cit" ){
      $scope.document.cmucollege = "College of Engineering";
    }else if($scope.document.cmucollege == "cfa" ){
      $scope.document.cmucollege = "College of Fine Arts";
    }else if($scope.document.cmucollege == "dc" ){
      $scope.document.cmucollege = "Dietrich College of Humanities and Social Sciences";
    }else if($scope.document.cmucollege == "heinz" ){
      $scope.document.cmucollege = "Heinz College of Information Systems and Public Policy";
    }else if($scope.document.cmucollege == "mcs" ){
      $scope.document.cmucollege = "Mellon College of Science";
    }else if($scope.document.cmucollege == "scs" ){
      $scope.document.cmucollege = "School of Computer Science";
    }else {
      $scope.document.cmucollege = "Tepper School of Business";
    }

    
    $scope.document.degree_date = new Date($scope.document.degree_date).toDateString();
    if ($scope.document.highest_held_degree == "associate_degree" ){
      $scope.document.highest_held_degree = "Associate's Degree";
    }else if($scope.document.highest_held_degree == "bachelor_degree" ){
      $scope.document.highest_held_degree = "Bachelor's Degree";
    }else if($scope.document.highest_held_degree == "master_degree" ){
      $scope.document.highest_held_degree = "Master's Degree";
    }else {
      $scope.document.highest_held_degree = "Doctoral Degree";
    }
    
  }, function (response) {
    $scope.error = response;
  });

  // Load comments from server
  Restangular.one('comment', $stateParams.id).get().then(function (data) {
    $scope.comments = data.comments;
  }, function (response) {
    $scope.commentsError = response;
  });

  /**
   * Add a comment.
   */
  $scope.comment = '';
  $scope.addComment = function () {
    if ($scope.comment.length === 0) {
      return;
    }

    Restangular.one('comment').put({
      id: $stateParams.id,
      content: $scope.comment
    }).then(function (data) {
      $scope.comment = '';
      $scope.comments.push(data);
    });
  };

  /**
   * Delete a comment.
   */
  $scope.deleteComment = function (comment) {
    var title = $translate.instant('document.view.delete_comment_title');
    var msg = $translate.instant('document.view.delete_comment_message');
    var btns = [
      {result: 'cancel', label: $translate.instant('cancel')},
      {result: 'ok', label: $translate.instant('ok'), cssClass: 'btn-primary'}
    ];

    $dialog.messageBox(title, msg, btns, function (result) {
      if (result === 'ok') {
        Restangular.one('comment', comment.id).remove().then(function () {
          $scope.comments.splice($scope.comments.indexOf(comment), 1);
        });
      }
    });
  };

  /**
   * Delete a document.
   */
  $scope.deleteDocument = function (document) {
    var title = $translate.instant('document.view.delete_document_title');
    var msg = $translate.instant('document.view.delete_document_message');
    var btns = [
      {result: 'cancel', label: $translate.instant('cancel')},
      {result: 'ok', label: $translate.instant('ok'), cssClass: 'btn-primary'}
    ];

    $dialog.messageBox(title, msg, btns, function (result) {
      if (result === 'ok') {
        Restangular.one('document', document.id).remove().then(function () {
          $scope.loadDocuments();
          $state.go('document.default');
        });
      }
    });
  };

  /**
   * Open the share dialog.
   */
  $scope.share = function () {
    $uibModal.open({
      templateUrl: 'partial/docs/document.share.html',
      controller: 'DocumentModalShare'
    }).result.then(function (name) {
          if (name === null) {
            return;
          }

          // Share the document
          Restangular.one('share').put({
            name: name,
            id: $stateParams.id
          }).then(function (acl) {
                // Display the new share ACL and add it to the local ACLs
                $scope.showShare(acl);
                $scope.document.acls.push(acl);
                $scope.document.acls = angular.copy($scope.document.acls);
              })
        });
  };

  /**
   * Display a share.
   */
  $scope.showShare = function (share) {
    // Show the link
    var link = $location.absUrl().replace($location.path(), '').replace('#', '') + 'share.html#/share/' + $stateParams.id + '/' + share.id;
    var title = $translate.instant('document.view.shared_document_title');
    var msg = $translate.instant('document.view.shared_document_message', { link: link });
    var btns = [
      {result: 'close', label: $translate.instant('close')}
    ];

    if ($rootScope.userInfo.username !== 'guest') {
      btns.unshift({result: 'unshare', label: $translate.instant('unshare'), cssClass: 'btn-danger'});
    }

    $dialog.messageBox(title, msg, btns, function (result) {
      if (result === 'unshare') {
        // Unshare this document and update the local shares
        Restangular.one('share', share.id).remove().then(function () {
          $scope.document.acls = _.reject($scope.document.acls, function (s) {
            return share.id === s.id;
          });
        });
      }
    });
  };

  /**
   * Export the current document to PDF.
   */
  $scope.exportPdf = function () {
    $uibModal.open({
      templateUrl: 'partial/docs/document.pdf.html',
      controller: 'DocumentModalPdf'
    });

    return false;
  };

  /**
   * Validate the workflow.
   */
  $scope.validateWorkflow = function (transition) {
    Restangular.one('route').post('validate', {
      documentId: $stateParams.id,
      transition: transition,
      comment: $scope.workflowComment
    }).then(function (data) {
      $scope.workflowComment = '';
      var title = $translate.instant('document.view.workflow_validated_title');
      var msg = $translate.instant('document.view.workflow_validated_message');
      var btns = [{result: 'ok', label: $translate.instant('ok'), cssClass: 'btn-primary'}];
      $dialog.messageBox(title, msg, btns);

      if (data.readable) {
        $scope.document.route_step = data.route_step;
      } else {
        $state.go('document.default');
      }
    });
  };
});