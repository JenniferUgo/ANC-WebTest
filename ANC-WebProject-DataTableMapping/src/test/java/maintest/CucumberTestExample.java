package maintest;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import utilities.User;

import java.util.ArrayList;


public class CucumberTestExample {

    private WebDriver driver;

//    @BeforeTest
//    public void setUp(){
//        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//    }
    @Given("My browser is up and running and website is loaded")
    public void my_browser_is_up_and_running_and_website_is_loaded() {
        // Write code here that turns the phrase above into concrete actions
    }
    @Then("Test using following data")
    public void test_using_following_data(DataTable dataTable) {
        int numberOfRows = dataTable.height();
        int numberOfColumns = dataTable.width();

        //How to run elements one by one
        String firstNameFirstRow = dataTable.row(0).get(0);
        String secondNameFirstRow = dataTable.row(0).get(1);
        String email = dataTable.row(0).get(2);
        System.out.println("First Name: " + firstNameFirstRow + ", Second Name: " + secondNameFirstRow + ", Email: " + email);

        //How to run it in a loop
        for (int i = 0; i < dataTable.height(); i++){
            String firstName = dataTable.row(i).get(0);
            String secondName = dataTable.row(i).get(1);
            String emailAddress = dataTable.row(i).get(2);
            System.out.println("First Name: " + firstName + ", Second Name: " + secondName + ", Email Address: " + emailAddress);
            System.out.println("___________");
        }
        // Same as above code, but With data object model

        //Create a list of users so that I can add my user object to it
        ArrayList<User> myUserList = new ArrayList<User>();

        //Map the data table into an Object. In the case a User Object
        for (int i = 0; i < dataTable.height(); i++){
            String firstName = dataTable.row(i).get(0);
            String secondName = dataTable.row(i).get(1);
            String emailAddress = dataTable.row(i).get(2);

            //How to create new object
            User myUser = new User(firstName, secondName, emailAddress);
            myUserList.add(myUser); //Add my user object into myUserlist

            //for each loop --> For each element in the Array, run this (no condition needed)
            for (User user: myUserList) {
                System.out.println(user.getUserFirstName());
                System.out.println(user.getUserSecondName());
                System.out.println(user.getUserEmail());
                System.out.println("_____Data Object Loop_____");
                //System.out.println("First Name: " + myUser.getUserFirstName() + ", Second Name: " + myUser.getUserSecondName() + ", Email Address: " + myUser.getUserEmail());
            }
        }
    }

}