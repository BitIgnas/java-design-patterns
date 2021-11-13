package design_patterns.command;

public class Stock {
    private String name;
    private Integer price;
    private Boolean isSold;

    public Stock(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public void sellStock() {
        this.isSold = true;
        System.out.println("Stock: " + name + " has been sold");
    }

    public void buyStock() {
        this.isSold = false;
        System.out.println("Stock: " + name + " has been bought");
    }
}
