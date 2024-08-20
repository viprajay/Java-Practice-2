
class MyThread1 extends Thread {
    public void run() {
        try {
            int i = 0;
            while (i < 200) {
                System.out.println("First Thread");
                System.out.println("Good");
                i++;
                Thread.sleep(5000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class MyThread2 extends Thread {
    public void run() {
        try {
            int i = 0;
            while (i < 200) {
                System.out.println("Second Thread");
                System.out.println("Nice");
                i++;

            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class ThreadConcept {
    public static void main(String[] args) {

        MyThread1 MT1 = new MyThread1();
        MyThread2 MT2 = new MyThread2();

        MT1.start();
        MT2.start();

    }
}
