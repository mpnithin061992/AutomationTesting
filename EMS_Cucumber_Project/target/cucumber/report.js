$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/selenium.feature");
formatter.feature({
  "name": "Super Admin Functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Checking the Plant addition fuctionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SuperAdmin"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is in Home Page by entering and submitting the email id \"nmp1@its.jnj.com\" from JJEDS Login and having superadmin access",
  "keyword": "Given "
});
formatter.match({
  "location": "SuperAdmin_StepDefinition.user_is_in_home_page_by_entering_and_submitting_the_email_id_something_from_jjeds_login_and_having_superadmin_access(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to Settings page",
  "keyword": "When "
});
formatter.match({
  "location": "SuperAdmin_StepDefinition.user_navigates_to_settings_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clicks Plant icon",
  "keyword": "And "
});
formatter.match({
  "location": "SuperAdmin_StepDefinition.clicks_plant_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on Add Plant",
  "keyword": "And "
});
formatter.match({
  "location": "SuperAdmin_StepDefinition.clicks_on_add_plant()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "provides the below details in Plant Name,Serial Number,Region Name,Country Name,OPCO Name,Sector Name,Primary Owner Email,Secondary Owner Email,Description",
  "rows": [
    {
      "cells": [
        "Test Dummy Plant3",
        "800",
        "Region-1",
        "India",
        "Opco-1",
        "Sect-1",
        "nmp1@its.jnj.com",
        "sreji@its.jnj.com",
        "Description"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "SuperAdmin_StepDefinition.provides_the_below_details_in_plant_nameserial_numberregio_namecountry_nameopco_namesector_nameprimary_owner_emailsecondary_owner_emaildescription(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Submit",
  "keyword": "And "
});
formatter.match({
  "location": "SuperAdmin_StepDefinition.click_on_submit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Esignature page must be displayed with user entering the below details",
  "rows": [
    {
      "cells": [
        "nmp1",
        "Revolution@900",
        "I Acknowledge",
        "Add Plant"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "SuperAdmin_StepDefinition.esignature_page_must_be_displayed_with_user_entering_the_below_details(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User must able to click on sign",
  "keyword": "And "
});
formatter.match({
  "location": "SuperAdmin_StepDefinition.user_must_able_to_click_on_sign()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "follwoing success message must be displayed \"Plant added successfully\"",
  "keyword": "And "
});
formatter.match({
  "location": "SuperAdmin_StepDefinition.follwoing_success_message_must_be_displayed_something(String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected [true] but found [false]\r\n\tat org.testng.Assert.fail(Assert.java:96)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:776)\r\n\tat org.testng.Assert.assertTrue(Assert.java:44)\r\n\tat org.testng.Assert.assertTrue(Assert.java:54)\r\n\tat stepDefinitions.SuperAdmin_StepDefinition.follwoing_success_message_must_be_displayed_something(SuperAdmin_StepDefinition.java:199)\r\n\tat ✽.follwoing success message must be displayed \"Plant added successfully\"(file:src/test/java/features/selenium.feature:15)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});