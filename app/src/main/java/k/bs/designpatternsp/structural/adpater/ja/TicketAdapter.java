package k.bs.designpatternsp.structural.adpater.ja;

public class TicketAdapter implements MealTicketB {
    private MealTicketA ticket;

    public TicketAdapter(MealTicketA ticket) {
        this.ticket = ticket;
    }

    @Override
    public void choice(int token) {
        ticket.choice(token);
    }

    @Override
    public void print() {
        ticket.print();
    }

    @Override
    public void buyOffLine() {
        ticket.buy();
    }

    @Override
    public void buyOnline() {
        throw new UnsupportedOperationException("not support function (buying online");
    }

    @Override
    public String getMenue() {
        return "todays menus list";
    }
}