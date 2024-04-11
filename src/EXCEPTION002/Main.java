package EXCEPTION002;

import java.util.Scanner;

public class Main {
    public static void CheckFileExtension(String fileName) throws Exception {
        if(fileName.isEmpty()) {
            throw new Exception("Not java file exception.Mark is -1");
        }
        else {
            String file = ".java";
            if(fileName.contains(file)) System.out.println("1");
            else System.out.println("0");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        for(int i=0; i<t; i++) {
            String fileName = scanner.nextLine();

            try {
                CheckFileExtension(fileName);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
