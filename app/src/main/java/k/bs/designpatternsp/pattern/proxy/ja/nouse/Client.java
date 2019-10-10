package k.bs.designpatternsp.pattern.proxy.ja.nouse;

public class Client {
    public static void main(String[] args) {
        Service service = new Service();
        System.out.println(service.greeting("bsjo"));
    }
}
