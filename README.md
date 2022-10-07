## HW 3 User Testing Documentation

Our feature consists of new input form fields that allow Teedy to collect more information about the applicants. Our new fields include a participant’s Name, Highest Degree Held or Received, Last Attended Institution, Date of Degree, Current Position Title, GPA, GPA Scale, CMU College Applying To, County of Residence, and Race. Below are more details about each new attribute added. 

- Name (entered as a string/text input)
- Highest Degree Held or Received (string selected from dropdown options)
- Last Attended Institution (entered as a string/text input)
- Date of Degree (selected from date picker)
- Current Position Title (entered as a string/text input)
- GPA (entered as a float)
- GPA Scale (string selected from dropdown options)
- CMU College Applying To (string selected from dropdown options)
- County of Residence (string selected from dropdown options)
- Race (string selected from dropdown options)

To use our feature, a user can select “Add a Document” where they will then see a list of different form fields, including the new ones we added, to fill out. In order to save their document, the user must complete all the required fields before uploading their document. After saving the application, if the user goes back to view their document, they will be able to see the information that they previously inputted under the “Content” tab. All the information from the above fields will be displayed for every document that’s selected. This will then allow people on the admission’s side to be able to quickly get an overview of an applicant without having to read through all the documents. Now with our new features, the most important information about an applicant will be displayed in a visible location on Teedy. (These steps are also described in the following screenshots.)

1. Adding a document
2. Inputting information to new form fields
3. Viewing inputted information

To test our feature on Teedy, a user can add and upload a document, fill in the form fields, save their document, and then check that the information they inputted is displayed correctly on the “Content” tab after viewing their document again. The “Content” tab should display the form field labels as well as the user’s inputted information. To test the changes made to the code, a user can navigate to the Teedy folder and run “mvn clean install” and then “mvn test” to check that all the tests pass without any failures or errors. For the different test files, we added params for all the new features we added to ensure that the changes would function as we expect them to. 



## Documentation

Documentation on our team's new features and user testing can be found in the UserDocumentation file located in the Fall22-HW3-Team-Berny folder. 

![Open in Codespaces](https://classroom.github.com/assets/open-in-codespaces-abfff4d4e15f9e1bd8274d9a39a0befe03a0632bb0f153d0ec72ff541cedbe34.svg)
<h3 align="center">
  <img src="https://teedy.io/img/github-title.png" alt="Teedy" width=500 />
</h3>

[![License: GPL v2](https://img.shields.io/badge/License-GPL%20v2-blue.svg)](https://www.gnu.org/licenses/old-licenses/gpl-2.0.en.html)
![Coverage](https://raw.githubusercontent.com/CMU-313/Teedy/badges/badges/jacoco.svg?token=GHSAT0AAAAAABYAA6NCYJCAXNYCQUUBMWB6YYKLW2Q)

Teedy is an open source, lightweight document management system for individuals and businesses.

![New!](https://teedy.io/img/laptop-demo.png?20180301)

# Features

- Responsive user interface
- Optical character recognition
- LDAP authentication ![New!](https://www.sismics.com/public/img/new.png)
- Support image, PDF, ODT, DOCX, PPTX files
- Video file support
- Flexible search engine with suggestions and highlighting
- Full text search in all supported files
- All [Dublin Core](http://dublincore.org/) metadata
- Custom user-defined metadata ![New!](https://www.sismics.com/public/img/new.png)
- Workflow system ![New!](https://www.sismics.com/public/img/new.png)
- 256-bit AES encryption of stored files
- File versioning ![New!](https://www.sismics.com/public/img/new.png)
- Tag system with nesting
- Import document from email (EML format)
- Automatic inbox scanning and importing
- User/group permission system
- 2-factor authentication
- Hierarchical groups
- Audit log
- Comments
- Storage quota per user
- Document sharing by URL
- RESTful Web API
- Webhooks to trigger external service
- Fully featured Android client
- [Bulk files importer](https://github.com/sismics/docs/tree/master/docs-importer) (single or scan mode)
- Tested to one million documents


# Native Installation

## Requirements

Before building Teedy from source, you will need to install several prerequisites, including Java 11+, Maven 3+, NPM, Grunt, Tesseract 4, ffmpeg, and mediainfo.
We give instructions for installing these prerequisites on several platforms below.

### Linux (Ubuntu 22.04)

```console
sudo apt install \
  default-jdk \
  ffmpeg \
  grunt \
  maven \
  npm \
  tesseract-ocr \
  tesseract-ocr-ara \
  tesseract-ocr-ces \
  tesseract-ocr-chi-sim \
  tesseract-ocr-chi-tra \
  tesseract-ocr-dan \
  tesseract-ocr-deu \
  tesseract-ocr-fin \
  tesseract-ocr-fra \
  tesseract-ocr-heb \
  tesseract-ocr-hin \
  tesseract-ocr-hun \
  tesseract-ocr-ita \
  tesseract-ocr-jpn \
  tesseract-ocr-kor \
  tesseract-ocr-lav \
  tesseract-ocr-nld \
  tesseract-ocr-nor \
  tesseract-ocr-pol \
  tesseract-ocr-por \
  tesseract-ocr-rus \
  tesseract-ocr-spa \
  tesseract-ocr-swe \
  tesseract-ocr-tha \
  tesseract-ocr-tur \
  tesseract-ocr-ukr \
  tesseract-ocr-vie
```

### Mac

```console
brew install \
  ffmpeg \
  grunt-cli \
  maven \
  mediainfo \
  npm \
  openjdk \
  tesseract \
  tesseract-lang
```

### Windows

It is highly recommended that you proceed to install Windows Subsystem Linux (WSL), following the link: [Install Linux on Windows with WSL
](https://docs.microsoft.com/en-us/windows/wsl/install). This will allow you to run a Linux distro (Ubuntu's the default) within the Windows environment, and you can then proceed to follow the Linux (Ubuntu 22.04) instructions to install the dependencies.

**Note**: This would mean that you should proceed to execute the following instructions within the Linux environment as well.

## Installation Steps

Clone the repository to your local machine (`git clone https://github.com/CMU-313/Teedy`) and then use Maven to build Teedy from source by running the following command from the root directory:

```console
mvn clean -DskipTests install
```

After successfully building Teedy from source, you can launch a Teedy instance by running the following commands from the root directory:

```console
cd docs-web
mvn jetty:run
```

**The default admin password is "admin". Don't forget to change it before going to production.**

# License

Teedy is released under the terms of the GPL license. See `COPYING` for more
information or see <http://opensource.org/licenses/GPL-2.0>.
