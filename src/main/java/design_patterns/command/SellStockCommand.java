package design_patterns.command;

public class SellStockCommand implements Command {
    private Stock stock;

    public SellStockCommand(Stock stock) {
        this.stock = stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        this.stock.sellStock();
    }
}
