import java.util.*;

public class Book {
    private String isbn;
    private String name;
    private double price;

    public Book(String isbn, String name, double price) {
        this.isbn = isbn;
        this.name = name;
        this.price = price;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " (ISBN: " + isbn + ", Price: " + price + ")";
    }

    public static void main(String[] args) {
        // create Book objects
        Book book1 = new Book("9783161484100", "The Lord of the Rings", 29.99);
        Book book2 = new Book("9780684801469", "To Kill a Mockingbird", 12.99);
        Book book3 = new Book("9780385537858", "The Goldfinch", 18.99);
        Book book4 = new Book("9781593275846", "Eloquent JavaScript", 21.99);
        Book book5 = new Book("9780262033848", "Introduction to Algorithms", 64.99);

        // ArrayList
        List<Book> arrayList = new ArrayList<>();
        arrayList.add(book1);
        arrayList.add(book2);
        arrayList.add(book3);
        arrayList.add(book4);
        arrayList.add(book5);
        System.out.println("ArrayList:");
        for (Book book : arrayList) {
            System.out.println(book);
        }
        System.out.println();

        // LinkedList
        List<Book> linkedList = new LinkedList<>();
        linkedList.add(book1);
        linkedList.add(book2);
        linkedList.add(book3);
        linkedList.add(book4);
        linkedList.add(book5);
        System.out.println("LinkedList:");
        for (Book book : linkedList) {
            System.out.println(book);
        }
        System.out.println();

        // ArrayDeque
        Deque<Book> arrayDeque = new ArrayDeque<>();
        arrayDeque.push(book1);
        arrayDeque.push(book2);
        arrayDeque.push(book3);
        arrayDeque.push(book4);
        arrayDeque.push(book5);
        System.out.println("ArrayDeque:");
        while (!arrayDeque.isEmpty()) {
            System.out.println(arrayDeque.pop());
        }
        System.out.println();

        // PriorityQueue
        Queue<Book> priorityQueue = new PriorityQueue<>(5, Comparator.comparingDouble(Book::getPrice));
        priorityQueue.offer(book1);
        priorityQueue.offer(book2);
        priorityQueue.offer(book3);
        priorityQueue.offer(book4);
        priorityQueue.offer(book5);
        System.out.println("PriorityQueue:");
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
        System.out.println();

        // HashSet
        Set<Book> hashSet = new HashSet<>();
        hashSet.add(book1);
        hashSet.add(book2);
        hashSet.add(book3);
        hashSet.add(book4);
        hashSet.add(book5);
        System.out.println("HashSet:");
        for (Book book : hashSet) {
            System.out.println(book);
        }
        System.out.println();

        // TreeSet
        Set<Book> treeSet = new TreeSet<>(Comparator.comparing(Book::getName));
        treeSet.add(book1);
        treeSet.add(book2);
        treeSet.add(book3);
        treeSet.add(book4);
        treeSet.add(book5);
        System.out.println("TreeSet:");
        for (Book book : treeSet) {
            System.out.println(book);
        }
        System.out.println();

        // HashMap
        Map<String, Book> hashMap = new HashMap<>();
        hashMap.put(book1.getIsbn(), book1);
        hashMap.put(book2.getIsbn(), book2);
        hashMap.put(book3.getIsbn(), book3);
        hashMap.put(book4.getIsbn(), book4);
        hashMap.put(book5.getIsbn(), book5);
        System.out.println("HashMap:");
        for (String isbn : hashMap.keySet()) {
            System.out.println(isbn + ": " + hashMap.get(isbn));
        }
        System.out.println();

        // LinkedHashMap
        Map<String, Book> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(book1.getIsbn(), book1);
        linkedHashMap.put(book2.getIsbn(), book2);
        linkedHashMap.put(book3.getIsbn(), book3);
        linkedHashMap.put(book4.getIsbn(), book4);
        linkedHashMap.put(book5.getIsbn(), book5);
        System.out.println("LinkedHashMap:");
        for (String isbn : linkedHashMap.keySet()) {
            System.out.println(isbn + ": " + linkedHashMap.get(isbn));
        }
        System.out.println();
    }
}
