package LAB01_ClassMain;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        for(int i=0; i<t; i++){
            String line = scanner.nextLine();
            String [] words = line.split(" ");
            System.out.println(line.length() + " " + words.length);
        }
    }
}
