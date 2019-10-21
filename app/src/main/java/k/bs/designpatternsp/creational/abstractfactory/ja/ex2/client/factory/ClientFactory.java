package k.bs.designpatternsp.creational.abstractfactory.ja.ex2.client.factory;

import k.bs.designpatternsp.creational.abstractfactory.ja.ex2.factory.SmartPhoneFactory;

public class ClientFactory {
    private SmartPhoneFactory factory;

    public ClientFactory(SmartPhoneFactory factory) {
        this.factory = factory;
    }

    public void createPhone() throws Exception {
        factory.createAP(factory.createBattery()).process();
    }
}
