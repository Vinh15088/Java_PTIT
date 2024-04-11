package Bai24;

import java.util.Scanner;

class Iterator {
    private int x;
    private int y;
    public Iterator(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int Add(){
        return x+y;
    }
    public int Subtract() {
        return x-y;
    }
    public int Divide() {
        if(y == 0) return -1;
        else return x/y;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        for(int i=0; i<t; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            Iterator iterator = new Iterator(x,y);
            int add = iterator.Add();
            int subtract = iterator.Subtract();
            int divide = iterator.Divide();

            System.out.println(add + " " + subtract + " " + divide);
        }
    }
}
