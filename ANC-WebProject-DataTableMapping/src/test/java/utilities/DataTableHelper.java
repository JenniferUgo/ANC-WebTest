package utilities;

import io.cucumber.datatable.DataTable;

import java.util.ArrayList;

public class DataTableHelper {
    public static void printDataTableValues(DataTable dataTable) {
        for (int i = 0; i < dataTable.height(); i++) {
            String firstName = dataTable.row(i).get(0);
            String secondName = dataTable.row(i).get(1);
            String emailAddress = dataTable.row(i).get(2);

            System.out.println("First Name: " + firstName + ", Second Name: " + secondName + ", Email Address: " + emailAddress);

        }
    }
    public static ArrayList<User> getUserList(DataTable dataTable) {
        ArrayList<User> myUserList = new ArrayList<User>();

        //Map the data table into an Object. In the case a User Object
        for (int i = 0; i < dataTable.height(); i++) {
            String firstName = dataTable.row(i).get(0);
            String secondName = dataTable.row(i).get(1);
            String emailAddress = dataTable.row(i).get(2);

            //How to create new object
            User myUser = new User(firstName, secondName, emailAddress);
            myUserList.add(myUser); //Add my user object into myUserlist

        }
        return myUserList;
    }
    public static void printMyUserList(ArrayList<User> myUserList) {

        for (User user : myUserList) {
            System.out.println(user.getUserFirstName());
            System.out.println(user.getUserSecondName());
            System.out.println(user.getUserEmail());
            System.out.println("_____Data Object Loop_____");
            //System.out.println("First Name: " + myUser.getUserFirstName() + ", Second Name: " + myUser.getUserSecondName() + ", Email Address: " + myUser.getUserEmail());
        }

    }
}
