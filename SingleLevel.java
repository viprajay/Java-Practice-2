class Abc1{
        public void add(){
            int a = 20 , b = 10;
            int c = a+b;
            System.out.println(c);
        }
    }
    
    class Abc2 extends Abc1{
        public void sub(){
            int a = 20 , b = 10;
            int c = a-b;
            System.out.println(c);
        }
    }

    public class SingleLevel {
    
    public static void main(String[] args) {
        Abc2 ab = new Abc2();
        ab.add();
        ab.sub();
    }
}

// class Shape {
//    public void display() {
//       System.out.println("Inside display");
//    }
// }
// class Rectangle extends Shape {
//    public void area() {
//       System.out.println("Inside area");
//    }
// }
// public class Tester {
//    public static void main(String[] arguments) {
//       Rectangle rect = new Rectangle();
//       rect.display();
//       rect.area();
//    }
// }
