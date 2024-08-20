
class MyThreads1 extends Thread {
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("Waiter First.");
            System.out.println("Waiter Second.");
            i++;
        }
    }
}

class MyThreads2 extends Thread {
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("Waiter Third.");
            System.out.println("Waiter Fourth");
            i++;
        }
    }
}

public class Threads {
    public static void main(String[] args) {

        MyThreads1 th1 = new MyThreads1();
        MyThreads2 th2 = new MyThreads2();
        th1.start();
        th2.start();
    }
}