package project_lab251;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Supplies {
    
    String name;
    double price;
    int quantity;
    boolean inStock; 
    int days;
    
    public Supplies(String name, double price, int quantity, int days ) {
        this.name=name;
        this.price=price;
        this.quantity=quantity;
        this.days=days;
        
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setDays(int days) {
        this.days = days;
    }
    
    public int getDays() {
        return days;
    }
    
    public String toString() {
        return name+" "+price+" "+quantity+" "+days;
    }
}
