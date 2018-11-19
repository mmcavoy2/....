/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *This class create an object based on Manager.
 * 
 * @author mjwat
 * @Date 01/05/2018
 */
public class Manager {
    
    private int managerID;
    private String firstName;
    private String secondName;
    private String password;
    private String jobRole;
    private String loginName;

    public Manager(int managerID, String firstName, String secondName, String password, String jobRole, String loginName) {
        this.managerID = managerID;
        this.firstName = firstName;
        this.secondName = secondName;
        this.password = password;
        this.jobRole = jobRole;
        this.loginName = loginName;
    }//constructor

    public int getManagerID() {
        return managerID;
    }

    public void setManagerID(int managerID) {
        this.managerID = managerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJobRole() {
        return jobRole;
    }

    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }


    
    
    
}//classa
