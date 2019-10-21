package k.bs.designpatternsp.behavioral.strategy.ja;

public abstract class Moving {
    private MovableStrategy movableStrategy;

    public void move() {
        movableStrategy.move();
    }

    public void setMovableStrategy(MovableStrategy movableStrategy) {
        this.movableStrategy = movableStrategy;
    }
}
