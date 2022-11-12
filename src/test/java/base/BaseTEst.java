package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import pages.HomePage;

import java.util.List;

public class BaseTEst {
    // to use add web-driver to start the browsers
    private WebDriver driver;
    // to start handle the project and make use of it
    protected HomePage homePage;

    @BeforeClass
    public void setUp() {
        /*
         * we use this line to call web-driver i can change it to what i  need if fire fox or chorme or  any broswer
         */
        System.setProperty("webdriver.chrome.driver", "/home/zik/pratice/projectAutomate1/.idea/resources/chromedriver");
// to initiate the browser if not chrome follow the same steps
        driver = new ChromeDriver();
        // to lunch the browser
        driver.get("https://the-internet.herokuapp.com/");
        //driver.manage().window().fullscreen();
        /*
         * to add instance of home page to use it to navigate for all pages
         */
        homePage = new HomePage(driver);

        System.out.println(driver.getTitle());
        /*
         * there 2 type of web element signle element or list as in 2 example  the list it use get more than one elements
         */
        WebElement inputlink = driver.findElement(By.linkText("Inputs"));
        List<WebElement> count = driver.findElements(By.tagName("a"));
        System.out.println(count.stream().count());

        System.out.println(count.size());
        //inputink.click();
//    WebElement test = driver.findElement(By.linkText("Example 1: Menu Element"));
// we need to use the assert equal to make sure
// TO MAKE SURE THE BROSWER IS CLOSE
        // driver.quit();
        /*
         * to control the size of window
         */

    }

    @AfterClass
    public void clossSreen() {
       // driver.quit();
    }
}
