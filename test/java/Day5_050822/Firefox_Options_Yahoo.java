package Day5_050822;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Firefox_Options_Yahoo {
    public static void main(String[] args) {
        //declare what driver you will use
        WebDriverManager.firefoxdriver().setup();

        //set driver as full screen
        //driver.manage().window().fullscreen();

        //declare firefox binary variable
        FirefoxBinary firefoxBinary = new FirefoxBinary();

        //declare options variable to add binary
        FirefoxOptions options = new FirefoxOptions();
        //set options for headless
        //firefoxBinary.addCommandLineOptions("--headless");
        //set options for maximized
        firefoxBinary.addCommandLineOptions("start-maximized");

        options.setBinary(firefoxBinary);

        //declare driver and set options for driver
        WebDriver driver = new FirefoxDriver(options);

        //navigate to yahoo
        driver.navigate().to("https://www.yahoo.com");


    }//end of main

}//end of class
