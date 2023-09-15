public class ThreadClassExample extends Thread {

    public void run() {
        System.out.println("Thread is running.");
    }

    public static void main(String[] args) {
        ThreadClassExample thread = new ThreadClassExample();
        thread.start();
    }
}
