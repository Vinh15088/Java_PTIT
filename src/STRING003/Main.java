package STRING003;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        for(int i=0; i<t; i++) {
            String str1 = scanner.nextLine();
            String str2 = scanner.nextLine();
            str1 = str1.toUpperCase();
            str2 = str2.toUpperCase();

//            System.out.println(str1 + " " + str2);
            if(str1.equals(str2)) System.out.println("true");
            else System.out.println("false");
        }
    }
}
