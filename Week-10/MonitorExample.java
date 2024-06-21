// Monitors Example using wait() and notify()
public class MonitorExample {
    public static void main(String[] args) {
        final Processor processor = new Processor();

        Thread thread1 = new Thread(() -> {
            try {
                processor.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                processor.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread1.start();
        thread2.start();
    }
}

class Processor {
    public void produce() throws InterruptedException {
        synchronized (this) {
            System.out.println("Producer thread running...");
            wait(); // Releases the lock and waits until notify() or notifyAll() is called

            System.out.println("Resumed.");
        }
    }

    public void consume() throws InterruptedException {
        Thread.sleep(1000); // Simulating some processing time
        synchronized (this) {
            System.out.println("Consumer thread running...");
            notify(); // Wakes up the waiting thread

            // Uncomment to demonstrate notifyAll()
            // Thread.sleep(2000); // Simulating some processing time
            // notifyAll(); // Wakes up all waiting threads

            Thread.sleep(3000); // Simulating some processing time after notifying
        }
    }
}
