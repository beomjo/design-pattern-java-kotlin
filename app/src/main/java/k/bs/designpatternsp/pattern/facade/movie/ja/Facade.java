package k.bs.designpatternsp.pattern.facade.movie.ja;

public class Facade {
    
    private String snackName ="";
    private String movieName="";
    
    public Facade(String snackName,String movieName)
    {
        this.snackName=snackName;
        this.movieName=movieName;
    }
    
    public void viewMovie()
    {
        Snack snack = new Snack(snackName);
        RemoteControl remote= new RemoteControl();
        Movie movie = new Movie(movieName);

        snack.Prepare();
        remote.turnOn();
        movie.searchMovie();
        movie.chargeMovie();
        movie.playMovie();
    }
}
