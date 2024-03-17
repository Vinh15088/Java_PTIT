package Test;

public class hehe {
    public static void main(String[] args) {
        String str1 = "Apple";
        String str2 = "Banana";
        String str3 = "Apple";
        String str4 = "Zebra";

        System.out.println(str1.compareTo(str2)); // âm
        System.out.println(str1.compareTo(str3)); // 0
        System.out.println(str1.compareTo(str4)); // âm
    }
}
