@LUE-1015
Feature: Task functionality test

  User Story:
  As a user, I should be able to assign tasks under Quick Navigate Menu.

  Background: user on the dashboard and click TASK tap
    Given User is on the dashboard, user login as HR user,user clicks on TASK

  @LUE-988
  Scenario: 06-01: HR user create a "High priority" tasks with the mandatory fields
    And user writes a task name on the Things to do field
    And user clicks on Add more button of Responsible person field
    And user selects a person "hr12@cybertekschool.com" from the list
    And user clicks on x button to close the list
    And user checks the High priority check box
    And user clicks on send button
    Then user should see Task has been created message

  @LUE-990
  Scenario: 06-02: HR user assign a task to more than one user
    When user clicks on Add more button of Responsible person field
    And user selects a person "hr12@cybertekschool.com" from the list
    And user clicks on the Employees and departments tab
    And user selects a person "hr76@cybertekschool.com" from the people list
    And user clicks on the E-mail users tap
    And user texts a email "helpdesk22@cybertekschool.com"
    And user selects the person "helpdesk22@cybertekschool.com" from the people list
    And user writes a task name on the Things to do field
    And user clicks on send button
    Then user should see all the responsible person


  @LUE-991
  Scenario: 06-03:  When task(s) is(are) created, see the number in the count on the home page under the MY TASKS table.
    And user writes a task name on the Things to do field
    And user clicks on send button
    Then user should see that the number in the count on the home page under the MY TASKS table.




  @LUE-992
  Scenario: 06-04 : Checklist be added while creating a task
    And user clicks on add button
    And user texts "test" in to the Things to do input box of checklist
    And user clicks on add button
    Then user should see added the text on the checklist


  @LUE-993
  Scenario: 06-05: Deadline be added while creating a task.
    And user clicks on date input box of Deadline
    And user clicks on month selection
    And user selects a month "August"
    And user clicks on year selection
    And user selects a year "2023"
    And user presses the arrow at the left of month selection
    And user presses the arrow at the right of year selection
    And user selects on a day "13"
    And user enters a number "11" on the hour input box
    And user enters a number "30" on the minute input box
    And user presses PM button
    And user clicks Select button
    Then user should see the date in order of month day year time am or pm on Deadline input box

  @LUE-994
  Scenario: 06-06: Time planning function
    When user clicks Time planning.
    And user clicks on date input box of start task on
    And user clicks on month selection
    And user selects a month "June"
    And user clicks on year selection
    And user selects a year "2021"
    And user presses the arrow at the left of month selection
    And user presses the arrow at the right of year selection
    And user selects on a day "13"
    And user enters a number "09" on the hour input box
    And user enters a number "30" on the minute input box
    And user presses PM button
    And user clicks Select button
    And user should see the date in order of month day year time am or pm on Deadline input box
    And user enters a number "5" in the Duration input box
    And user clicks days at the bottom of the Duration input box
    And user clicks hours at the bottom of the Duration input box.
    And user clicks minute at the bottom of the Duration input box.
    And user clicks on date input box of finish
    And user selects a year "2023"
    And user presses the arrow at the left of month selection
    And user presses the arrow at the right of year selection
    And user selects on a day "13"
    And user enters a number "11" on the hour input box
    And user enters a number "30" on the minute input box
    And user presses PM button
    And user clicks Select button
    Then user should see the date in order of month day year time am or pm on Deadline input box
