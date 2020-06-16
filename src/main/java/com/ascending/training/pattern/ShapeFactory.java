package com.ascending.training.pattern;

// Learning from tutorialspoint.com/design_pattern/factory_pattern.htm
public class ShapeFactory {

    // Use getShape method to get object of type shape.
    public Shape getShape(String shapeType){
        if(shapeType == null) return null;
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }
        else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        else if (shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;
    }

    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();

        // Get an object of XXX and call its draw method.
        Shape shapeCircle = shapeFactory.getShape("CIRCLE");
        shapeCircle.draw();

        Shape shapeRectangle = shapeFactory.getShape("RECTANGLE");
        shapeRectangle.draw();

        Shape shapeSquare = shapeFactory.getShape("SQUARE");
        shapeSquare.draw();
    }
}
