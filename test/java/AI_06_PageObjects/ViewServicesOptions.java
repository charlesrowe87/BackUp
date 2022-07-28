package AI_06_PageObjects;

import Reusable_Classes.Reusable_Actions_POM_Loggers;
import Reusable_Classes.Reusable_Annotations_Loggers;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewServicesOptions extends Reusable_Annotations_Loggers {
    //declare extent test for each page object class
    ExtentTest logger;

    //create constructor for static use
    public ViewServicesOptions(WebDriver driver){
        //page factory for page object
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotations_Loggers.logger;
    }//end of constructor

    //define all webelements using @Find concept
    @FindBy(xpath = "//*[@data-di-id='di-id-c482f2d2-be0b5b18']")
    WebElement smallBusinessTab;
    @FindBy(xpath = "//*[@class='column-control white-theme  padding-bottom-80 ']")
    WebElement smallBusinessOptions;

    public void hoverOver(){
        Reusable_Actions_POM_Loggers.mouseHover(driver,smallBusinessTab,logger,"Small Business Options");
    }//end of mouse hover action

    public void clickOnSmallBusinessTab(){
        Reusable_Actions_POM_Loggers.clickAction(driver,smallBusinessTab,logger,"Small Business Options");
    }//end of click action

    public void scrollToSmallBusinessOptions(){
        Reusable_Actions_POM_Loggers.scrollToElementAction(driver,smallBusinessOptions,logger,"Small Business Options");
    }//end of scroll action

    public void getTextForSmallBusinessOptions(){
        Reusable_Actions_POM_Loggers.getTextAction(driver,smallBusinessOptions,logger,"Small Business Options");
    }//end of get text action





}//end of class
