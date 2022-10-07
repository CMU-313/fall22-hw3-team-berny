package com.sismics.docs.core.constant;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Application constants.
 * 
 * @author jtremeaux
 */
public class Constants {
    /**
     * Default timezone ID.
     */
    public static final String DEFAULT_TIMEZONE_ID = "Europe/London";
    
    /**
     * Administrator's default password ("admin").
     */
    public static final String DEFAULT_ADMIN_PASSWORD = "$2y$10$xg0EEKVUehutDI1m6qQhVeFz7SMQMl1jQzjf2KkVsR2c7aV2vyyjK";

    /**
     * Administrator's default email.
     */
    public static final String DEFAULT_ADMIN_EMAIL = "admin@localhost";

    /**
     * Bcrypt default work factor
     */
    public static final int DEFAULT_BCRYPT_WORK = 10;

    /**
     * Guest user ID.
     */
    public static final String GUEST_USER_ID = "guest";

    /**
     * Default generic user role.
     */
    public static final String DEFAULT_USER_ROLE = "user";
    
    /**
     * Supported document languages.
     */
    public static final List<String> SUPPORTED_LANGUAGES = Lists.newArrayList("eng", "fra", "ita", "deu", "spa", "por", "pol", "rus", "ukr", "ara", "hin", "chi_sim", "chi_tra", "jpn", "tha", "kor", "nld", "tur", "heb", "hun", "fin", "swe", "lav", "dan", "nor", "vie", "ces");

    public static final List<String> COUNTRIES = Lists.newArrayList("Afghanistan", "Aland Islands", "Albania", "Algeria", "American Samoa", "Andorra", "Angola", "Anguilla", "Antarctica", "Antigua and Barbuda", "Argentina", "Armenia", "Aruba", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bermuda", "Bhutan", "Bolivia", "Bosnia and Herzegovina", "Botswana", "Bouvet Island", "Brazil", "British Indian Ocean Territory", "Brunei Darussalam", "Bulgaria", "Burkina Faso", "Burundi", "Cambodia", "Cameroon", "Canada", "Cape Verde", "Cayman Islands", "Central African Republic", "Chad", "Chile", "China", "Christmas Island", "Cocos (Keeling) Islands", "Colombia", "Comoros", "Congo", "Congo, The Democratic Republic of The", "Cook Islands", "Costa Rica", "Cote D'ivoire", "Croatia", "Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Ethiopia", "Falkland Islands (Malvinas)", "Faroe Islands", "Fiji", "Finland", "France", "French Guiana", "French Polynesia", "French Southern Territories", "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Gibraltar", "Greece", "Greenland", "Grenada", "Guadeloupe", "Guam", "Guatemala", "Guernsey", "Guinea", "Guinea-bissau", "Guyana", "Haiti", "Heard Island and Mcdonald Islands", "Holy See (Vatican City State)", "Honduras", "Hong Kong", "Hungary", "Iceland", "India", "Indonesia", "Iran, Islamic Republic of", "Iraq", "Ireland", "Isle of Man", "Israel", "Italy", "Jamaica", "Japan", "Jersey", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Korea, Democratic People's Republic of", "Korea, Republic of", "Kuwait", "Kyrgyzstan", "Lao People's Democratic Republic", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libyan Arab Jamahiriya", "Liechtenstein", "Lithuania", "Luxembourg", "Macao", "Macedonia, The Former Yugoslav Republic of", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Martinique", "Mauritania", "Mauritius", "Mayotte", "Mexico", "Micronesia, Federated States of", "Moldova, Republic of", "Monaco", "Mongolia", "Montenegro", "Montserrat", "Morocco", "Mozambique", "Myanmar", "Namibia", "Nauru", "Nepal", "Netherlands", "Netherlands Antilles", "New Caledonia", "New Zealand", "Nicaragua", "Niger", "Nigeria", "Niue", "Norfolk Island", "Northern Mariana Islands", "Norway", "Oman", "Pakistan", "Palau", "Palestinian Territory, Occupied", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Pitcairn", "Poland", "Portugal", "Puerto Rico", "Qatar", "Reunion", "Romania", "Russian Federation", "Rwanda", "Saint Helena", "Saint Kitts and Nevis", "Saint Lucia", "Saint Pierre and Miquelon", "Saint Vincent and The Grenadines", "Samoa", "San Marino", "Sao Tome and Principe", "Saudi Arabia", "Senegal", "Serbia", "Seychelles", "Sierra Leone", "Singapore", "Slovakia", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "South Georgia and The South Sandwich Islands", "Spain", "Sri Lanka", "Sudan", "Suriname", "Svalbard and Jan Mayen", "Swaziland", "Sweden", "Switzerland", "Syrian Arab Republic", "Taiwan", "Tajikistan", "Tanzania, United Republic of", "Thailand", "Timor-leste", "Togo", "Tokelau", "Tonga", "Trinidad and Tobago", "Tunisia", "Turkey", "Turkmenistan", "Turks and Caicos Islands", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "United States", "United States Minor Outlying Islands", "Uruguay", "Uzbekistan", "Vanuatu", "Venezuela", "Viet Nam", "Virgin Islands, British", "Virgin Islands, U.S.", "Wallis and Futuna", "Western Sahara", "Yemen", "Zambia", "Zimbabwe");
    
    public static final List<String> RACES = Lists.newArrayList("Hispanic/Latino", "Black or African-American", "White", "American Indian or Alaska Native", "Asian", "Native Hawaiian or other Pacific Islander", "Two or more races", "Unknown");

     /**
     * List of applicant degrees .
     */
    public static final List<String> DEGREES = Lists.newArrayList("associate_degree","bachelor_degree","master_degree","doctoral_degree");

    /**
     * List of applicant gpa scale options.
    */
    public static final List<String> GPASCALE = Lists.newArrayList("4_5","3_4","2_3","1_2", "0_1");


    /**
     * List of college applying to .
    */
    // public static final List<String> CMUCOLLEGE = Lists.newArrayList("College of Engineering","College of Fine Arts","Dietrich College of Humanities and Social Sciences","Heinz College of Information Systems and Public Policy", "Mellon College of Science", "School of Computer Science", "Tepper School of Business");
    public static final List<String> CMUCOLLEGE = Lists.newArrayList("cit","cfa","dc","heinz", "mcs", "scs", "tp");
    
    /**
     * Base URL environment variable.
     */
    public static final String BASE_URL_ENV = "DOCS_BASE_URL";

    /**
     * Default language environment variable.
     */
    public static final String DEFAULT_LANGUAGE_ENV = "DOCS_DEFAULT_LANGUAGE";

    /**
     * SMTP configuration environment variables.
     */
    public static final String SMTP_HOSTNAME_ENV = "DOCS_SMTP_HOSTNAME";
    public static final String SMTP_PORT_ENV = "DOCS_SMTP_PORT";
    public static final String SMTP_USERNAME_ENV = "DOCS_SMTP_USERNAME";
    public static final String SMTP_PASSWORD_ENV = "DOCS_SMTP_PASSWORD";

    /**
     * Global quota environment variable.
     */
    public static final String GLOBAL_QUOTA_ENV = "DOCS_GLOBAL_QUOTA";

    /**
     * Initial admin password environment variable.
     */
    public static final String ADMIN_PASSWORD_INIT_ENV = "DOCS_ADMIN_PASSWORD_INIT";

    /**
     * Initial admin password environment variable.
     */
    public static final String ADMIN_EMAIL_INIT_ENV = "DOCS_ADMIN_EMAIL_INIT";

    /**
     * Work factor to be used by Bcrypt
     */
    public static final String BCRYPT_WORK_ENV = "DOCS_BCRYPT_WORK";

    /**
     * Expiration time of the password recovery in hours.
     */
    public static final int PASSWORD_RECOVERY_EXPIRATION_HOUR = 2;

    /**
     * Email template for password recovery.
     */
    public static final String EMAIL_TEMPLATE_PASSWORD_RECOVERY = "password_recovery";

    /**
     * Email template for route step validate.
     */
    public static final String EMAIL_TEMPLATE_ROUTE_STEP_VALIDATE = "route_step_validate";

    /**
     * mm per inch.
     */
    public static float MM_PER_INCH = 1 / (10 * 2.54f) * 72f;
}
