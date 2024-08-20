public class Variables {
    static int m = 100; // static variable

    void method() {
        int n = 90; // local variable
        System.out.println("Local Variable = "+n);

    }

    public static void main(String args[]) {
        int data = 50; // instance variable
        Variables meth = new Variables();
        meth.method();
        System.out.println("Instance Variable = "+data);
        System.out.println("Static Variable = "+m);
        
    }
}