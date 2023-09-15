public class Student {
    private String prn;
    private String name;
    private int age;
    private String address;
    private String className;

    // constructor method to initialize instance variables
    public Student(String prn, String name, int age, String address, String className) {
        this.prn = prn;
        this.name = name;
        this.age = age;
        this.address = address;
        this.className = className;
    }

    // instance method to display student information
    public void displayInfo() {
        System.out.println("PRN: " + prn);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Class: " + className);
    }
}


