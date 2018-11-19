/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.sql.*;
import javax.swing.JOptionPane;
import java.util.*;

/**
 * This class handles all the connections to the database And all the methods
 * used to add,modify and delete records from the database. Along with
 * retrieving information from the database.
 *
 * @author mjwat
 */
public class DatabaseConnection {

    //Varibles used for Database Connection
    //Path of the database in use.
    //private final String path = "C:\\Users\\mjwat\\OneDrive\\TeamFiveP2A1KitCourier\\src\\database\\KitCourierDB.accdb";
    private final String path = "src/database/KitCourierDB.accdb";
    //building the connection String
    private final String constr = "jdbc:ucanaccess://" + path;
    private final String NAME = "net.ucanaccess.jdbc.UcanaccessDriver";

    //set a value for maximum number of Units in order to create an array of this size 
    private final int MAX_UNITS = 500;
    private final int itemsInDB = 11;

    //this variable will hold the current number of records for a query 
    public int numRecordsInQuery = 0;

    //use to build connection to database
    private Connection connection = null;
    private PreparedStatement prepStatement = null;
    private ResultSet resultSet = null;

    /**
     * Constructor for database Connection
     */
    public DatabaseConnection() {
        try {
            // Connection to DB             
            Class.forName(NAME);
            connection = DriverManager.getConnection(constr);
        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
            System.exit(1);
        } catch (Exception ex) {
            ex.printStackTrace();
            System.exit(1);
        }
    }

    /**
     * to close the database Connection
     */
    public void closeDatabaseConnection() {
        try {
            connection.close();
        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
        }
    }

    /**
     * To Check if the inputLogin Name and input Password match in the Database
     * for builders
     *
     * @param inputLoginName
     * @param inputPassword
     * @return
     */
    public String AuthorizeAccountBuilder(String inputLoginName, String inputPassword) {
        String password = null;
        try {
            //set up the SQL statement 
            String sqlString = "SELECT Password, BuilderID FROM tblBuilder WHERE tblBuilder.LoginName='" + inputLoginName + "'";
            //create prepared statement –              
            prepStatement = connection.prepareStatement(sqlString);
            // set the parameter values    
            resultSet = prepStatement.executeQuery();
            while (resultSet.next()) {
                String databasePassword = resultSet.getString("Password");
                String key = resultSet.getString("BuilderID");
                System.out.println(key);
                Main.builderID = key;
                Main.builder = true;
                password = databasePassword;
            }

        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
        }//catch
        return password;
    }//AuthorizeAccount

    /**
     * To Check if the inputLogin Name and input Password match in the Database
     * for couriers
     *
     * @author mjwatters
     * @date 01/04/2018
     *
     * @param inputLoginName
     * @param inputPassword
     * @return
     */
    public String AuthorizeAccountCourier(String inputLoginName, String inputPassword) {
        String password = null;
        try {
            //set up the SQL statement 
            String sqlString = "SELECT Password, CourierID FROM tblCourier WHERE tblCourier.LoginName='" + inputLoginName + "'";
            //create prepared statement –              
            prepStatement = connection.prepareStatement(sqlString);
            // set the parameter values    
            resultSet = prepStatement.executeQuery();
            while (resultSet.next()) {
                String databasePassword = resultSet.getString("Password");
                String key = resultSet.getString("CourierID");
                System.out.println(key);
                Main.courierID = key;
                Main.courier = true;
                password = databasePassword;
            }
        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
        }//catch
        return password;
    }//AuthorizeAccount

    /**
     * To Check if the inputLogin Name and input Password match in the Database
     * for managers
     *
     * @author mjwatters
     * @date 01/04/2018
     *
     * @param inputLoginName
     * @param inputPassword
     * @return
     */
    public String AuthorizeAccountManager(String inputLoginName, String inputPassword) {
        String password = null;
        try {

            //set up the SQL statement 
            String sqlString = "SELECT Password, ManagerID FROM tblManager WHERE tblManager.LoginName='" + inputLoginName + "'";
            //create prepared statement –              
            prepStatement = connection.prepareStatement(sqlString);
            // set the parameter values    
            resultSet = prepStatement.executeQuery();
            while (resultSet.next()) {
                String databasePassword = resultSet.getString("Password");
                String key = resultSet.getString("ManagerID");
                System.out.println(key);
                // set varibles in the Main
                Main.managerID = key;
                Main.builderID = key;
                Main.courierID = key;
                Main.manager = true;
                Main.builder = true;
                Main.courier = true;
                password = databasePassword;
            }

        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
        }//catch
        return password;
    }//AuthorizeAccount

    /**
     * Used to insert and order into the database.
     *
     * @author mjwatters
     * @date 01/04/2018
     *
     * @param itemID
     * @param builderID
     * @param courierID
     * @param notes
     * @param dateRequired
     * @param locationID
     * @param status
     * @return
     */
    public boolean insertOrder(int itemID, int builderID, int courierID, String notes, String dateRequired, int locationID, String status) {
        boolean done = false;
        try {
            //set up the SQL statement 
            String sqlString = "INSERT INTO tblOrder ( ItemID,BuilderID,CourierID,Notes,DateRequired,LocationID,Status ) VALUES( ?,?,?,?,?,?,? )";
            //create prepared statement –              
            prepStatement = connection.prepareStatement(sqlString);
            // set the parameter values             
            prepStatement.setInt(1, itemID);
            prepStatement.setInt(2, builderID);
            prepStatement.setInt(3, courierID);
            prepStatement.setString(4, notes);
            prepStatement.setString(5, dateRequired);
            prepStatement.setInt(6, locationID);
            prepStatement.setString(7, status);
            // execute the prepared statement             
            int result = prepStatement.executeUpdate();
            //if the result is 1 then the record has been inserted successfully             
            if (result == 1) {
                done = true;

            } else {

            }
        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
        }
        return done;

    }

    /**
     * To insert a courier into the database
     *
     * @author mjwatters
     * @date 01/04/2018
     *
     * @param ManagerID
     * @param FirstName
     * @param SecondName
     * @param Password
     * @param LoginName
     * @return
     */
    public boolean insertCourier(int ManagerID, String FirstName, String SecondName, String Password, String LoginName) {
        boolean done = false;
        try {
            //set up the SQL statement 
            String sqlString = "INSERT INTO tblCourier ( ManagerID,FirstName,SecondName,Password,LoginName ) VALUES( ?,?,?,?,? )";
            //create prepared statement –              
            prepStatement = connection.prepareStatement(sqlString);
            // set the parameter values             
            prepStatement.setInt(1, ManagerID);
            prepStatement.setString(2, FirstName);
            prepStatement.setString(3, SecondName);
            prepStatement.setString(4, Password);
            prepStatement.setString(5, LoginName);

            // execute the prepared statement             
            int result = prepStatement.executeUpdate();
            //if the result is 1 then the record has been inserted successfully             
            if (result == 1) {
                done = true;

            } else {

            }
        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
        }
        return done;

    }

    /**
     * to insert an item into the database.
     *
     * @author mjwatters
     * @date 01/04/2018
     *
     * @param itemName
     * @param price
     * @param stock
     * @return
     */
    public boolean insertItem(String itemName, int price, int stock) {
        boolean done = false;
        try {
            //set up the SQL statement 
            String sqlString = "INSERT INTO tblItem ( ItemName,Price,Stock ) VALUES( ?,?,? )";
            //create prepared statement –              
            prepStatement = connection.prepareStatement(sqlString);
            // set the parameter values             
            prepStatement.setString(1, itemName);
            prepStatement.setInt(2, price);
            prepStatement.setInt(3, stock);

            // execute the prepared statement             
            int result = prepStatement.executeUpdate();
            //if the result is 1 then the record has been inserted successfully             
            if (result == 1) {
                done = true;

            } else {

            }
        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
        }
        return done;

    }

    /**
     * To insert a builder into the database
     *
     * @author mjwatters
     * @date 01/04/2018
     *
     * @param ManagerID
     * @param FirstName
     * @param SecondName
     * @param Password
     * @param JobRole
     * @param LoginName
     * @return
     */
    public boolean insertBuilder(int ManagerID, String FirstName, String SecondName, String Password, String JobRole, String LoginName) {
        boolean done = false;
        try {
            //set up the SQL statement 
            String sqlString = "INSERT INTO tblBuilder ( ManagerID,FirstName,SecondName,Password,JobRole,LoginName ) VALUES( ?,?,?,?,?,? )";
            //create prepared statement –              
            prepStatement = connection.prepareStatement(sqlString);
            // set the parameter values             
            prepStatement.setInt(1, ManagerID);
            prepStatement.setString(2, FirstName);
            prepStatement.setString(3, SecondName);
            prepStatement.setString(4, Password);
            prepStatement.setString(5, JobRole);
            prepStatement.setString(6, LoginName);

            // execute the prepared statement             
            int result = prepStatement.executeUpdate();
            //if the result is 1 then the record has been inserted successfully             
            if (result == 1) {
                done = true;

            } else {

            }
        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
        }
        return done;

    }

    /**
     * to get an array of all locations
     *
     * @author mjwatters
     * @date 01/04/2018
     * @return
     */
    public Location[] getAllLocations() {
        // instantiate an array of Locations Objects to the MAX_SIZE size        
        Location[] locationArray = new Location[6];
        //reset counter for number of records in the query        
        numRecordsInQuery = 0;
        try {
            //prepare the SQL statement             
            String sqlString = "SELECT LocationName FROM tblLocation";
            //create a prepared statement              
            prepStatement = connection.prepareStatement(sqlString);
            //prepStatement.setInt(1,searchID);
            //execute the prepared statement and retrieve the results in the resultSet             
            resultSet = prepStatement.executeQuery();
            //extract the data from resultSet into the studentsArray             
            //parse through the resultSet extracting the data             
            int index = 0;
            while (resultSet.next()) {
                //extract id, firstName and lastName from current resultSet item                 
                String locationName = resultSet.getString("LocationName");
                //instantiate a Location object with the data in the array                 
                locationArray[index] = new Location(locationName);
                index++;
            }
            //keep a record of the number of records in this query             
            numRecordsInQuery = index;
        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
            closeDatabaseConnection();
        }
        return locationArray;
    }

    /**
     * to get an array of all items
     *
     * @author mjwatters
     * @date 01/04/2018
     * @return
     */
    public Item[] getAllItems() {
        // instantiate an array of Items Objects    
        Item[] itemArray = new Item[itemsInDB];
        //reset counter for number of records in the query        
        numRecordsInQuery = 0;
        try {
            //prepare the SQL statement             
            String sqlString = "SELECT ItemName FROM tblItem";
            //create a prepared statement              
            prepStatement = connection.prepareStatement(sqlString);
            //prepStatement.setInt(1,searchID);
            //execute the prepared statement and retrieve the results in the resultSet             
            resultSet = prepStatement.executeQuery();
            //extract the data from resultSet into the studentsArray             
            //parse through the resultSet extracting the data             
            int index = 0;
            while (resultSet.next()) {
                //extract itemName            
                String itemName = resultSet.getString("ItemName");
                //instantiate a Item object with the data in the array                 
                itemArray[index] = new Item(itemName);
                index++;
            }
            //keep a record of the number of records in this query             
            numRecordsInQuery = index;
        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
            closeDatabaseConnection();
        }
        return itemArray;
    }

    /**
     * To get an array of all items.
     *
     * @author mjwatters
     * @date 01/04/2018
     *
     * @return
     */
    public Item[] getAllItemsTest() {
        // instantiate an array of items Objects      

        ArrayList<Item> itemList = new ArrayList<Item>();
        //itemList.toArray();

        //reset counter for number of records in the query        
        numRecordsInQuery = 0;
        try {
            //prepare the SQL statement             
            String sqlString = "SELECT ItemName FROM tblItem";
            //create a prepared statement              
            prepStatement = connection.prepareStatement(sqlString);
            //prepStatement.setInt(1,searchID);
            //execute the prepared statement and retrieve the results in the resultSet             
            resultSet = prepStatement.executeQuery();
            //extract the data from resultSet into the studentsArray             
            //parse through the resultSet extracting the data             
            int index = 0;
            while (resultSet.next()) {
                //extract item name          
                String itemName = resultSet.getString("ItemName");
                //instantiate a Student object with the data in the array
                itemList.add(new Item(itemName));

                //itemArray[index] = new Item(itemName);
                index++;
            }
            //keep a record of the number of records in this query             
            numRecordsInQuery = index;
        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
            closeDatabaseConnection();
        }

        Item[] itemArray = new Item[numRecordsInQuery];
        itemList.toArray(itemArray);

        return itemArray;
    }

    /**
     * to get an array of all orders.
     *
     * @author mjwatters
     * @date 01/04/2018
     *
     * @return
     */
    public Order[] getAllOrders() {
        // instantiate an array of Order Objects
        Order[] ordersArray = new Order[MAX_UNITS];
        //reset counter for number of records in the query        
        numRecordsInQuery = 0;
        try {
            //prepare the SQL statement             
            String sqlString = "SELECT * FROM tblOrder WHERE Status ='Placed';";
            //create a prepared statement              
            prepStatement = connection.prepareStatement(sqlString);
            //prepStatement.setInt(1,searchID);
            //execute the prepared statement and retrieve the results in the resultSet             
            resultSet = prepStatement.executeQuery();
            //extract the data from resultSet into the orders array          
            //parse through the resultSet extracting the data             
            int index = 0;
            while (resultSet.next()) {
                //extract id, itemid, builderid, courierid, notes, daterequired, and location and status           
                int id = resultSet.getInt("OrderID");
                int itemID = resultSet.getInt("ItemID");
                int builderID = resultSet.getInt("BuilderID");
                int courierID = resultSet.getInt("CourierID");
                String notes = resultSet.getString("Notes");
                String dateRequired = resultSet.getString("DateRequired");
                int locationID = resultSet.getInt("LocationID");
                String status = resultSet.getString("Status");

                //instantiate a order object with the data in the array                 
                ordersArray[index] = new Order(id, itemID, builderID, courierID, notes, dateRequired, locationID, status);
                index++;
            }
            //keep a record of the number of records in this query             
            numRecordsInQuery = index;
        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
            closeDatabaseConnection();
        }
        return ordersArray;
    }

    /**
     * to get am array allOrdersComplete
     *
     * @author mjwatters
     * @date 01/04/2018
     *
     * @return
     */
    public Order[] getAllOrdersComplete() {
        // instantiate an array of orders     
        Order[] ordersArray = new Order[MAX_UNITS];
        //reset counter for number of records in the query        
        numRecordsInQuery = 0;
        try {
            //prepare the SQL statement             
            String sqlString = "SELECT * FROM tblOrder WHERE Status ='Placed';";
            //create a prepared statement              
            prepStatement = connection.prepareStatement(sqlString);
            //prepStatement.setInt(1,searchID);
            //execute the prepared statement and retrieve the results in the resultSet             
            resultSet = prepStatement.executeQuery();
            //extract the data from resultSet into the orders array          
            //parse through the resultSet extracting the data             
            int index = 0;
            while (resultSet.next()) {
                //extract id, firstName and lastName from current resultSet item                 
                int id = resultSet.getInt("OrderID");
                int itemID = resultSet.getInt("ItemID");
                int builderID = resultSet.getInt("BuilderID");
                int courierID = resultSet.getInt("CourierID");
                String notes = resultSet.getString("Notes");
                String dateRequired = resultSet.getString("DateRequired");
                int locationID = resultSet.getInt("LocationID");
                String status = resultSet.getString("Status");

                //instantiate a order object with the data in the array                 
                ordersArray[index] = new Order(id, itemID, builderID, courierID, notes, dateRequired, locationID, status);
                index++;
            }
            //keep a record of the number of records in this query             
            numRecordsInQuery = index;
        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
            closeDatabaseConnection();
        }
        return ordersArray;
    }

    /**
     * To get allOrders where there is a status
     *
     * @author mjwatters
     * @date 01/04/2018
     *
     * @return
     */
    public Order[] getAllOrdersAllStatus() {
        // instantiate an array of Order Objects    
        Order[] ordersArray = new Order[MAX_UNITS];
        //reset counter for number of records in the query        
        numRecordsInQuery = 0;
        try {
            //prepare the SQL statement             
            String sqlString = "SELECT * FROM tblOrder";
            //create a prepared statement              
            prepStatement = connection.prepareStatement(sqlString);
            //prepStatement.setInt(1,searchID);
            //execute the prepared statement and retrieve the results in the resultSet             
            resultSet = prepStatement.executeQuery();
            //extract the data from resultSet into the studentsArray             
            //parse through the resultSet extracting the data             
            int index = 0;
            while (resultSet.next()) {
                int id = resultSet.getInt("OrderID");
                int itemID = resultSet.getInt("ItemID");
                int builderID = resultSet.getInt("BuilderID");
                int courierID = resultSet.getInt("CourierID");
                String notes = resultSet.getString("Notes");
                String dateRequired = resultSet.getString("DateRequired");
                int locationID = resultSet.getInt("LocationID");
                String status = resultSet.getString("Status");

                //instantiate a order object with the data in the array                 
                ordersArray[index] = new Order(id, itemID, builderID, courierID, notes, dateRequired, locationID, status);
                index++;
            }
            //keep a record of the number of records in this query             
            numRecordsInQuery = index;
        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
            closeDatabaseConnection();
        }
        return ordersArray;
    }

    /**
     * To update an order in the database.
     *
     * @author mjwatters
     * @date 01/04/2018
     *
     * @param id
     * @param status
     * @return
     */
    public boolean updateOrder(int id, String status) {
        boolean done = false;
        try {

            //set up the SQL statement 
            String sqlString = "UPDATE tblOrder SET Status=? WHERE OrderID=?";
            //create prepared statement –              
            prepStatement = connection.prepareStatement(sqlString);
            // set the parameter values  

            prepStatement.setString(1, status);
            prepStatement.setInt(2, id);

            // execute the prepared statement             
            int result = prepStatement.executeUpdate();
            //if the result is 1 then the record has been inserted successfully             
            if (result == 1) {
                done = true;
            }
        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
        }
        return done;

    }

    /**
     * Used to find the password in the database where the login is equal.
     *
     * @author mjwatters
     * @date 01/04/2018
     *
     * @param loginName
     * @return
     */
    public String getUserPasswordSQL(String loginName) {
        String password = "";
        try {
            //the SQL statement             
            String sqlString = "SELECT Password FROM tblBuilder WHERE LoginName = '?'";
            //create a prepared statement using SQL statement             
            prepStatement = connection.prepareStatement(sqlString);

            prepStatement.setString(1, loginName);

            //execute the prepared statement and retrieve the results in the resultSet
            resultSet = prepStatement.executeQuery();
            int index = 0;

            while (resultSet.next()) {
                password = resultSet.getString("Password");
                System.out.println(password);
            }
        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
            closeDatabaseConnection();
        }
        System.out.println(password);
        return password;
    }//getUserPassword
}//class
