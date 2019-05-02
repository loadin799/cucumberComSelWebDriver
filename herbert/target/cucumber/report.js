$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HomePage.feature");
formatter.feature({
  "line": 1,
  "name": "Check the Contato page",
  "description": "",
  "id": "check-the-contato-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2505362971,
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
  "duration": 3546156344,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "User Search Phone",
  "description": "",
  "id": "check-the-contato-page;user-search-phone",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@Case1"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User Write \"iphone\" on field for Search",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User Click For Search",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User views \"iphone\" For Title Search",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "iphone",
      "offset": 12
    }
  ],
  "location": "HomePageSteps.userWriteOnFieldSearch(String)"
});
formatter.result({
  "duration": 688313993,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.userClickForSearch()"
});
formatter.result({
  "duration": 4517497760,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "iphone",
      "offset": 12
    }
  ],
  "location": "HomePageSteps.userCheckTitleForSearch(String)"
});
formatter.result({
  "duration": 268383910,
  "status": "passed"
});
formatter.after({
  "duration": 139624388,
  "status": "passed"
});
});