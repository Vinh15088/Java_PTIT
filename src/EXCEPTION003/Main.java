package EXCEPTION003;

import java.util.Scanner;

public class Main {
    public static void hasVowels(String str) throws Exception {
        boolean check = false;

        for(char c:str.toCharArray()) {
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                check = true;
                break;
            }
        }

        if(!check) {
            throw new Exception("String not contain vowels");
        }
        else System.out.println("String has vowels");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        for(int i=0; i<t; i++) {
            String str = scanner.nextLine();

            try {
                hasVowels(str);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
