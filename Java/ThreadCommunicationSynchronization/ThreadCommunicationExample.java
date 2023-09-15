public class ThreadCommunicationExample {

    public static void main(String[] args) {
        Data data = new Data();
        Producer producer = new Producer(data);
        Consumer consumer = new Consumer(data);

        producer.start();
        consumer.start();
    }

    static class Data {
        private int value;
        private boolean isProduced;

        public synchronized void produce(int value) {
            while (isProduced) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            this.value = value;
            isProduced = true;
            System.out.println("Produced " + value);
            notify();
        }

        public synchronized int consume() {
            while (!isProduced) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            isProduced = false;
            System.out.println("Consumed " + value);
            notify();
            return value;
        }
    }

    static class Producer extends Thread {
        private Data data;

        public Producer(Data data) {
            this.data = data;
        }

        public void run() {
            for (int i = 0; i < 5; i++) {
                data.produce(i);
            }
        }
    }

    static class Consumer extends Thread {
        private Data data;

        public Consumer(Data data) {
            this.data = data;
        }

        public void run() {
            for (int i = 0; i < 5; i++) {
                data.consume();
            }
        }
    }
}
