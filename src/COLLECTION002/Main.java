package COLLECTION002;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void removeShorterStrings(ArrayList<String> list) {
        for(int i=0; i<list.size()-1; i++) {
            String current = list.get(i);
            String next = list.get(i+1);

            if(current.length() > next.length()) list.remove(i+1);
            else list.remove(i);
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        for(int i=0; i<t; i++) {
            String [] line = scanner.nextLine().split(" ");

            ArrayList<String> list = new ArrayList<>();

            for(String x:line) {
                list.add(x);
            }

            removeShorterStrings(list);

            for(String x:list) {
                System.out.print(x + " ");
            }

            System.out.println();
        }
    }
}
