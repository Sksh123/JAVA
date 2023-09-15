// main class with static main method
public class Main {
    public static void main(String[] args) {
        // create a new student object
        Student student = new Student("1234567890", "John Doe", 20, "123 Main St.", "12th Grade");
        
        // call the displayInfo method on the student object to print the information
        student.displayInfo();
    }
}