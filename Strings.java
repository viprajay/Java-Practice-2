public class Strings {
    public static void main(String[] args) {
        // Concatenation
        String FirstName = "Tony";
        String LastName = "Stark";

        String FullName = FirstName + " " + LastName;
        System.out.println(FullName);
        System.out.println(FullName.length());

        // charAt

        for (int i = 0; i < FullName.length(); i++) {
            System.out.println(FullName.charAt(i));
        }

        // Compare

        // s1 > s2 : +ve value
        // s1 < s2 : -ve value
        // s1 == s2 : 0

        if (FirstName.compareTo(LastName) == 0) {
            System.out.println("Same");
        } else {
            System.out.println("Not Same");
        }

        String sentence = "My name is tony stark.";
        String name = sentence.substring(11);
        String Sname = sentence.substring(11, 15);
        System.out.println(name);
        System.out.println(Sname);

        
    }
}
