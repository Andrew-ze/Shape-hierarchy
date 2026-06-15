# Geometric Shapes Hierarchy

A demonstration of abstraction and polymorphism using an inheritance hierarchy of shapes, built as part of Object Oriented Programming project, implemented in Java SE (JDK 8+).

## Project Structure

'''
.
├── Shape.java
├── Circle.java
├── Rectangle.java
├── Triangle.java
├── InvalidShapeException.java
└── ShapeDemo.java
'''

## Classes

- **Shape** – abstract base class (color, filled status, abstract `getArea()`, `getPerimeter()`, `resize()`)
- **Circle** – concrete shape defined by radius
- **Rectangle** – concrete shape defined by width and height
- **Triangle** – concrete shape defined by three sides, with triangle inequality validation
- **InvalidShapeException** – unchecked exception thrown when shape dimensions are invalid
- **ShapeDemo** – contains `printAreas()` and `largest()` utility methods, plus a working example

## Key Features

- `Shape` is abstract — it cannot be instantiated directly, only extended
- Dynamic binding: calling `getArea()` on a `Shape` reference resolves to the correct subclass implementation at runtime
- Each subclass overrides `getArea()`, `getPerimeter()`, and `resize()` with its own calculation
- `Triangle` validates the triangle inequality (`a + b > c` for all sides) in its constructor
- Demonstrates catching `InvalidShapeException` for an invalid triangle (e.g. sides 1, 1, 10)

## How to Run

'''
javac Shape.java Circle.java Rectangle.java Triangle.java InvalidShapeException.java ShapeDemo.java
java ShapeDemo
'''

## Design Notes

- `Shape` being abstract enforces that every concrete shape must define its own area/perimeter logic — there's no meaningful default
- `InvalidShapeException` extends `RuntimeException` (unchecked) since invalid dimensions represent a programming/logic error, not a recoverable external condition
- Each subclass *depends on* `InvalidShapeException` to enforce its own validity at construction time

## Requirements

- Java SE Development Kit (JDK) 8 or higher

## Author

Andrew Ategeka.
