package com.cydeo.step_definitions;

import com.cydeo.pages.DashboardPage;
import com.cydeo.pages.LoginPage;
import com.cydeo.pages.TimePage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;


public class TaskStepDefinition {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    TimePage timePage = new TimePage();


    @Given("User is on the dashboard, user login as HR user,user clicks on TASK")
    public void userIsOnTheDashboardUserLoginAsHRUserUserClicksOnTASK() {
        BrowserUtils.sleep(1);

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        BrowserUtils.sleep(1);

        loginPage.usernameInput.sendKeys(ConfigurationReader.getProperty("username"));
        BrowserUtils.sleep(1);

        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("password"));
        BrowserUtils.sleep(1);

        loginPage.loginBtn.click();
        BrowserUtils.sleep(1);

        dashboardPage.task.click();
        BrowserUtils.sleep(1);
    }


    @And("user writes a task name on the Things to do field")
    public void user_writes_a_task_name_on_the_things_to_do_field() {
        dashboardPage.taskTitleInput.sendKeys("test1");
        BrowserUtils.sleep(1);
    }
    @And("user clicks on Add more button of Responsible person field")
    public void user_clicks_on_add_more_button_of_responsible_person_field() {
        dashboardPage.addMore.click();
        BrowserUtils.sleep(1);
    }
    @And("user selects a person {string} from the list")
    public void user_selects_a_person_from_the_list(String expectedResponsiblePerson) {
        for (WebElement element : dashboardPage.recentResponsiblePerson) {
            if(element.getText().equals(expectedResponsiblePerson)){
                element.click();
            }
        }
        BrowserUtils.sleep(1);
    }

    @And("user clicks on x button to close the list")
    public void user_clicks_on_x_button_to_close_the_list() {
        dashboardPage.xButton.click();
        BrowserUtils.sleep(1);

    }
    @And("user checks the High priority check box")
    public void user_checks_the_high_priority_check_box() {
        dashboardPage.priorityCheckBox.click();
        BrowserUtils.sleep(1);

    }
    @And("user clicks on send button")
    public void user_clicks_on_send_button() {
        dashboardPage.sendButton.click();
        BrowserUtils.sleep(1);

    }
    @Then("user should see Task has been created message")
    public void user_should_see_task_has_been_created_message() {
        String eText = "Task has been created";
        String aText = dashboardPage.taskCreated.getText();

        Assert.assertEquals(eText,aText);
        BrowserUtils.sleep(1);
    }









    @And("user clicks on the Employees and departments tab")
    public void userClicksOnTheEmployeesAndDepartmentsTab() {
        dashboardPage.employeesAndDepartmentsTab.click();
        BrowserUtils.sleep(1);
    }


    @And("user selects a person {string} from the people list")
    public void userSelectsAPersonFromThePeopleList(String people) {

        for (WebElement eachPerson : dashboardPage.employeesAndDepartments) {
            System.out.println("eachPerson = " + eachPerson);
            if (eachPerson.getText().equals(people)) {
                eachPerson.click();
            }
        }
        BrowserUtils.sleep(1);
    }

    @And("user clicks on the E-mail users tap")
    public void userClicksOnTheEMailUsersTap() {
        dashboardPage.emailUsers.click();
        BrowserUtils.sleep(1);
    }

    @And("user texts a email {string}")
    public void userTextsAEmail(String emailUser) {

        dashboardPage.emailInput.sendKeys(emailUser);
        BrowserUtils.sleep(1);
    }

    @And("user selects the person {string} from the people list")
    public void userSelectsThePersonFromThePeopleList(String arg0) {
        dashboardPage.email.click();
        BrowserUtils.sleep(1);
    }


    @Then("user should see all the responsible person")
    public void userShouldSeeAllTheResponsiblePerson() {

    }


    @Then("user should see that the number in the count on the home page under the MY TASKS table.")
    public void userShouldSeeThatTheNumberInTheCountOnTheHomePageUnderTheMYTASKSTable() {
        Assert.assertTrue(dashboardPage.count.isDisplayed());
        BrowserUtils.sleep(1);
    }





    @And("user clicks on add button")
    public void userClicksOnAddButton() {
        dashboardPage.add.click();
        BrowserUtils.sleep(1);
    }


    @And("user texts {string} in to the Things to do input box of checklist")
    public void userTextsInToTheThingsToDoInputBoxOfChecklist(String text) {
        text = ConfigurationReader.getProperty("thingsToDo");
        dashboardPage.thingsToDoInput.sendKeys(text);
        BrowserUtils.sleep(1);
    }



    @And("user should see added the text on the checklist")
    public void user_should_see_added_the_text_on_the_checklist() {
        String expectedText = ConfigurationReader.getProperty("thingsToDo");
        String actualText = dashboardPage.checkList.getText().trim();

        Assert.assertEquals(expectedText,actualText);

        BrowserUtils.sleep(1);
    }









    @And("user clicks on date input box of Deadline")
    public void userClicksOnDateInputBoxOfDeadline() {
        timePage.deadLineInput.click();
        BrowserUtils.sleep(1);
    }

    @And("user clicks on month selection")
    public void userClicksOnMonthSelection() {
        timePage.months.click();
        BrowserUtils.sleep(1);
    }

    @And("user selects a month {string}")
    public void userSelectsAMonth(String expectedMonth) {

        for (WebElement eachMonth : timePage.month) {
            if (eachMonth.getText().equals(expectedMonth)){
                eachMonth.click();
            }
        }
        BrowserUtils.sleep(1);
    }

    @And("user clicks on year selection")
    public void userClicksOnYearSelection() {
        timePage.years.click();
        BrowserUtils.sleep(1);
    }

    @And("user selects a year {string}")
    public void userSelectsAYear(String expectedYear) {

        for (WebElement eachYear : timePage.year) {
            if (eachYear.getText().equals(expectedYear)){
                eachYear.click();
            }
        }
        BrowserUtils.sleep(1);
    }

    @And("user presses the arrow at the left of month selection")
    public void userPressesTheArrowAtTheLeftOfMonthSelection() {
        timePage.leftArrow.click();
        BrowserUtils.sleep(1);
    }

    @And("user presses the arrow at the right of year selection")
    public void userPressesTheArrowAtTheRightOfYearSelection() {
        timePage.rightArrow.click();
        BrowserUtils.sleep(1);
    }

    @And("user selects on a day {string}")
    public void userSelectsOnADay(String expectedDay) {
        for (WebElement eachDay : timePage.day) {
            if(eachDay.getText().equals(expectedDay)){
                eachDay.click();
            }
        }
        BrowserUtils.sleep(1);
    }


//hour input
    @And("user enters a number {string} on the hour input box")
    public void userEnterANumberOnTheHourInputBox(String h) {
        timePage.hour.sendKeys(h);
        BrowserUtils.sleep(1);

        //Assert.assertEquals(h,timePage.hour.getText());
    }

//minute input
    @And("user enters a number {string} on the minute input box")
    public void userEnterANumberOnTheMinuteInputBox(String m) {
        timePage.minute.sendKeys(m);
        BrowserUtils.sleep(1);
    }


    @And("user presses PM button")
    public void userPressesPMButton() {
        timePage.am_pm.click();
        BrowserUtils.sleep(1);
    }

    @And("user clicks Select button")
    public void userClicksSelectButton() {
        timePage.select.click();
        BrowserUtils.sleep(1);
    }

    @Then("user should see the date in order of month day year time am or pm on Deadline input box")
    public void userShouldSeeTheDateInOrderOfMonthDayYearTimeAmOrPmOnDeadlineInputBox() {
        System.out.println(timePage.deadLineText.getText());
        BrowserUtils.sleep(1);


    }


    @When("user clicks Time planning.")
    public void userClickTimePlanning() {
        timePage.timePlanning.click();
        BrowserUtils.sleep(1);
    }

    @And("user enters a number {string} in the Duration input box")
    public void userEntersANumberInTheDurationInputBox(String duration) {
        timePage.durationInput.sendKeys(duration);
        BrowserUtils.sleep(1);
    }

    @And("user clicks days at the bottom of the Duration input box")
    public void userClicksDaysAtTheBottomOfTheDurationInputBox() {
        timePage.durationDays.click();
        BrowserUtils.sleep(1);
    }

    @And("user clicks hours at the bottom of the Duration input box.")
    public void userClicksHoursAtTheBottomOfTheDurationInputBox() {
        timePage.durationHours.click();
        BrowserUtils.sleep(1);
    }

    @And("user clicks minute at the bottom of the Duration input box.")
    public void userClicksMinuteAtTheBottomOfTheDurationInputBox() {
        timePage.durationMinutes.click();
        BrowserUtils.sleep(1);
    }

    @And("user clicks finish input box")
    public void userClicksFinishInputBox() {
        timePage.timePlanning.click();
        BrowserUtils.sleep(1);
    }


    @And("user clicks on date input box of start task on")
    public void userClicksOnDateInputBoxOfStartTaskOn() {
        timePage.startTaskOn.click();
        BrowserUtils.sleep(1);
    }

    @And("user clicks on date input box of finish")
    public void userClicksOnDateInputBoxOfFinish() {
        timePage.finish.click();
        BrowserUtils.sleep(1);
    }


}









