public class Return {

    int add() {
        int a = 10, b = 20;
        int c = a+b;
        System.out.println(c);
        // System.out.println(a + b);
        return a;
        
    }

    public static void main(String[] args) {
        Return asl = new Return();
        asl.add();
        System.out.println("hiji");

    }
}
