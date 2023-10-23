package Practic;

public class Product extends Menu{

    public String category;
    private int price;

    public Product(String category, String name, String description, int price) {
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

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
