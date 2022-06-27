/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory;


/**
 *
 * @author lukef
 */
public class Item implements java.io.Serializable{
    //instance variables
    private String itemName;
    private int quantity;
    private String description;
    
    //constructor
    public Item(String i, int q, String d) {
        this.itemName = i;
        this.quantity = q;
        this.description = d;
    }
    
    //getters
    public String getItemName() {
        return itemName;
    }
    public int getQuantity() {
        return quantity;
    }
    public String getDescription() {
        return description;
    }
 
    //setters
    public void setItemName(String ItemName) {
        this.itemName = ItemName;
    }
    public void setQuantity(int Quantity) {
        this.quantity = Quantity;
    }
    public void setDescription(String Description) {
        this.description = Description;
    }
    
    //tostring
    public String toString(){
        String output = "Name: " + itemName + "\n" + "Quantity: " + quantity + "\n" + "Description: " + description;
        return output;
    }
}
