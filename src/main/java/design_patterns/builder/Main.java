package design_patterns.builder;

public class Main {

    public static void main(String[] args) {
        Product computer = new ProductBuilder()
                .id(1L)
                .name("Dell")
                .price(409.99)
                .quantity(1)
                .isFragile(true)
                .build();

        System.out.println(computer.toString());
    }
}
