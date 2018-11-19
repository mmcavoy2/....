/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 * This class creates an object used for login .
 *
 * @author mjwat
 * @Date 01/05/2018
 */
public class Login {

    private String inputName;
    private String inputPassword;

    public Login(String inputName, String inputPassword) {
        this.inputName = inputName;
        this.inputPassword = inputPassword;
    }//constructor

    /**
     * This method decides which table to search and also checks if the input
     * password is equal to the password assigned to the account name
     *
     * @return
     */
    public boolean validateLogin() {
        boolean answer = false;
        String prefix = "";
        String tempPrefix = this.inputName;

        for (int index = 0; index < 3; index++) {
            prefix += tempPrefix.charAt(index);
        }

        System.out.println(tempPrefix);
        System.out.println(prefix);

        if (prefix.equalsIgnoreCase("bdr")) {
            if (this.inputPassword.equalsIgnoreCase(findDatabasePasswordBuilder())) {

                answer = true;
            }

        } else if (prefix.equalsIgnoreCase("cor")) {
            if (this.inputPassword.equalsIgnoreCase(findDatabasePasswordCourier())) {

                answer = true;
            }

        } else if (prefix.equalsIgnoreCase("man")) {
            if (this.inputPassword.equalsIgnoreCase(findDatabasePasswordManager())) {

                answer = true;
            }

        }
        return answer;
    }//validateLogin

    /**
     * *
     * Finds the database password assoiated to the input builder.
     *
     * @auhor Michael Watters
     * @date 02/05/2018
     * @return
     */
    private String findDatabasePasswordBuilder() {

        DatabaseConnection databaseConnection = new DatabaseConnection();

        String password = databaseConnection.AuthorizeAccountBuilder(this.inputName, this.inputPassword);

        databaseConnection.closeDatabaseConnection();

        return password;

    }//findDatabasePasswordBuilder

    /**
     * *
     * Finds the database password assoiated to the input courier.
     *
     * @auhor Michael Watters
     * @date 02/05/2018
     * @return
     */
    private String findDatabasePasswordCourier() {

        DatabaseConnection databaseConnection = new DatabaseConnection();

        String password = databaseConnection.AuthorizeAccountCourier(this.inputName, this.inputPassword);

        databaseConnection.closeDatabaseConnection();

        return password;

    }//findDatabasePasswordCourier

    /**
     * *
     * Finds the database password assoiated to the input Manager.
     *
     * @auhor Michael Watters
     * @date 02/05/2018
     * @return
     */
    private String findDatabasePasswordManager() {

        DatabaseConnection databaseConnection = new DatabaseConnection();

        String password = databaseConnection.AuthorizeAccountManager(this.inputName, this.inputPassword);

        databaseConnection.closeDatabaseConnection();

        return password;

    }//findDatabasePasswordManager

}//class
