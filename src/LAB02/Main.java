package LAB02;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        String line = scanner.nextLine();

        String num1 = line.substring(11,line.length()-1);

        if(num.equals(num1)) System.out.println("true");
        else System.out.println("false");
    }
}