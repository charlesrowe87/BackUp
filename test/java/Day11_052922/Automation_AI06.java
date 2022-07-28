package Day11_052922;

import ReusableLibraries.Reusable_Actions;
import Reusable_Classes.Reusable_Actions_Loggers;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Automation_AI06 {
    //declare the local driver
    WebDriver driver;
    ExtentReports reports;
    ExtentTest logger;

    //before suite will set the webdriver
    @BeforeSuite
    public void setChromeDriver(){
        driver = Reusable_Actions.setDriver();
        //set report path
        reports = new ExtentReports("src/main/java/AI06_HTML_Reports/AI06.html",true);
    }//end of before suite annotation

    @Test(priority = 1)
    public void captureTitle(){
        logger = reports.startTest("capture title");
        //navigate to HR Block
        driver.navigate().to("https://www.hrblock.com");
        //grab title of page and make sure it matches
        Reusable_Actions_Loggers.getTitleAction(driver,logger,"Tax Preparation Services Company | H&R Block®");

        reports.endTest(logger);

    }//end of test1_captureTitle

    @Test(priority = 2)
    public void viewServices(){
        logger = reports.startTest("view services");
        //navigate to HR Block
        driver.navigate().to("https://www.hrblock.com");
        //hover to small business tab
        Reusable_Actions_Loggers.mouseHover(driver,"//*[@data-di-id='di-id-c482f2d2-be0b5b18']",logger,"Small Business tab");
        //click on small business module
        Reusable_Actions_Loggers.clickAction(driver,"//*[@data-di-id='di-id-c482f2d2-be0b5b18']",logger,"Small Business tab");
        //scroll to small business options and capture text
        Reusable_Actions_Loggers.scrollToElementAction(driver,"//*[@class='column-control white-theme  padding-bottom-80 ']",logger,"Small business options");
        Reusable_Actions_Loggers.getTextAction(driver,"//*[@class='column-control white-theme  padding-bottom-80 ']",logger,"Small business options");

        reports.endTest(logger);
    }//end of test2_viewServices

    @Test(priority = 3)
    public void bookkeepingOptions() throws InterruptedException {
        logger = reports.startTest("bookkeeping options");
        //navigate to HR Block
        driver.navigate().to("https://www.hrblock.com");
        //hover to small business tab
        Reusable_Actions_Loggers.mouseHover(driver,"//*[@data-di-id='di-id-c482f2d2-be0b5b18']",logger,"Small Business tab");
        Thread.sleep(3000);
        //click on small business module
        Reusable_Actions_Loggers.clickAction(driver,"//*[@data-di-id='di-id-c482f2d2-be0b5b18']",logger,"Small Business tab");
        //click on bookkeeping options
        Reusable_Actions_Loggers.clickAction(driver,"//*[@data-di-id='di-id-721e5659-e9a67f88']",logger,"bookkeeping options");
        //scroll to schedule free consultation
        Reusable_Actions_Loggers.scrollAction(driver,"scroll(0,7600)",logger,"Schedule free consultation");
        //click on schedule free consultation
        Reusable_Actions_Loggers.clickAction(driver,"//*[@data-di-id='di-id-56eced2-60b74fef']",logger,"Schedule free consultation");
        Thread.sleep(3000);
        //enter zip code
        Reusable_Actions_Loggers.sendKeysAction(driver,"//*[@id='ct-zip']","11225",logger,"zip code field");
        //click next module
        Reusable_Actions_Loggers.clickAction(driver,"//*[@data-di-id='di-id-7791c6ee-bfe06ebd']",logger,"next module");
        Thread.sleep(2000);
        //click time by using index method
        Reusable_Actions_Loggers.clickByIndexAction(driver,"//*[@class='appt-option-btn ng-star-inserted']",0,logger,"select time");
        Thread.sleep(2000);
        //click on next button that appears after time selection
        Reusable_Actions_Loggers.clickAction(driver,"//*[@data-di-id='di-id-ce457f2e-8513c769']",logger,"next module pop up");
        Thread.sleep(2000);
        //enter first name, last name, business name, email and phone # using sendkeys
        Reusable_Actions_Loggers.sendKeysAction(driver,"//*[@id='first-name']","Charlie",logger,"First name");
        Reusable_Actions_Loggers.sendKeysAction(driver,"//*[@id='last-name']","Rowe",logger,"Last name");
        Reusable_Actions_Loggers.sendKeysAction(driver,"//*[@id='business-name']","Pro Express",logger,"Business name");
        Reusable_Actions_Loggers.sendKeysAction(driver,"//*[@id='email']","CharlieRowe@gmail.com",logger,"Email");
        Reusable_Actions_Loggers.sendKeysAction(driver,"//*[@id='phone-num']","7185554486",logger,"Phone number");
        //verify if check box is selected or not
        Reusable_Actions_Loggers.verifyStatusOfElement(driver,"//*[@class='checkmark']",true,logger,"check box");
        //click on next function
        Reusable_Actions.clickAction(driver,"//*[@data-di-id='di-id-cc6466fb-73726ac1']","next function");
        Thread.sleep(2000);
        //capture text from appointment confirmation
        Reusable_Actions_Loggers.getTextAction(driver,"//*[@aria-labelledby='main-dialog']",logger,"Appointment confirmation");

        reports.endTest(logger);
    }//end of test2_bookkeeping options

    @Test(priority = 4)
    public void financialServices() throws InterruptedException {
        logger = reports.startTest("financial services");
        //navigate to HR Block
        driver.navigate().to("https://www.hrblock.com");
        //hover to small business tab
        Reusable_Actions_Loggers.mouseHover(driver,"//*[@data-di-id='di-id-e63205dc-a6eadccc']",logger,"Finances tab");
        Thread.sleep(2000);
        Reusable_Actions_Loggers.clickAction(driver,"//*[@data-di-id='di-id-e63205dc-a6eadccc']",logger,"Finances tab");
        Thread.sleep(2000);
        Reusable_Actions_Loggers.clickAction(driver,"//*[@data-di-id='di-id-bbb5a356-77283632']",logger,"Explore Spruce function");
        Thread.sleep(3000);
        Reusable_Actions_Loggers.clickAction(driver,"//*[@data-di-id='di-id-729ba73c-4db967d7']",logger,"Get started function");
        Reusable_Actions.switchTabByIndexAction(driver,1,"Spruce sign up tab");
        Thread.sleep(3000);
        Reusable_Actions_Loggers.clickAction(driver,"//*[@data-di-id='di-id-945cec6d-7364cd7f']",logger,"create function");
        Reusable_Actions_Loggers.sendKeysAction(driver,"//*[@id='p0v1j7o20']","abc@gmail.com",logger,"enter email field");




        reports.endTest(logger);
    }//end of test2_financialServices

    @Test(priority = 5)
    public void createAccount() throws InterruptedException {
        logger = reports.startTest("create account");
        //navigate to HR Block
        driver.navigate().to("https://www.hrblock.com");
        Reusable_Actions_Loggers.clickAction(driver,"//*[@data-di-id='di-id-50439210-ff423f53']",logger,"sign in function");
        Thread.sleep(2000);
        Reusable_Actions_Loggers.clickAction(driver,"//*[@data-di-id='di-id-9c67d708-716b8759']",logger,"create account function");
        Thread.sleep(3000);
        Reusable_Actions_Loggers.sendKeysAction(driver,"//*[@id='email']","abc@gmail.com",logger,"email field");
        Reusable_Actions_Loggers.sendKeysAction(driver,"//*[@id='mobile']","5552221222",logger,"number field");
        Reusable_Actions_Loggers.sendKeysAction(driver,"//*[@id='userName']","Test!123",logger,"username field");
        Reusable_Actions_Loggers.clickAction(driver,"//*[@id='showhideNew']",logger,"next function");
        Thread.sleep(3000);




        reports.endTest(logger);
    }//end of test2_create account

    @Test(priority = 6)
    public void careerOptions() throws InterruptedException {
        logger = reports.startTest("career options");
        //navigate to HR Block
        driver.navigate().to("https://www.hrblock.com");
        Reusable_Actions_Loggers.scrollToElementAction(driver,"//*[@data-di-id='di-id-e23852e0-3e619a83']",logger,"Career function");
        Reusable_Actions_Loggers.clickAction(driver,"//*[@data-di-id='di-id-e23852e0-3e619a83']",logger,"Career function");
        Thread.sleep(2000);
        Reusable_Actions_Loggers.clickAction(driver,"//*[@data-di-id='di-id-36bc250d-1dcf1407']",logger,"Job Opportunity function");
        Reusable_Actions_Loggers.clickAction(driver,"//*[@data-di-id='di-id-3bce6b2-140079fa']",logger,"Corporate Opportunities function");
        Reusable_Actions_Loggers.clickAction(driver,"//*[@data-di-id='di-id-96307edb-48befcbb']",logger,"View Corporate jobs function");
        Thread.sleep(2000);
        Reusable_Actions_Loggers.sendKeysAction(driver,"//*[@id='initialSearchBox__25']","Automation",logger,"Job search field");
        Reusable_Actions_Loggers.clickAction(driver,"//*[@id='buttonSearchStatus']",logger,"search function");
        Thread.sleep(2000);








        reports.endTest(logger);
    }//end of test2_viewServices

    @Test(priority = 7)
    public void taxCalculator(){
        logger = reports.startTest("tax calculator");
        //navigate to HR Block
        driver.navigate().to("https://www.hrblock.com");



        reports.endTest(logger);
    }//end of test2_viewServices




    @AfterSuite
    public void quitSession(){
        driver.quit();
        reports.flush();
    }//end of after suite annotation

}//end of class