package design_patterns.builder;

public class Product {
    private Long id;
    private String name;
    private Integer quantity;
    private Double price;
    private Boolean isFragile;

    public Product(Long id, String name, Integer quantity, Double price, Boolean isFragile) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.isFragile = isFragile;
    }

    public Product() {

    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double getPrice() {
        return price;
    }

    public Boolean getFragile() {
        return isFragile;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", isFragile=" + isFragile +
                '}';
    }
}
