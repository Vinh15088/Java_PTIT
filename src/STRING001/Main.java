package STRING001;

import java.util.Scanner;
import java.lang.String;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        
        for(int i=0; i<t; i++) {
            String [] line = scanner.nextLine().split(" ");
            String str = line[0];
            int index = Integer.parseInt(line[1]);
            char character = 0;        
            for(int j=0; j<str.length(); j++) {
                if(index == j) {
                    character = str.charAt(j);       
                }
            }
            System.out.println("The character at position " + index + " is " + character);
        }
    }
}
