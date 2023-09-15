public class RunnableExample implements Runnable {

    public void run() {
        System.out.println("Thread is running.");
    }

    public static void main(String[] args) {
        RunnableExample runnable = new RunnableExample();
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
