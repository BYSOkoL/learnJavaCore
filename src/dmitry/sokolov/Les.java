package dmitry.sokolov;

import java.util.Arrays;

public class Les {
    public static void main(String[] args) {
        String s1 = "Cat";
        String s2 = "Cat";
        String s3 = new String("Cat");
        String s4 = s3.intern();
        System.out.println("s1 == s2 : " + (s1 == s2));
        System.out.println("s1 == s3 : " + (s1 == s3));
        System.out.println("s1 == s4 : " + (s1 == s4));
        System.out.println("s1 == s3 : " + (s1.equals(s3)));
    }
}
