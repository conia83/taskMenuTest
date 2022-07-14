package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TimePage {

    public TimePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@class='task-options-inp']")
    public WebElement deadLineInput;

    @FindBy(xpath = "//a[@class='bx-calendar-top-month']")
    public WebElement months;

    @FindBy(xpath = "//span[@class='bx-calendar-month']")
    public List<WebElement> month;

    @FindBy(xpath = "//a[@class='bx-calendar-top-year']")
    public WebElement years;

    @FindBy(xpath = "//span[@class='bx-calendar-year-number']")
    public List<WebElement> year;

    @FindBy(xpath = "//a[@class='bx-calendar-left-arrow']")
    public WebElement leftArrow;


    @FindBy(xpath = "//a[@class='bx-calendar-right-arrow']")
    public WebElement rightArrow;

    @FindBy(xpath = "//a[starts-with(@class,'bx-calendar-cell')]")
    public List<WebElement> day;

    @FindBy(xpath = "//input[@class='bx-calendar-form-input'][1]")
    public WebElement hour;


    @FindBy(xpath = "//input[@class='bx-calendar-form-input'][2]")
    public WebElement minute;


    @FindBy(xpath = "//span[@class='bx-calendar-AM-PM-text']")
    public WebElement am_pm;

    @FindBy(xpath= "/html/body/div[8]/div/div/div[5]/a[1]/span[2]")
    public WebElement select;

    @FindBy(xpath = "/html/body/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/table/tbody/tr/td/div/div[2]/div/div[1]/div/div/div[3]/div/div/form/div[2]/div[6]/div/div/div/div[3]/div[2]/div/div[2]/div[1]/div/div[2]/span/input[2]")
    public WebElement deadLineText;




    //07/21/2022 11:00 am

    @FindBy(xpath = "//span[@data-target='date-plan']")
    public WebElement timePlanning;


    @FindBy(xpath = "/html/body/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/table/tbody/tr/td/div/div[2]/div/div[1]/div/div/div[3]/div/div/form/div[2]/div[6]/div/div/div/div[3]/div[2]/div/div[2]/div[1]/div/div[2]/span/input[1]")
    public WebElement startTaskOn;


    @FindBy(xpath = "/html/body/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/table/tbody/tr/td/div/div[2]/div/div[1]/div/div/div[3]/div/div/form/div[2]/div[6]/div/div/div/div[3]/div[2]/div/div[2]/div[1]/div/div[4]/span/input[1]")
    public WebElement finish;

    @FindBy(xpath = "/html/body/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/table/tbody/tr/td/div/div[2]/div/div[1]/div/div/div[3]/div/div/form/div[2]/div[6]/div/div/div/div[3]/div[2]/div/div[1]/span[1]/span/input[1]")
    public WebElement durationInput;

    @FindBy(xpath = "//span[@data-unit='days']")
    public WebElement durationDays;

    @FindBy(xpath = "//span[@data-unit='hours']")
    public WebElement durationHours;

    @FindBy(xpath = "//span[@data-unit='mins']")
    public WebElement durationMinutes;


}
