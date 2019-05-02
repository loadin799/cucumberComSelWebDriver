$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HomePage.feature");
formatter.feature({
  "line": 1,
  "name": "Check the Contato page",
  "description": "",
  "id": "check-the-contato-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3216623644,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User access the Amaricanas Website",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageSteps.userAccessTheAmericanasWebsite()"
});
formatter.result({
  "duration": 3586005122,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "User check the submit button with a empty form",
  "description": "",
  "id": "check-the-contato-page;user-check-the-submit-button-with-a-empty-form",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@Case1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User clicks on moto g7",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User views \"família moto g7. importa para você.TJ\" on screen moto g7",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.userClickOnMotoG7()"
});
formatter.result({
  "duration": 10093694034,
  "error_message": "java.lang.NullPointerException\n\tat support.DriverQA.click(DriverQA.java:108)\n\tat pages.HomePage.clickMotoG7(HomePage.java:52)\n\tat steps.HomePageSteps.userClickOnMotoG7(HomePageSteps.java:19)\n\tat ✽.Given User clicks on moto g7(HomePage.feature:7)\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "família moto g7. importa para você.TJ",
      "offset": 12
    }
  ],
  "location": "HomePageSteps.userValidateStringMotoG7(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.write("url: https://www.americanas.com.br/");
formatter.after({
  "duration": 787183457,
  "status": "passed"
});
});