package org.krithika.SingletonPattern;

public class ThreadSafeSingleton {
    //Volatile ensures changes are visible across threads and prevents cached values in the thread.
    private static volatile ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
        System.out.println("Thread-safe singleton instance created by: " + Thread.currentThread().getName());
    }

    //Double-checked locking for thread-safe lazy initialization
    //Synchronized ensures only one thread creates the instance
    public static ThreadSafeSingleton getInstance() {
        if(instance == null) {
            //To make thread safe
            synchronized (ThreadSafeSingleton.class) {
                //check again as multiple threads can reach above step
                if(instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }

    //Hashcode used to show that all threads received the same object.
    //In java, hashcode is like an object id. Same hash = same object.
    //Multiple threads prove that singleton works under concurrent access.
    //Concurrent access means multiple threads trying to use or create the singleton at the same time.
    public void log(String threadName) {
        System.out.println("ThreadName " + threadName + " is using the instance: " + this.hashCode());
    }

    public static void main(String[] args) {
        Runnable task = () -> {
            String threadName = Thread.currentThread().getName();
            ThreadSafeSingleton singleton = ThreadSafeSingleton.getInstance();
            System.out.println("ThreadName: " + threadName);
            singleton.log(threadName);
        };

        //Creating 5 threads to test Singleton
        Thread t1 = new Thread(task, "Thread-A");
        Thread t2 = new Thread(task, "Thread-B");
        Thread t3 = new Thread(task, "Thread-C");
        Thread t4 = new Thread(task, "Thread-D");
        Thread t5 = new Thread(task, "Thread-E");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
