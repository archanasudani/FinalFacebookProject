package stepDef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pageObject.FacebookLoginPage;
import static stepDef.Hooks.cfr;
import static stepDef.Hooks.myDriver;

public class FacebookPageStepDef {
    @Given("^I want to use the chrome browser$")
    public void step01() {
        System.out.println("I am in given");
    }

    @When("^I access facebook url$")
    public void step02() {
        myDriver.manage().window().maximize();
        accessFacebook();
        PageFactory.initElements(myDriver, FacebookLoginPage.class);
    }

    @Then("^I see facebook login page$")
    public void step03() {
        FacebookLoginPage.assertEmailInputDisplayed();
        FacebookLoginPage.enterEmailInput("Archanasudani@gmail.com");
        FacebookLoginPage.enterpwdInput("India1234567");
        FacebookLoginPage.myActions(myDriver);
    }
    public void accessFacebook(){
//        myDriver.get("https://www.facebook.com/");
        myDriver.get(cfr.getApplicationUrl());
//        "https://www.facebook.com/"

    }

    @When("^I entered Facebook Login Page$")
    public void step10() {
        System.out.println(" I am in WHEN" + "\n");
        myDriver.manage().window().maximize();
        myDriver.get("https://www.facebook.com//");
    }
    @And("^I entered email$")
    public void step11() {
        System.out.println(" I am in AND" + "\n");
//        driver.findElement(By.id("email")).sendKeys("archanasudani@gmail.com");
        myDriver.findElement(By.xpath("//input[@id='email']")).sendKeys("archanasudani@gmail.com");
//        cSS.capScrSht(driver,"Screen2");
    }

    @And("^I entered password$")
    public void step12() {
        System.out.println(" I am in AND" + "\n");
//        driver.findElement(By.id("pass")).sendKeys("Sai198xcvb1Moh");
        myDriver.findElement(By.xpath("//input[@type='password' and @name='pass']")).sendKeys("Sai198xcvb1Moh");
//        cSS.capScrSht(driver,"Screen3");
    }

//    @And("^I clicked on login button$")
//    public void step13() {
//        System.out.println(" I am in AND" + "\n");
//        driver.findElement(By.id("loginbutton")).click();
//    }

    @And("^I entered Firstname$")
    public void step14() {
        System.out.println(" I am in AND" + "\n");
//        driver.findElement(By.name("firstname")).sendKeys("Archana");
        myDriver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Archana");
//        cSS.capScrSht(driver,"Screen4");
    }


    @And("^I entered Surname$")
    public void step15() {
        System.out.println(" I am in AND" + "\n");
//        driver.findElement(By.name("lastname")).sendKeys("Su567");
        myDriver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Su567");
//        cSS.capScrSht(driver,"Screen5");
    }

    @And("^I entered Mobile number or email address$")
    public void step16() {
        System.out.println(" I am in AND" + "\n");
//        driver.findElement(By.name("reg_email__")).sendKeys("Su5fghj67");
        myDriver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("Su5fghj67");
//        cSS.capScrSht(driver,"Screen6");
    }

    @And("^I entered newpassword$")
    public void step17() {
        System.out.println(" I am in AND" + "\n");
//        driver.findElement(By.name("reg_passwd__")).sendKeys("Su567");
        myDriver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Su567");
//        cSS.capScrSht(driver,"Screen7");
    }

    @And("^I entered birthday_day$")
    public void step18() {
        System.out.println(" I am in AND" + "\n");
//        driver.findElement(By.name("birthday_day")).sendKeys("16");
        myDriver.findElement(By.xpath("//*[@id=\"day\"]")).sendKeys("03");
//        cSS.capScrSht(driver,"Screen8");
        Select dayday= new Select(myDriver.findElement(By.xpath("//*[@id=\"day\"]")));
//        dayday.selectByIndex(12);
//        dayday.selectByValue("10");
        dayday.selectByVisibleText("10");
//        cSS.capScrSht(driver,"Screen9");
    }


    @And("^I entered birthday_month$")
    public void step19() {
        System.out.println(" I am in AND" + "\n");
//        driver.findElement(By.xpath("//*[@id=\"month\"]")).sendKeys("march");
//        cSS.capScrSht(driver,"Screen9");
        Select dayMonth= new Select(myDriver.findElement(By.xpath("//*[@id=\"month\"]")));
        dayMonth.selectByIndex(3);
//        dayMonth.selectByValue("10");
//        dayMonth.selectByVisibleText("Oct");
//        cSS.capScrSht(driver,"Screen9");
    }
    @And("^I entered birthday_year$")
    public void step110() {
        System.out.println(" I am in AND" + "\n");
        Select dayYear= new Select(myDriver.findElement(By.xpath("//*[@id=\"year\"]")));
        dayYear.selectByValue("1967");
//                .sendKeys("1985");
        //        cSS.capScrSht(driver,"Screen10");
    }

    @Then("^I see facebook homepage$")
    public void step111() {
        System.out.println("I am in then");
        System.out.println(myDriver.getTitle());
        Assert.assertEquals(true, myDriver.getTitle().contains("Facebook"));
//            driver.quit();
        System.out.println("Close the browser\n");
    }

    @When("^I type archanasudani@gmail.com in the username input field$")
    public void step20() {
        myDriver.manage().window().maximize();
        accessFacebook();
        PageFactory.initElements(myDriver, FacebookLoginPage.class);
        System.out.println(" I am in AND" + "\n");
        myDriver.findElement(By.xpath("//input[@id='email']")).sendKeys("archanasudani@gmail.com");
    }
    @And("^I clicked on login button$")
    public void step21() {
        System.out.println(" I am in AND" + "\n");
        myDriver.findElement(By.id("loginbutton")).click();
    }
    @Then("^I see the login error message please provide a password$")
    public void step22() {
        System.out.println("I am in then");
                  }
   @When("^I enter archanasudani@gmail.com in the username input field$")
    public void step30() {
        myDriver.manage().window().maximize();
        accessFacebook();
        PageFactory.initElements(myDriver, FacebookLoginPage.class);
        System.out.println(" I am in AND" + "\n");
        myDriver.findElement(By.xpath("//input[@id='email']")).sendKeys("archanasudani@gmail.com");
    }
    @And("^I type India@1234567 in the password input field$")
    public void step31() {
        PageFactory.initElements(myDriver, FacebookLoginPage.class);
        System.out.println(" I am in AND" + "\n");
        myDriver.findElement(By.xpath("//input[@id='pass']")).sendKeys("India123456789");
    }
    @And("^I click the login button$")
    public void step32() {
        System.out.println(" I am in AND" + "\n");
//        myDriver.findElement(By.id("loginbutton")).click();
        myDriver.findElement(By.xpath("//input[@id='u_0_2']")).click();
          }
    @Then("^I see the login error message The password provided does not match the username entered$")
    public void step33() {
        System.out.println("I see the login error message please provide a password");
    }
    @When("^I give valid username in  the  username input field$")
    public void step40() {
        myDriver.manage().window().maximize();
        accessFacebook();
        PageFactory.initElements(myDriver, FacebookLoginPage.class);
        System.out.println(" I am in AND" + "\n");
        myDriver.findElement(By.xpath("//input[@id='email']")).sendKeys("archanasudani@gmail.com");
    }
    @And("^I give valid password in the password input field$")
    public void step41() {
        PageFactory.initElements(myDriver, FacebookLoginPage.class);
        System.out.println(" I am in AND" + "\n");
        myDriver.findElement(By.xpath("//input[@id='pass']")).sendKeys("***********");
    }
    @And("^I click the facebook login button$")
    public void step42() {
        System.out.println(" I am in AND" + "\n");
//        myDriver.findElement(By.xpath("//input[@id='loginbutton']")).click();
        myDriver.findElement(By.xpath("//input[@id='u_0_2']")).click();
    }
    @Then("^I see login page is launched$")
    public void step43() {
        System.out.println("FB login page launched successfully");
    }
}
