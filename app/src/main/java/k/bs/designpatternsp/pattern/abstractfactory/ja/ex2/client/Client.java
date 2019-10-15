package k.bs.designpatternsp.pattern.abstractfactory.ja.ex2.client;

import k.bs.designpatternsp.pattern.abstractfactory.ja.ex2.client.factory.ClientFactory;
import k.bs.designpatternsp.pattern.abstractfactory.ja.ex2.factory.GalaxyFactory;
import k.bs.designpatternsp.pattern.abstractfactory.ja.ex2.factory.SmartPhoneFactory;

public class Client {
    public static void main(String[] args) throws Exception {
        create(new GalaxyFactory());
    }

    private static void create(SmartPhoneFactory factory) throws Exception {
        ClientFactory clientFactory = new ClientFactory(factory);
        clientFactory.createPhone();
    }
}
