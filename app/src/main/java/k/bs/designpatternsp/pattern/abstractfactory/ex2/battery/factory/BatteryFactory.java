package k.bs.designpatternsp.pattern.abstractfactory.ex2.battery.factory;

import k.bs.designpatternsp.pattern.abstractfactory.ex2.Vendor;
import k.bs.designpatternsp.pattern.abstractfactory.ex2.battery.AppleBattery;
import k.bs.designpatternsp.pattern.abstractfactory.ex2.battery.LGBattery;
import k.bs.designpatternsp.pattern.abstractfactory.ex2.battery.SamsungBattery;

public class BatteryFactory {
    public static Battery createBattery(Vendor vendorId) throws Exception {
        if (vendorId == Vendor.Samsung) return new SamsungBattery();
        else if (vendorId == Vendor.LG) return new LGBattery();
        else if (vendorId == Vendor.Apple) return new AppleBattery();
        else throw new Exception("Not Support Vendoers Battery");
    }
}

