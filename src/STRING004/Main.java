package STRING004;

import java.util.Scanner;
import java.lang.StringBuffer;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        for(int i=0; i<t; i++) {
            String s = scanner.nextLine();
            StringBuffer sb = new StringBuffer(s);

            System.out.println(sb.length());
        }
    }
}
