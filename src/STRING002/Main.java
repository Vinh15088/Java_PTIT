package STRING002;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        for(int i=0; i<t; i++) {
            String [] line = scanner.nextLine().split(" ");
            String str = scanner.nextLine();

            line[line.length-1].substring(0, line.length-2);

            int index = 0;
            for(int j=0; j< line.length; j++) {
                if(line[j].equals(str)){
                    index = 1;
                }
            }
            if(index == 1) {
                System.out.println("true");
            }
            else System.out.println("false");
        }
    }
}
