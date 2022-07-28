package AI_06_PageObjects;

import Reusable_Classes.Reusable_Annotations_Loggers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AI_06POM_BaseClass extends Reusable_Annotations_Loggers {
    public AI_06POM_BaseClass(WebDriver driver){
        PageFactory.initElements(driver,this);
    }//end of constructor class

    //create static reference for viewServicesOptions
    public static ViewServicesOptions viewServicesOptions(){
        ViewServicesOptions viewServicesOptions = new ViewServicesOptions(driver);
        return viewServicesOptions;
    }//end of viewServicesOptions method




}//end of class
