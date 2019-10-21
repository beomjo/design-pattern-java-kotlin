package k.bs.designpatternsp.behavioral.iterator.ja;

public class Sheep implements Animal {
    @Override
    public void eat() {
        System.out.println("길쭉한 풀 뜯어먹음");
    }
 
    @Override
    public void sleep() {
        System.out.println("앉아서 잠");
    }
 
    @Override
    public void sound() {
        System.out.println("메에에");
    }
}
