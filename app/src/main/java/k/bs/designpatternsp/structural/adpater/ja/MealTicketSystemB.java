package k.bs.designpatternsp.structural.adpater.ja;

public class MealTicketSystemB implements MealTicketB{
    @Override
    public void choice(int token) {
        System.out.println("selected meal ticket type is "+ token);
    }

    @Override
    public void print() {
        System.out.println("meal ticket printing...");
    }

    @Override
    public void buyOffLine() {
        System.out.println("meal ticket buying(offline)...");
    }

    @Override
    public void buyOnline() {
        System.out.println("meal ticket buying(online)...");
    }

    @Override
    public String getMenue() {
        return "todays menus list";
    }
}