public class Circle extends Shape {
    private double radius;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        if (radius <= 0) throw new InvalidShapeException("Radius must be positive.");
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String resize(double factor) {
        radius *= factor;
        return "Circle resized. New radius=" + radius;
    }

    @Override
    public String toString() {
        return "-Circle: (radius=" + radius + ") " + super.toString();
    }
}