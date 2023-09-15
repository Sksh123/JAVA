import java.util.Scanner;
public class practice {
static double PI = 3.14159; // static variable for PI
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter the radius of the sphere: ");
double radius = input.nextDouble();
double area = calculateArea(radius);
double volume = calculateVolume(radius);
System.out.printf("The area of the sphere is %.2f\n", area);
System.out.printf("The volume of the sphere is %.2f\n", volume);
}
// static method to calculate the surface area of a sphere
public static double calculateArea(double radius) {
return 4 * PI * radius * radius;
}
// static method to calculate the volume of a sphere
public static double calculateVolume(double radius) {
return (4/3.0) * PI * radius * radius * radius;
}
}