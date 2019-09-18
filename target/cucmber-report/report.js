$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Abhay Deshpande/eclipse-workspace/cucumberbddArtifact/src/test/java/Features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Login feature",
  "description": "",
  "id": "free-crm-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Free CRM Login Test Scenario",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "User is Already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Title of Login Page is CRM",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "User Enters \"abhay.deshpande220@gmail.com\" and \"ABhi@1392\"",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "User clicks on login Button",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User is on Home Page",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStepDefination.User_is_Already_on_Login_Page()"
});
formatter.result({
  "duration": 51686018000,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefination.Title_of_Login_Page_is_CRM()"
});
formatter.result({
  "duration": 21853800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abhay.deshpande220@gmail.com",
      "offset": 13
    },
    {
      "val": "ABhi@1392",
      "offset": 48
    }
  ],
  "location": "loginStepDefination.User_Enters_Username_and_Password(String,String)"
});
formatter.result({
  "duration": 1712832000,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefination.User_clicks_on_login_Button()"
});
formatter.result({
  "duration": 88322000,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefination.User_is_on_Home_page()"
});
formatter.result({
  "duration": 9227200,
  "status": "passed"
});
});