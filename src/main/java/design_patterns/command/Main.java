package design_patterns.command;

public class Main {

    public static void main(String[] args) {
        Stock btc = new Stock("BTC", 67000);
        Stock gme = new Stock("GME", 230);

        Broker melvinCapital = new Broker();

        BuyStockCommand buyStockCommand = new BuyStockCommand(btc);
        melvinCapital.setCommand(buyStockCommand);
        melvinCapital.processOrder();

        SellStockCommand sellStockCommand = new SellStockCommand(gme);
        melvinCapital.setCommand(sellStockCommand);
        melvinCapital.processOrder();
    }
}
