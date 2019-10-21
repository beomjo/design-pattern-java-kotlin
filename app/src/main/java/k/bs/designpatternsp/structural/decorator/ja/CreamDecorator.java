package k.bs.designpatternsp.structural.decorator.ja;

public class CreamDecorator extends Cake{
    private Cake cake;
     
    public CreamDecorator(Cake cake) {
        this.cake = cake;
    }
     
    @Override
    public String getCake() {
        return "*cream* "+cake.getCake() + " *cream*";
         
    }
}