package pageObject;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.net.PasswordAuthentication;

public class FacebookLoginPage {
    @FindBy(id = "email")
    static WebElement emailInput;

    @FindBy(id = "pass")
    static WebElement pwdInput;

    @FindBy(xpath = "//input[@name='firstname']")
    static WebElement firstNameInput;

    @FindBy(id = "u_0_l")
    static WebElement surnameInput;

    @FindBy(id= "loginbutton")
    static WebElement loginButton;

    @FindBy(xpath = "//select[@aria-label='Day']")
    static WebElement dayDropDown;

    @FindBy(xpath = "//select[@aria-label='Month']")
    static WebElement monthDropDown;

    @FindBy(xpath = "//select[@aria-label='Year']")
    static WebElement yearDropDown;



    public static void assertEmailInputDisplayed(){
        Assert.assertEquals(true,emailInput.isDisplayed());
    }
    public static void assertPwdInputDisplayed(){ Assert.assertEquals(true, pwdInput.isDisplayed());    }


    public static void enterEmailInput(String emailId){
        emailInput.sendKeys(emailId);
    }
    public static void enterpwdInput(String pwdId){
        pwdInput.sendKeys(pwdId);
    }

    public static void selectDayFromDropdown(String dayString){
        Select daySelect = new Select(dayDropDown);

        daySelect.selectByValue(dayString);
    }

    public static void selectMonthFromDropdown(String monthString){
        Select monthSelect = new Select(monthDropDown);
//        monthSelect.selectByIndex(monthIndex);
        monthSelect.selectByValue(monthString);
    }

    public static void selectYearFromDropdown(String yearString){
        Select yearSelect = new Select(yearDropDown);
//        monthSelect.selectByIndex(monthIndex);
        yearSelect.selectByValue(yearString);
//        yearSelect.selectByVisibleText(yearString);
//        System.out.println(yearSelect.selectByIndex(1));
    }

    public static void myActions(WebDriver driver){

        Actions actions = new Actions(driver);
        Action builder = actions
                .moveToElement(firstNameInput)
                .click()
                .sendKeys("Archana")
                .sendKeys(Keys.TAB)
                .sendKeys("Sudani")
                .sendKeys(Keys.TAB)
                .sendKeys("123456789")
                .build();
        builder.perform();

    }


}


