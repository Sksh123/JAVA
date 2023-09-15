package useful;
public class Useme {
public double area(String shape, double... params) {
if (shape.equals("rectangle")) {
double length = params[0];
double breadth = params[1];
return length * breadth;
} else if (shape.equals("circle")) {
double radius = params[0];
return Math.PI * radius * radius;
} else {
return 0.0;
}
}
public double percentage(double totalMarks, double obtainedMarks) {
return (obtainedMarks / totalMarks) * 100.0;
}
}
