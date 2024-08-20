// public class ThreadClass extends Thread {

//     public void run() {
//         System.out.println("I am Thread class");
//     }

//     public static void main(String[] args) {

//         ThreadClass tc = new ThreadClass();
//         tc.start();
//     }
// }

public class ThreadClass implements Runnable {

    public void run() {
        System.out.println("I am Runnable class");
    }

    public static void main(String[] args) {
        ThreadClass tc = new ThreadClass();
        Thread t = new Thread(tc);
        t.start();
    }
}