import java.util.Scanner;
public class test {
    private String s1;
    private String s2;

    public static void swap(String s1, String s2) {
        String temp = s1;
        s1 = s2;
        s2 = temp;
    }
    public static void main(String[] args) {
      String s1 = "Hello";
      String s2 = "World";
      System.out.println(s1 + " " + s2);
      test.swap(s1, s2);
    }
}