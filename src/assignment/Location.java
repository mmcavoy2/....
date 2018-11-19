/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *This class create an object based on locations.
 * 
 * @author mjwat
 * @Date 01/05/2018
 */
public class Location {
    
    String locationName;

    public String getLocationName() {
        return locationName;
    }//getLocationName

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }//setLocationName

    public Location(String locationName) {
        this.locationName = locationName;
    }//Constructor
    
}//class
