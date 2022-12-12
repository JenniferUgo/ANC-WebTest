package maintest;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import java.util.List;


public class CucumberTestExample {

    private WebDriver driver;

    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    }
    @Given("that browser is up and running")
    public void that_browser_is_up_and_running() {
        // Write code here that turns the phrase above into concrete actions
        driver = new ChromeDriver();
    }
    @And("user enters url {string}")
    public void user_enters_url(String url) {
        driver.get(url);
    }
    @And("inputs Password with DataTable")
    public void inputs_password_with_data_table(io.cucumber.datatable.DataTable dataTable) {
        List<List<String>> data=dataTable.cells();
        driver.findElement(By.id("password")).sendKeys(data.get(0).get(0));
        driver.findElement(By.id("password")).sendKeys(data.get(0).get(1));
    }
    @And("clicks on Login button")
    public void clicks_on_login_button() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/form/button")).click();
        Thread.sleep(2000);
    }
    @Then("user should be able to login successfully")
    public void user_should_be_able_to_login_successfully() throws InterruptedException {
        String expectedUrl = ("amaninja-concept2.myshopify.com");
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.contains(expectedUrl)){
            System.out.println("Login Successful");
        } else {
            System.out.println("Login not Successful");
        }
        driver.quit();
    }



}