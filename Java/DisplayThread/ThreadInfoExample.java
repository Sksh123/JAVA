public class ThreadInfoExample {

    public static void main(String[] args) {
        // Get the currently running thread
        Thread currentThread = Thread.currentThread();

        // Display information about the thread
        System.out.println("Thread Name: " + currentThread.getName());
        System.out.println("Thread ID: " + currentThread.getId());
        System.out.println("Thread Priority: " + currentThread.getPriority());
        System.out.println("Thread State: " + currentThread.getState());
        System.out.println("Thread Group: " + currentThread.getThreadGroup());
    }
}
