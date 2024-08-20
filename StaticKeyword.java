
public class StaticKeyword {

    int emp_id;
    String name;
    static String comp_name = "vip";

    StaticKeyword(int emp_id, String name) {
        this.emp_id = emp_id;
        this.name = name;

    }

    void display() {
        System.out.println(emp_id + " " + name + " " + comp_name);
    }

    public static void main(String[] args) {

        StaticKeyword sk1 = new StaticKeyword(101, "viprajay1");
        StaticKeyword sk2 = new StaticKeyword(102, "viprajay2");

        sk1.display();
        sk2.display();
    }
}