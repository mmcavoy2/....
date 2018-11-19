/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 * This class create an objected based on Builders.
 *
 * @author mjwat
 * @Date 01/05/2018
 */
public class Builder {

    private int builderID;
    private String firstName;
    private String secondName;
    private String password;
    private String jobRole;
    private String loginName;

    public Builder(int builderID, String firstName, String secondName, String password, String jobRole, String loginName) {
        this.builderID = builderID;
        this.firstName = firstName;
        this.secondName = secondName;
        this.password = password;
        this.jobRole = jobRole;
        this.loginName = loginName;
    }//contructor

    //Getters and Setters
    public int getBuilderID() {
        return builderID;
    }//getBuilderID

    public void setBuilderID(int builderID) {
        this.builderID = builderID;
    }//setBuilderID

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

    public String getJobRole() {
        return jobRole;
    }//getJobRole

    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }//setJobRole

    public String getLoginName() {
        return loginName;
    }//getLoginName

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }//setLoginName

}//class
