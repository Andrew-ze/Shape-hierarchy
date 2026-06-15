public abstract class Shape {
    private String color;
    private boolean filled;

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() { return color; }
    public boolean isFilled() { return filled; }

    // abstract methods - each shape calculates differently
    public abstract double getArea();
    public abstract double getPerimeter();

    // returns confirmation of resize
    public abstract String resize(double factor);

    @Override
    public String toString() {
        return "Shape (color=" + color + ", filled=" + filled + ")";
    }
}