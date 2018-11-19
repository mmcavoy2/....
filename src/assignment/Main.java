/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *This is main class
 * 
 * @author mjwat
 * @Date 01/05/2018
 */
public class Main {
    
    //varibles to store the ID of the respective Account
    public static String builderID = "";
    public static String courierID = "";
    public static String managerID = "";
    
    //boolean to store access rights to parts of the application.
    public static boolean builder = false;
    public static boolean courier = false;
    public static boolean manager = false;
      
    public static boolean showLogin = true;
    
    public static void main(String[] args) {
        FrameLogin frameLogin = new FrameLogin();
        frameLogin.setVisible(true);
    }//main
}//class
