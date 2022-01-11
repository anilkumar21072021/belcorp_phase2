import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.XLUtils;

import java.io.IOException;

public class AnilTest {
    public static void main(String[] args) throws Exception {
        System.out.println("Testing the program");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.get("https://stackoverflow.com/questions/57830523/selenium-webdrivermanager");
        //driver.get(XLUtils.getData("testdata" ,1 , 1 ));
        driver.get(XLUtils.getCellData("testdata" ,1, 0));
        driver.close();
        System.out.println("Test has passed");
    }
}
