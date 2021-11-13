package design_patterns.builder;

public class ProductBuilder {
    private Long id;
    private String name;
    private Integer quantity;
    private Double price;
    private Boolean isFragile;

    public Product build() {
        return new Product(this.id, this.name, this.quantity, this.price, this.isFragile);
    }

    public ProductBuilder id(Long id) {
        this.id = id;
        return this;
    }

    public ProductBuilder name(String name) {
        this.name = name;
        return this;
    }

    public ProductBuilder quantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    public ProductBuilder price(Double price) {
        this.price = price;
        return this;
    }

    public ProductBuilder isFragile(Boolean isFragile) {
        this.isFragile = isFragile;
        return this;
    }
}
