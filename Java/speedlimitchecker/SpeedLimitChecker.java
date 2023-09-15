public class SpeedLimitChecker {
public static final int SPEED_LIMIT = 100; // final variable for speed limit

public static void main(String[] args) {
int carSpeed = 110; // example car speed
if (carSpeed > SPEED_LIMIT) {
System.out.println("ALERT: Speed limit exceeded! Current speed is " + carSpeed + "km/h.");
} else {
System.out.println("Car speed is within the speed limit.");
}
}
}