Feature: User Folder view functionality

  Background: the user is logged in

    Scenario:
    When the user is on dashboard
    And the user clicks on files
    And the user clicks on name
    Then the view of folders should change by name

      Scenario:
        When the user is on dashboard
        And the user clicks on files
        And the user clicks on size
        Then the order of the folders should change by size


        Scenario:
          When the user is on dashboard
          And the user clicks on files
          And the user clicks on modified
          Then the order of the folders should change by date


          Scenario: User can change the folder view

            When the user is on dashboard
            And the user clicks on files
            And the user clicks on toggle view
            Then the order of the folders should change by view