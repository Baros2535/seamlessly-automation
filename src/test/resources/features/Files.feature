@files
Feature: Files Functionalities

  Background:
    Given the user is logged in

  Scenario: User can add any file to favorites from its own three dots menu
    When the user clicks on an existing file's add to favorites under its own three dots menu
    And the user navigates to favorites tab
    Then the user can verify that the file has been added under the favorites tab
  @wip
  Scenario: User can rename any file from its own three dots menu
    When the user clicks on an existing file's rename under its own three dots menu
    And the user renames the file
    Then the user can verify that the file has been renamed

  Scenario: User can put some comments on any file from the file details menu opened right side
    When the user clicks on an existing file's details from its own three dots menu
    And the user navigates to comments tab
    And put some comments
    Then the user can verify that comment has been added

  Scenario: User can delete the comments made on any file from the the file details menu opened rigth side
    When the user clicks on an existing file's details from its own three dots menu
    And the user navigates to comments tab
    And click on any comment's own three dot menu and select delete
    Then the user can verify that comment has been deleted

