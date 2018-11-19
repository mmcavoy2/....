/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *This class create an object based on items.
 * 
 * @author mjwat
 * @Date 01/05/2018
 */
public class Item {
    
    String itemName;

    public String getItemName() {
        return itemName;
    }//getItemName

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }//setItemName

    public Item(String itemName) {
        this.itemName = itemName;
    }//constructor
    
}//class
