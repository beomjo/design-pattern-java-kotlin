package k.bs.designpatternsp.pattern.factorymethod.ja.ex2.factory;

import k.bs.designpatternsp.pattern.factorymethod.ja.ex2.shape.ShapeType;
import k.bs.designpatternsp.pattern.factorymethod.ja.ex2.shape.Circle;
import k.bs.designpatternsp.pattern.factorymethod.ja.ex2.shape.Rectangle;
import k.bs.designpatternsp.pattern.factorymethod.ja.ex2.shape.Shape;
import k.bs.designpatternsp.pattern.factorymethod.ja.ex2.shape.Square;

public class ShapeFactory {
    public Shape getShape(ShapeType shapeType) {
        switch (shapeType) {
            case CIRCLE:
                return new Circle();
            case SQUARE:
                return new Square();
            case RECTANGLE:
                return new Rectangle();
            default:
                return null;
        }
    }
}
