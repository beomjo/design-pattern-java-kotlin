package k.bs.designpatternsp.behavioral.state.ja;

public class Off implements PowerState {
    public void powerPush(){
        System.out.println("power off");
    }
}