package Reusable_Classes;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

public class Reusable_Actions_POM_Loggers {

    //set a static timeout variable so it can cover all explicit for all methods
    public static int timeout = 30;

    //resuable function for webdriver as a return method
    public static WebDriver setDriver(){
        //setup your chromedriver with webdrivermanager
        WebDriverManager.chromedriver().setup();
        //set chrome options arguments
        ChromeOptions options = new ChromeOptions();
        //set the condition to incognito mode
        options.addArguments("incognito");
        //set the condition to maximize/fullscreen your driver
        options.addArguments("start-maximized");
        //for mac use full screen
        //options.addArguments("start-fullscreen");
        //define the webdriver I am going to use
        WebDriver driver = new ChromeDriver(options);
        return driver;
    }//end of setDriver method

    //create a mouse hover method
    public static void mouseHover(WebDriver driver,WebElement xpath,ExtentTest logger, String elementName){
        WebDriverWait wait = new WebDriverWait(driver,timeout);
        Actions actions = new Actions(driver);
        try{
            WebElement element = wait.until(ExpectedConditions.visibilityOf(xpath));
            actions.moveToElement(element).perform();
            logger.log(LogStatus.PASS,"Successfully hover on element " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to hover on element " + elementName + " " + e);
            logger.log(LogStatus.FAIL,"Unable to hover on element " + elementName + " " + e);
            getScreenShot(driver,elementName,logger);
        }
    }//end of mouseHover

    //create a click method
    public static void clickAction(WebDriver driver,WebElement xpath, ExtentTest logger, String elementName){
        WebDriverWait wait = new WebDriverWait(driver,timeout);
        try{
            WebElement element = wait.until(ExpectedConditions.visibilityOf(xpath));
            element.click();
            logger.log(LogStatus.PASS,"Successfully clicked on " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to click on element " + elementName + " " + e);
            logger.log(LogStatus.FAIL,"Unable to click on element " + elementName + " " + e);
            getScreenShot(driver,elementName,logger);
        }
    }//end of clickAction

    //create a submit method
    public static void submitAction(WebDriver driver, WebElement xpath, ExtentTest logger, String elementName){
        WebDriverWait wait = new WebDriverWait(driver,timeout);
        try{
            WebElement element = wait.until(ExpectedConditions.visibilityOf(xpath));
            element.submit();
            logger.log(LogStatus.PASS,"Successfully submit on element " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to submit on element " + elementName + " " + e);
            logger.log(LogStatus.FAIL,"Unable to submit on element " + elementName + " " + e);
            getScreenShot(driver,elementName,logger);
        }
    }//end of submit


    //create a sendkeys method
    public static void sendKeysAction(WebDriver driver,WebElement xpath, String userValue, ExtentTest logger,String elementName){
        WebDriverWait wait = new WebDriverWait(driver,timeout);
        try{
            WebElement element = wait.until(ExpectedConditions.visibilityOf(xpath));
            element.click();
            element.clear();
            element.sendKeys(userValue);
            logger.log(LogStatus.PASS,"Successfully enter user value on element " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to click on element " + elementName + " " + e);
            logger.log(LogStatus.FAIL,"Unable to click on element " + elementName + " " + e);
            getScreenShot(driver,elementName,logger);
        }
    }//end of sendkeys method

    public static void sendKeysAction2(WebDriver driver,WebElement xpath, String userValue, ExtentTest logger,String elementName){
        WebDriverWait wait = new WebDriverWait(driver,timeout);
        try{
            WebElement element = wait.until(ExpectedConditions.visibilityOf(xpath));
            element.clear();
            element.sendKeys(userValue);
            logger.log(LogStatus.PASS,"Successfully enter user value on element " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to click on element " + elementName + " " + e);
            logger.log(LogStatus.FAIL,"Unable to click on element " + elementName + " " + e);
            getScreenShot(driver,elementName,logger);
        }
    }//end of sendkeys method

    //create a getText method
    public static String getTextAction(WebDriver driver,WebElement xpath,ExtentTest logger, String elementName){
        WebDriverWait wait = new WebDriverWait(driver,timeout);
        String result = "";
        try{
            WebElement element = wait.until(ExpectedConditions.visibilityOf(xpath));
            result = element.getText();
            logger.log(LogStatus.PASS,"Successfully capture text on element " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to capture text on element " + elementName + " " + e);
            logger.log(LogStatus.FAIL,"Unable to capture text on element " + elementName + " " + e);
            getScreenShot(driver,elementName,logger);
        }
        return result;
    }//end of getTextAction method

    public static void selectByTextAction(WebDriver driver,WebElement xpath,String textValue,ExtentTest logger,String elementName){
        WebDriverWait wait = new WebDriverWait(driver,10);
        try{
            WebElement element = wait.until(ExpectedConditions.visibilityOf(xpath));
            Select elementDropdown = new Select(element);
            elementDropdown.selectByVisibleText(textValue);
            logger.log(LogStatus.PASS,"Successfully select element by text " + elementName);

        } catch (Exception e) {
            System.out.println("Unable to select on element " + elementName + " " + e);
            logger.log(LogStatus.FAIL,"Unable to select on element " + elementName + " " + e);
            getScreenShot(driver,elementName,logger);
        }
    }//end of select by text Action method

    public static void scrollToElementAction(WebDriver driver,WebElement xpath, ExtentTest logger,String elementName){
        try {
            WebDriverWait wait = new WebDriverWait(driver,timeout);
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            //declare a webelement you want to scroll into
            WebElement element = wait.until(ExpectedConditions.visibilityOf(xpath));
            jse.executeScript("arguments[0].scrollIntoView(true);",element);
            logger.log(LogStatus.PASS,"Successfully scroll into element " + elementName);

        } catch (Exception e){
            System.out.println("Unable to scroll to element " + elementName + e);
            logger.log(LogStatus.FAIL,"Unable to scroll to element " + elementName + e);
            getScreenShot(driver,elementName,logger);
        }//end of try and catch

    }//end of scrollToElementAction

    //method to capture screenshot when logger fails
    public static void getScreenShot(WebDriver driver,String imageName,ExtentTest logger) {
        try {
            String fileName = imageName + ".png";
            String directory = null;
            String snPath = null;
            directory = "src/main/java/HTML_Report/Screenshots/";
            snPath = "Screenshots//";
            File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(sourceFile, new File(directory + fileName));
            //String imgPath = directory + fileName;
            String image = logger.addScreenCapture(snPath + fileName);
            logger.log(LogStatus.FAIL, "", image);
        } catch (Exception e) {
            logger.log(LogStatus.FAIL, "Error Occured while taking SCREENSHOT!!!");
            e.printStackTrace();
        }
    }//end of getScreenshot method


}//end of class
