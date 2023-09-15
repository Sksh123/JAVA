import java.util.Scanner;
public class ConvertSeconds {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
// Reading the number of seconds from the user
System.out.print("Enter the number of seconds: ");
int seconds = scanner.nextInt();
// Calculating the hours, minutes, and remaining seconds
int hours = seconds / 3600;
int minutes = (seconds % 3600) / 60;
seconds = seconds % 60;
// Displaying the result
System.out.println(hours + " hours, " + minutes + " minutes, " +
seconds + " seconds.");
scanner.close();
}
}