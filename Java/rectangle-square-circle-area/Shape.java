abstract class Shape {
abstract void rectangleArea(double length, double breadth);
abstract void squareArea(double side);
abstract void circleArea(double radius);
}
class Area extends Shape {
void rectangleArea(double length, double breadth) {
double area = length * breadth;
System.out.println("Area of Rectangle: " + area);
}
void squareArea(double side) {
double area = side * side;
System.out.println("Area of Square: " + area);
}
void circleArea(double radius) {
double area = Math.PI * radius * radius;
System.out.println("Area of Circle: " + area);
}
}
