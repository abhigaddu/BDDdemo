$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/Feature/login.feature");
formatter.feature({
  "line": 1,
  "name": "Login to the Application",
  "description": "",
  "id": "login-to-the-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login to Application",
  "description": "",
  "id": "login-to-the-application;login-to-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "the application url google.com",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters google in search bar",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User will be able to see google text",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.User_Enters_Application_Url()"
});
formatter.result({
  "duration": 4696533827,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.User_enters_google()"
});
formatter.result({
  "duration": 3609803193,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.User_validates_text()"
});
formatter.result({
  "duration": 167458833,
  "status": "passed"
});
});