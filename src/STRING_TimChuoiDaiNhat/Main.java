package STRING;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        for(int i=0 ;i<t; i++) {
            String [] line = scanner.nextLine().split(" ");
            int index = -1;
            int maxLength = 0;

            for(int j=0; j<line.length; j++) {
                if(line[j].length() >= maxLength) {
                    maxLength = line[j].length();
                    index = j;
                }
            }
            System.out.println(line[index]);
        }
    }
}
