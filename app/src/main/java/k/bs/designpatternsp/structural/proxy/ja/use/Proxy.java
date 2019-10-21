package k.bs.designpatternsp.structural.proxy.ja.use;

class Proxy implements IService {
    IService iService;
    @Override
    public String greeting(String str) {
        System.out.println("호출에 대한 흐름 제어가 주목적이며, 반환 결과를 그대로 전달한다.");
        iService = new Service();
        return iService.greeting(str);
    }
    
}

