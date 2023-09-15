package useful;

public class Main {
public static void main(String[] args) {
// Create an object of Useme class
Useme u = new Useme();
// Calculate area of a rectangle
System.out.println("Area of rectangle: " + u.area("rectangle", 4.0, 5.0));
// Calculate area of a circle
System.out.println("Area of circle: " + u.area("circle", 2.0));
// Calculate percentage
System.out.println("Percentage: " + u.percentage(100.0, 75.0));
}
}