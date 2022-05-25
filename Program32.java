import java.lang.Thread;

class Thread1 extends Thread {
    public void run() {
        int i = 0;
        while (i <= 5) {
            System.out.println("Thread is running");
            i++;

        }
    }
}

class Thread2 extends Thread {
    public void run() {
        int i = 0;
        while (i <= 5) {
            System.out.println("Thread 2 is running");
            i++;
        }
    }
}

class Program32 {
    public static void main(String[] args) {
        System.out.println("\nEN20CS301266");
        System.out.println("NAMAN KUMAR PATEL\n\n");
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
        t1.setName("Thread number 1");
        System.out.println(t1.getName());
        t2.setName("Thread number 2");
        System.out.println(t2.getName());
        try {
            t2.join();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
