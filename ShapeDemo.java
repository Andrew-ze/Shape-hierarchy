public class ShapeDemo {
    // prints area of each shape in the array
    public static String printAreas(Shape[] shapes) {
        StringBuilder sb = new StringBuilder();
        System.out.println("AREAS:");
        for (Shape shape : shapes) {
        System.out.println(shape + " : Area= " + shape.getArea());
        System.out.println();
        }
        return sb.toString();
    }
    // prints perimeter of each shape in the array
    public static String printPerimeters(Shape[] shapes) {
        StringBuilder sb = new StringBuilder();
        System.out.println("PERIMETERS:");
        for (Shape shape : shapes) {
        System.out.println(shape + " : Perimeter= " + shape.getPerimeter());
        System.out.println();
        }
        return sb.toString();
    }
    // finds the shape with the largest area
    public static Shape largest(Shape[] shapes) {
        Shape max = shapes[0];
        System.out.println("...Finding largest shape...");
        for (Shape shape : shapes) {
            if (shape.getArea() > max.getArea()) max = shape;
            System.out.println(shape + " : Area= " + shape.getArea());
            System.out.println();
        }
        return max;
    }
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle("Red", true, 5);
        shapes[1] = new Rectangle("Blue", false, 4, 6);
        shapes[2] = new Triangle("Green", true, 3, 4, 5);
        System.out.println(printAreas(shapes));
        System.out.println(printPerimeters(shapes));

        Shape biggest = largest(shapes);
        System.out.println("Largest shape: " + biggest);
        System.out.println();

        // demonstrate resize
        System.out.println("New radius after resizing circle by factor of 2: ");
        System.out.println(shapes[0].resize(2));
        System.out.println();
        // demonstrate invalid shape exception
        try {
            Shape badTriangle = new Triangle("Black", false, 1, 1, 10);
        }
        catch (InvalidShapeException e) {
            System.out.println("Caught exception: ");
            System.out.println(e.getMessage());
        }
    }
}