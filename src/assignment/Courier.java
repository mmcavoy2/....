/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 * This class create an objected based on Couriers.
 *
 * @author mjwat
 * @Date 01/05/2018
 */
public class Courier {

    private int courierID;
    private String firstName;
    private String secondName;
    private String password;
    private String loginName;

    public Courier(int courierID, String firstName, String secondName, String password, String loginName) {
        this.courierID = courierID;
        this.firstName = firstName;
        this.secondName = secondName;
        this.password = password;
        this.loginName = loginName;
    }//constructor

    //Getters and Setters
    public int getCourierID() {
        return courierID;
    }//getCourierID

    public void setCourierID(int courierID) {
        this.courierID = courierID;
    }//setCourierID

    public String getFirstName() {
        return firstName;
    }//getFirstName

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }//setFirstName

    public String getSecondName() {
        return secondName;
    }//getSecondName

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }//setSecondName

    public String getPassword() {
        return password;
    }//getPassword

    public void setPassword(String password) {
        this.password = password;
    }//setPassword

    public String getLoginName() {
        return loginName;
    }//getLoginName

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }//setLoginName

}//class
