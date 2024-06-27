package EXCEPTION002;

import java.util.Scanner;

public class Main {
    public static class NotJavaFileException extends Exception {
        public NotJavaFileException(String message) {
            super(message);
        }
    }
    public static void CheckFileExtension(String fileName) throws NotJavaFileException {
        if(fileName.isEmpty()) {
            System.out.println("Not java file exception.Mark is -1");
        }
        else if (!fileName.contains(".java")) {
            throw new NotJavaFileException("0");
        }
        else {
            System.out.println(1);
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
            }
            catch (NotJavaFileException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}