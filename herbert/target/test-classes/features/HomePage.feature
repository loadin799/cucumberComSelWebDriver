Feature: Check the Contato page

  Background:
    Given User access the Amaricanas Website

    @Case1
    Scenario: User Search Phone
      Given User Write "iphone" on field for Search
      And User Click For Search
      Then User views "iphone" For Title Search


