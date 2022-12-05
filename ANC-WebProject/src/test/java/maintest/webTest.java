package maintest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class webTest {

    private WebDriver driver;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
    }
    @Test (priority = 0)
    public void negativeTest() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amaninja-concept2.myshopify.com/password");
        driver.findElement(By.id("password")).sendKeys("anything!!");
        WebElement buttonEnter = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/form/button"));
        buttonEnter.click();
        Thread.sleep(2000);
    }

    @Test (priority = 1)
    public void positiveTest() throws InterruptedException {
        driver.get("https://amaninja-concept2.myshopify.com/password");
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.clear();
        passwordField.sendKeys("Amaninja!1");
        WebElement buttonEnter = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/form/button"));
        buttonEnter.click();
        Thread.sleep(2000);
    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
