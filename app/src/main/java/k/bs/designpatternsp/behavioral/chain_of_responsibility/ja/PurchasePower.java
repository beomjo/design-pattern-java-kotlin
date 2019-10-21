package k.bs.designpatternsp.behavioral.chain_of_responsibility.ja;

abstract class PurchasePower {
    protected final double base = 500;
    protected PurchasePower successor;

    public void setSuccessor(PurchasePower successor) {
        this.successor = successor;
    }

    abstract public void processRequest(PurchaseRequest request);
}