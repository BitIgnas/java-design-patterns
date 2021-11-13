package design_patterns.command;

public class Broker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void processOrder() {
        this.command.execute();
    }
}
