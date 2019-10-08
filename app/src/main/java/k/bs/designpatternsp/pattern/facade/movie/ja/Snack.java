package k.bs.designpatternsp.pattern.facade.movie.ja;

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
