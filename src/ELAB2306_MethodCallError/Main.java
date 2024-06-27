package ELAB2306;

import java.util.Scanner;
import java.io.IOException;
class MyMethods {
    public static void m(int x) {
        try {
            m2(x);
            System.out.println(1);
        } catch (IOException e) {
            System.out.println(2);
        } catch (ArithmeticException e) {
            System.out.println(3);
        }
    }

    public static void m2(int x) throws ArithmeticException, IOException {
        System.out.println(4);
        if (x == 1)
            throw new IOException();
        if (x == 0)
            throw new ArithmeticException();
        if (x == 2) System.out.println(5);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if(num == 0) MyMethods.m(1);
        else if (num == 1) MyMethods.m(0);
        else if (num == 2) MyMethods.m(2);
    }
}
