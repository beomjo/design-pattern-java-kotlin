package k.bs.designpatternsp.pattern.iterator.ja;

public class Goat implements Animal {
    @Override
    public void eat() {
        System.out.println("짧은 풀 뜯어먹음");
    }
 
    @Override
    public void sleep() {
        System.out.println("엎드려서 잠");
    }
 
    @Override
    public void sound() {
        System.out.println("음메에에");
    }
}
