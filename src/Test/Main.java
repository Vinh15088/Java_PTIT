package Test;

import java.util.*;
public class Main {
    public static void removeShorterStrings(ArrayList<String> list) {
        ArrayList<String> res = new ArrayList<>();

        for(int i=0; i< list.size(); i+=2) {
            if(list.size()%2 == 1 && i == list.size()-1) {
                res.add(list.get(list.size()-1));
                break;
            }
            String str1 = list.get(i);
            String str2 = list.get(i+1);

            if(str1.length() <= str2.length()) res.add(str2);
            else res.add(str1);
        }
        for(int i=0; i<res.size(); i++) {
            System.out.print(res.get(i));
            if(i != res.size()-1) System.out.print(" ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        for(int i=0; i<t; i++) {
            String [] line = scanner.nextLine().split(" ");
            ArrayList<String> list = new ArrayList<>();
            for(String x:line) list.add(x);

            removeShorterStrings(list);
            System.out.println();
        }
    }
}
