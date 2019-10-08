package k.bs.designpatternsp.pattern.facade.movie.ja;

public class Client {
    public static void main(String[] args) {
        Facade facade= new Facade("popcon","joker");
        facade.viewMovie();
    }
}
