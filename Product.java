package Practic;

public class Product extends Menu{

    public String category;
    private double price;

    public Product(String category, String name, String description, double price) {
        super(name, description);
        this.price = price;
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
