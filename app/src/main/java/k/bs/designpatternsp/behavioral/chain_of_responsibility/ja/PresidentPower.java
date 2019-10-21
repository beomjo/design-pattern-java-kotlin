package k.bs.designpatternsp.behavioral.chain_of_responsibility.ja;

class PresidentPower extends PurchasePower {
    private final double ALLOWABLE = 60 * base;

    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < ALLOWABLE) {
            System.out.println("President will approve $" + request.getAmount());
        } else {
            System.out.println( "Your request for $" + request.getAmount() + " needs a board meeting!");
        }
    }
}