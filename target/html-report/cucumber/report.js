$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/feature/blueair.feature");
formatter.feature({
  "name": "checking the login funtionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verifying login funtionality by vaild credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is in login page",
  "keyword": "Given "
});
formatter.step({
  "name": "user given the login credential \"\u003cuserName\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user given the \"\u003cpassWord\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "user clicks the loginbutton",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userName",
        "passWord"
      ]
    },
    {
      "cells": [
        "vijay",
        "92048290384"
      ]
    },
    {
      "cells": [
        "ram",
        "023840834"
      ]
    },
    {
      "cells": [
        "vikram",
        "934r8394834"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verifying login funtionality by vaild credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is in login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_is_in_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user given the login credential \"vijay\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_given_the_login_credential(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user given the \"92048290384\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_given_the(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks the loginbutton",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verifying login funtionality by vaild credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is in login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_is_in_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user given the login credential \"ram\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_given_the_login_credential(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user given the \"023840834\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_given_the(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks the loginbutton",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verifying login funtionality by vaild credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is in login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_is_in_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user given the login credential \"vikram\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_given_the_login_credential(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user given the \"934r8394834\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_given_the(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks the loginbutton",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "passed"
});
});