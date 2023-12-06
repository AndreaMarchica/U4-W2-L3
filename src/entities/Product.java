package entities;

import java.util.Random;

public class Product {
    /* ATTRIBUTI */
    private long id;
    private String name;
    private String category;
    private double price;

    /* COSTRUTTORI */
    public Product(String name, String category) {
        this.id = generateRandomId();
        this.name = name;
        this.category = category;
        this.price = generateRandomPrice();
    }

    /* METODI */
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private long generateRandomId() {
        return new Random().nextInt(1, 1000000);
    }

    private double generateRandomPrice() {
        return new Random().nextDouble(1, 200);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
