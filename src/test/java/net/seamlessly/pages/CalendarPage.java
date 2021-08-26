package net.seamlessly.pages;

import net.seamlessly.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CalendarPage extends BasePage{



    @FindBy(xpath = "(//div[@class='action-item'])[1]")
    public WebElement threeDotIcon;

    @FindBy(xpath = "//span[@class='action-button__icon icon-view-day']")
    public WebElement dayButton;

    @FindBy(xpath = "//span[@class='action-button__icon icon-view-week']")
    public WebElement weekButton;

    @FindBy(xpath = "//span[@class='action-button__icon icon-view-module']")
    public WebElement monthButton;

    @FindBy(xpath = "//button[@class='button primary new-event']")
    public WebElement newEventButton;

    @FindBy(xpath = "//div[@class='datepicker-button-section']")
    public WebElement datePickerButton;



}






