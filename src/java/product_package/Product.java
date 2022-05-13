//Product is a JavaBean that stores name, description, category, price, quantity.
package product_package;

/**
 *
 * @author nguyen_na
 */
public class Product {
    private String name;
    private String desciption;
    private String category;
    private double price;
    private int quantity;

    public Product(String name, String desciption, String category, double price, int quantity) {
        this.name = name;
        this.desciption = desciption;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
           
}
