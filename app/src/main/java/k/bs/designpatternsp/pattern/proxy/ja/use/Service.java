package k.bs.designpatternsp.pattern.proxy.ja.use;

class Service implements IService{
    @Override
    public String greeting(String str) {
        return "안녕하세요 " + str + "입니다.";
    }
}


