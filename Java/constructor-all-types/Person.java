public class Person {
    private String name;
    private int age;

    // Default constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Getter and setter methods
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Main method within the Person class
    public static void main(String[] args) {
        // Create a Person object using the default constructor
        Person person1 = new Person();

        // Set the name and age using setter methods
        person1.setName("John");
        person1.setAge(30);

        // Create a Person object using the parameterized constructor
        Person person2 = new Person("Alice", 25);

        // Create a Person object using the copy constructor
        Person person3 = new Person(person1);

        // Display information about the persons
        System.out.println("Person 1: Name=" + person1.getName() + ", Age=" + person1.getAge());
        System.out.println("Person 2: Name=" + person2.getName() + ", Age=" + person2.getAge());
        System.out.println("Person 3 (Copy of Person 1): Name=" + person3.getName() + ", Age=" + person3.getAge());
    }
}
