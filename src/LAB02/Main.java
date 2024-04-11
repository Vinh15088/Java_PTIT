package LAB02;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.nextLine();
        String line = scanner.nextLine();

        String num1 = line.substring(11,line.length()-1);
        num1 = num1.replaceAll(" ", "");
//        String num2 = String.valueOf(num);
//        if(num1.equals(num2)) System.out.println("true");
//        else System.out.println("false");

        int num2 = Integer.parseInt(num1);

        if(num == num2) System.out.println("true");
        else System.out.println("false");
    }
}