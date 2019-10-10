package k.bs.designpatternsp.pattern.proxy.ja.use;

public class Client {
    public static void main(String[] args) {
        IService service = new Proxy();
        System.out.println(service.greeting("kkkkk"));
    }
}
