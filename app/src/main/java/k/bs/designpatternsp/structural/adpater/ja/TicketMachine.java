package k.bs.designpatternsp.structural.adpater.ja;

public class TicketMachine {
    public static void main(String[] args) {

        MealTicketSystemA ticketSystemA = new MealTicketSystemA();
        ticketSystemA.choice(1);
        ticketSystemA.buy();
        ticketSystemA.print();

        System.out.println();

        MealTicketSystemB ticketSystemB = new MealTicketSystemB();
        ticketSystemB.choice(2);
        ticketSystemB.buyOffLine();
        ticketSystemB.buyOnline();
        ticketSystemB.print();
        System.out.println(ticketSystemB.getMenue());

        System.out.println();
        System.out.println();
        System.out.println();


        System.out.println("new ticket machine");

        MealTicketB newTicketSystem = new TicketAdapter(new MealTicketSystemA());

        newTicketSystem.choice(1);
        newTicketSystem.buyOffLine();
        newTicketSystem.print();
        try {
            System.out.println(newTicketSystem.getMenue());
        } catch (UnsupportedOperationException e) {
            System.out.println("this service is not support");
        }

    }
}