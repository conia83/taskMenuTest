package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
;import java.util.List;

public class DashboardPage {

    public DashboardPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//*[@id='feed-add-post-form-tab-tasks']//span")
    public WebElement task;

    @FindBy(xpath = "//input[@data-bx-id='task-edit-title']")
    public WebElement taskTitleInput;

    @FindBy(linkText ="Add more" )
    public WebElement addMore;


    @FindBy(xpath = "//div[@class='bx-finder-box-item-t7-info']" )
    public List<WebElement> recentResponsiblePerson;

    @FindBy(xpath = "//span[@class='popup-window-close-icon']")
    public WebElement xButton;

    @FindBy(xpath= "//input[@id='tasks-task-priority-cb']")
    public WebElement priorityCheckBox;

    @FindBy(id = "blog-submit-button-save")
    public WebElement sendButton;

    @FindBy(xpath = "//*[text() = 'The task name is not specified.']")
    public WebElement taskNameErrorMessage;


    @FindBy(xpath = "//span[@class='js-id-tdp-mem-sel-is-item-delete task-form-field-item-delete']")
    public WebElement deleteResponsiblePerson;

    @FindBy(xpath = "//*[text() = 'A user specified in the field \"Responsible Person\" was not found.']")
    public WebElement responsiblePersonErrorMessage;

    @FindBy(xpath = "//div[text()='Task has been created']")
    public WebElement taskCreated;




    @FindBy(linkText = "Employees and departments")
    public WebElement employeesAndDepartmentsTab;

    @FindBy(xpath = "//div[@class='bx-finder-company-department-employee-name']")
    public List<WebElement> employeesAndDepartments;

    @FindBy(linkText = "E-mail users")
    public WebElement emailUsers;

    @FindBy(xpath= "//input[starts-with(@id,'name-selector-')]")
    public WebElement emailInput;

    @FindBy(xpath = "//div[@class='bx-finder-box-item-t7-name']")
    public WebElement email;


    @FindBy(xpath = "//span[@class='task-item-index']")
    public WebElement count;



    @FindBy(xpath ="//span[@class='js-id-checklist-is-open-form task-dashed-link-inner']" )
    public WebElement add;

    @FindBy(xpath = "//input[@maxlength='255']")
    public WebElement thingsToDoInput;

    @FindBy(xpath = "//span[@class='js-id-checklist-is-i-title ']")
    public WebElement checkList;




}

