import javax.swing.*;

public class SamePageLoad2 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JButton b = new JButton("Submit");
        b.setBounds(130, 130, 100, 50);
        f.add(b);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
