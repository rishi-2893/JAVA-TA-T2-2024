// Creating Threads Example
public class CreatingThreadsExample {
    public static void main(String[] args) {
        // Method 1: Extend Thread class
        Thread thread1 = new MyThread();
        thread1.start();

        // Method 2: Implement Runnable interface
        Runnable runnable = new MyRunnable();
        Thread thread2 = new Thread(runnable);
        thread2.start();

        // Method 3: Anonymous class
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 3 is running");
            }
        });
        thread3.start();

        // Method 4: Lambda expression
        Thread thread4 = new Thread(() -> System.out.println("Thread 4 is running"));
        thread4.start();
    }
}

// Thread class implementation
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread is running");
    }
}

// Runnable interface implementation
class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("MyRunnable is running");
    }
}
