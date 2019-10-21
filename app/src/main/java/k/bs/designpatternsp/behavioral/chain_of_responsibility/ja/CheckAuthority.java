package k.bs.designpatternsp.behavioral.chain_of_responsibility.ja;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class CheckAuthority {
    public static void main(String[] args) {
        ManagerPower manager = new ManagerPower();
        DirectorPower director = new DirectorPower();
        VicePresidentPower vp = new VicePresidentPower();
        PresidentPower president = new PresidentPower();
        manager.setSuccessor(director);
        director.setSuccessor(vp);
        vp.setSuccessor(president);

        // Press Ctrl+C to end.
        try {
            while (true) {
                System.out.println("Enter the amount to check who should approve your expenditure.");
                System.out.print(">");
                double d = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
                manager.processRequest(new PurchaseRequest(0, d, "General"));
           }
        } catch(Exception e) {
            System.exit(1);
        }
    }
}