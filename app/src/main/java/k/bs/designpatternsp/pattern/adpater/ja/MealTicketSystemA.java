package k.bs.designpatternsp.pattern.adpater.ja;

public class MealTicketSystemA implements  MealTicketA{
    @Override
    public void choice(int token) {
        System.out.println("selected meal ticket type is "+ token);
    }

    @Override
    public void buy() {
        System.out.println("meal ticket buying...");
    }

    @Override
    public void print() {
        System.out.println("meal ticket printing...");
    }
}