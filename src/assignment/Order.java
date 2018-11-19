/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *This class create an object based on Order.
 * 
 * @author mjwat
 * @Date 01/05/2018
 */
public class Order {
    
    private int orderID;
    private int ItemID;
    private int builderID;
    private int courierID;
    private String notes;
    private String dateRequired;
    private int locationID;
    private String status;

    public Order(int orderID, int ItemID, int builderID, int courierID, String notes, String dateRequired, int locationID,String status) {
        this.orderID = orderID;
        this.ItemID = ItemID;
        this.builderID = builderID;
        this.courierID = courierID;
        this.notes = notes;
        this.dateRequired = dateRequired;
        this.locationID = locationID;
        this.status = status;
    }//constructor

    public String getStatus() {
        return status;
    }//getStatus

    public void setStatus(String status) {
        this.status = status;
    }//setStatus

    public int getOrderID() {
        return orderID;
    }//getOrderID

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }//setOrderID

    public int getItemID() {
        return ItemID;
    }//getItemID

    public void setItemID(int ItemID) {
        this.ItemID = ItemID;
    }//setItemID

    public int getBuilderID() {
        return builderID;
    }//getBuilderID

    public void setBuilderID(int builderID) {
        this.builderID = builderID;
    }//setBuilderID

    public int getCourierID() {
        return courierID;
    }//getCourierID

    public void setCourierID(int courierID) {
        this.courierID = courierID;
    }//setCourierID

    public String getNotes() {
        return notes;
    }//getNotes

    public void setNotes(String notes) {
        this.notes = notes;
    }//setNotes

    public String getDateRequired() {
        return dateRequired;
    }//getDateRequired

    public void setDateRequired(String dateRequired) {
        this.dateRequired = dateRequired;
    }//setDateRequired


    public int getLocationID() {
        return locationID;
    }//getLocationID

    public void setLocationID(int locationID) {
        this.locationID = locationID;
    }//setLocationID
    
}//class
