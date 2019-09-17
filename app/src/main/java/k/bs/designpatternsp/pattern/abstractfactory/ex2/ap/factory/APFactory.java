package k.bs.designpatternsp.pattern.abstractfactory.ex2.ap.factory;

import k.bs.designpatternsp.pattern.abstractfactory.ex2.ap.GalaxyNote;
import k.bs.designpatternsp.pattern.abstractfactory.ex2.ap.IPhone;
import k.bs.designpatternsp.pattern.abstractfactory.ex2.ap.LGV40;
import k.bs.designpatternsp.pattern.abstractfactory.ex2.battery.factory.Battery;
import k.bs.designpatternsp.pattern.abstractfactory.ex2.Vendor;

public class APFactory {
    public static AP createAP(Vendor vendorId, Battery battery) throws Exception {
        if (vendorId == Vendor.Apple) return new IPhone(battery);
        else if (vendorId == Vendor.Samsung) return new GalaxyNote(battery);
        else if (vendorId == Vendor.LG) return new LGV40(battery);
        else throw new Exception("Not Support Venders AP");
    }
}
