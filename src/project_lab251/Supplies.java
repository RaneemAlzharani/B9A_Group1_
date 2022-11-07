package Project_lab251;
 
public class Supplies {
    
    String name;
    int price;
    int quantity;
    boolean inStock; 
    int days;
    public Supplies(String name, int price, int quantity, int days ) {
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
    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
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
        return name+" "+price;
    }
}
