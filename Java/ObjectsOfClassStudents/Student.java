import java.util.*;

public class Student {
    private int rollNumber;
    private String name;
    private String gender;

    public Student(int rollNumber, String name, String gender) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.gender = gender;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public static void main(String[] args) {
        // Create a list of students using ArrayList
        List<Student> studentList1 = new ArrayList<>();
        studentList1.add(new Student(1, "John", "Male"));
        studentList1.add(new Student(2, "Jane", "Female"));
        studentList1.add(new Student(3, "Bob", "Male"));

        // Print the list of students
        System.out.println("List of students using ArrayList:");
        for (Student student : studentList1) {
            System.out.println(student.toString());
        }

        // Create a list of students using LinkedList
        List<Student> studentList2 = new LinkedList<>();
        studentList2.add(new Student(1, "John", "Male"));
        studentList2.add(new Student(2, "Jane", "Female"));
        studentList2.add(new Student(3, "Bob", "Male"));

        // Print the list of students
        System.out.println("\nList of students using LinkedList:");
        for (Student student : studentList2) {
            System.out.println(student.toString());
        }

        // Create a deque of students using ArrayDeque
        Deque<Student> studentDeque = new ArrayDeque<>();
        studentDeque.add(new Student(1, "John", "Male"));
        studentDeque.add(new Student(2, "Jane", "Female"));
        studentDeque.add(new Student(3, "Bob", "Male"));

        // Print the deque of students
        System.out.println("\nDeque of students using ArrayDeque:");
        for (Student student : studentDeque) {
            System.out.println(student.toString());
        }

        // Create a priority queue of students using PriorityQueue
        Queue<Student> studentPriorityQueue = new PriorityQueue<>(Comparator.comparing(Student::getName));
        studentPriorityQueue.add(new Student(1, "John", "Male"));
        studentPriorityQueue.add(new Student(2, "Jane", "Female"));
        studentPriorityQueue.add(new Student(3, "Bob", "Male"));

        // Print the priority queue of students
        System.out.println("\nPriority queue of students using PriorityQueue:");
        while (!studentPriorityQueue.isEmpty()) {
            System.out.println(studentPriorityQueue.poll().toString());
        }

        // Create a set of students using HashSet
        Set<Student> studentSet1 = new HashSet<>();
        studentSet1.add(new Student(1, "John", "Male"));
        studentSet1.add(new Student(2, "Jane", "Female"));
        studentSet1.add(new Student(3, "Bob", "Male"));

        // Print the set of students
        System.out.println("\nSet of students using HashSet:");
        for (Student student : studentSet1) {
            System.out.println(student.toString());
        }

        // Continue to the next step for more collection components
        Set<Student> studentSet2 = new TreeSet<>(Comparator.comparing(Student::getName));
        studentSet2.add(new Student(1, "John", "Male"));
        studentSet2.add(new Student(2, "Jane", "Female"));
        studentSet2.add(new Student(3, "Bob", "Male"));

        // Print the set of students
        System.out.println("\nSet of students using TreeSet:");
        for (Student student : studentSet2) {
            System.out.println(student.toString());
        }

        // Create a map of students using HashMap
        Map<Integer, Student> studentMap1 = new HashMap<>();
        studentMap1.put(1, new Student(1, "John", "Male"));
        studentMap1.put(2, new Student(2, "Jane", "Female"));
        studentMap1.put(3, new Student(3, "Bob", "Male"));

        // Print the map of students
        System.out.println("\nMap of students using HashMap:");
        for (Map.Entry<Integer, Student> entry : studentMap1.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue().toString());
        }

        // Create a map of students using LinkedHashMap
        Map<Integer, Student> studentMap2 = new LinkedHashMap<>();
        studentMap2.put(1, new Student(1, "John", "Male"));
        studentMap2.put(2, new Student(2, "Jane", "Female"));
        studentMap2.put(3, new Student(3, "Bob", "Male"));

        // Print the map of students
        System.out.println("\nMap of students using LinkedHashMap:");
        for (Map.Entry<Integer, Student> entry : studentMap2.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue().toString());
        }
    }
}
