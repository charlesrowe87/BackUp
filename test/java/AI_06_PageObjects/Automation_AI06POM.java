package AI_06_PageObjects;

import Reusable_Classes.Reusable_Annotations_Loggers;
import org.testng.annotations.Test;

public class Automation_AI06POM extends Reusable_Annotations_Loggers {
    @Test
    public void ViewBookkeepingOptionsOnHRBlock(){
        driver.navigate().to("https://www.hrblock.com");
        AI_06POM_BaseClass.viewServicesOptions().hoverOver();
        AI_06POM_BaseClass.viewServicesOptions().clickOnSmallBusinessTab();
        AI_06POM_BaseClass.viewServicesOptions().scrollToSmallBusinessOptions();
        AI_06POM_BaseClass.viewServicesOptions().getTextForSmallBusinessOptions();
    }//end of test 1

   /* @Test(dependsOnMethods = "ViewBookkeepingOptionsOnHRBlock")
    public void getTextOfSmallBusinessOptions(){
        //AI_06POM_BaseClass.viewServicesOptions().scrollToSmallBusinessOptions();
        //AI_06POM_BaseClass.viewServicesOptions().getTextForSmallBusinessOptions();
    }//end of test 2*/

}//end of class
