package design_patterns.command;

public class BuyStockCommand implements Command {

    private Stock stock;

    public BuyStockCommand(Stock stock) {
        this.stock = stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        this.stock.buyStock();
    }
}
