package udemy.strategy_2.model;

public class Product {
    private String upcCode;
    private int price;

    public Product(String upcCode, int price) {
        this.upcCode = upcCode;
        this.price = price;
    }

    public String getUpcCode() {
        return upcCode;
    }

    public int getPrice() {
        return price;
    }
}
