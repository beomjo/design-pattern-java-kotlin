package k.bs.designpatternsp.structural.facade.ja;

public class Snack {
    
    private String name="";
    
    public Snack(String name)
    {
        this.name = name;
    }
    
    public void Prepare()
    {
        System.out.println(name+" 간식 준비 완료 ");
    }
 
}
