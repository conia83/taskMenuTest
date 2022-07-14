package com.cydeo.step_definitions;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

//in the class we will be able to pass pre-&post-conditions to each scenario and each step

public class Hooks {

    // import from io.cucumber.java, not from junit
    //@Before
    public void setupScenario(){
        System.out.println("======== Setting up browser using cucumber @Before");
    }

    //@Before (value = "@Login") // only be running before my scenarios that have the @Login tag that I provide
    public void setupScenarioForLogin(){
        System.out.println("======== Setting up browser using cucumber @Before");
    }

    @After
    public void teardownScenario(Scenario scenario){

        byte[] screenshot =((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
                            //down casting
        scenario.attach(screenshot,"image/png",scenario.getName());


        BrowserUtils.sleep(1);

        Driver.closeDriver();
       // System.out.println("======== Closing browser using cucumber @After");
       // System.out.println("======== Scenario ended/ Take screenshot if failed ");

        BrowserUtils.sleep(1);
    }


    //@BeforeStep
    public void setupStep(){
        System.out.println("-------- Applying setup using @BeforeStep");

    }


    //@AfterStep
    public void afterStep(){
        System.out.println("-------- Applying tearDown using @AfterStep");

    }




}
