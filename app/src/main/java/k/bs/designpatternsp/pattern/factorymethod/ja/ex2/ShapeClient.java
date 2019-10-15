package k.bs.designpatternsp.pattern.factorymethod.ja.ex2;

import k.bs.designpatternsp.pattern.factorymethod.ja.ex2.factory.ShapeFactory;
import k.bs.designpatternsp.pattern.factorymethod.ja.ex2.shape.Shape;
import k.bs.designpatternsp.pattern.factorymethod.ja.ex2.shape.ShapeType;

public class ShapeClient {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape(ShapeType.CIRCLE);
        shape1.draw();

        Shape shape2 = shapeFactory.getShape(ShapeType.SQUARE);
        shape2.draw();

        Shape shape3 = shapeFactory.getShape(ShapeType.RECTANGLE);
        shape3.draw();
    }
}
