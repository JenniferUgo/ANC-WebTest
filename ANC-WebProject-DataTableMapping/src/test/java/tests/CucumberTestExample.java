package tests;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.DataTableHelper;
import utilities.User;

import java.sql.Driver;
import java.util.ArrayList;


public class CucumberTestExample {
    //ArrayList<User> myUserList = new ArrayList<User>();

    private WebDriver driver;
    WebDriver webDriver = new ChromeDriver();

//    @BeforeTest
//    public void setUp(){
//        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//    }
    @Given("My browser is up and running and website is loaded")
    public void my_browser_is_up_and_running_and_website_is_loaded() {
        // Write code here that turns the phrase above into concrete actions
        AboutUsPageObject myAboutUsPageObject = new AboutUsPageObject(webDriver);
        myAboutUsPageObject.clickHomeLink();
        myAboutUsPageObject.clickShopLink();
        myAboutUsPageObject.clickContactLink();
        myAboutUsPageObject.selectTabOneText();
        myAboutUsPageObject.selectTabTwoText();
        myAboutUsPageObject.selectTabThreeText();
        myAboutUsPageObject.clickBackToShopButton();
    }
    @Then("Test using following data")
    public void test_using_following_data(DataTable dataTable) {

        DataTableHelper dataTableHelper = new DataTableHelper();
        DataTableHelper.printDataTableValues(dataTable);
        ArrayList<User> myUserList = DataTableHelper.getUserList(dataTable); //this will return the list of users
        DataTableHelper.printMyUserList(myUserList);

//        int numberOfRows = dataTable.height();
//        int numberOfColumns = dataTable.width();

        //How to run elements one by one
        String firstNameFirstRow = dataTable.row(0).get(0);
        String secondNameFirstRow = dataTable.row(0).get(1);
        String email = dataTable.row(0).get(2);
        System.out.println("First Name: " + firstNameFirstRow + ", Second Name: " + secondNameFirstRow + ", Email: " + email);

        //How to run it in a loop
        for (int i = 0; i < dataTable.height(); i++) {
            String firstName = dataTable.row(i).get(0);
            String secondName = dataTable.row(i).get(1);
            String emailAddress = dataTable.row(i).get(2);
            System.out.println("First Name: " + firstName + ", Second Name: " + secondName + ", Email Address: " + emailAddress);
            System.out.println("___________");
        }
        // Same as above code, but With data object model

        //Create a list of users so that I can add my user object to it
        myUserList = DataTableHelper.getUserList(dataTable);

        //Map the data table into an Object. In this case a User Object
        for (int i = 0; i < dataTable.height(); i++) {
            String firstName = dataTable.row(i).get(0);
            String secondName = dataTable.row(i).get(1);
            String emailAddress = dataTable.row(i).get(2);

            //How to create new object
            User myUser = new User(firstName, secondName, emailAddress);
            myUserList.add(myUser); //Add my user object into myUserlist
        }
        //for each loop --> For each element in the Array, run this (no condition needed)

    }


}