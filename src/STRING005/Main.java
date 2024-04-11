package STRING005;

import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static boolean Pangram(String line) {
        line = line.toLowerCase();
        
        HashSet set = new HashSet<> ();
        
        for(char c : line.toCharArray()) {
            if(c >= 'a' && c <= 'z') set.add(c);
        }
        return set.size() == 26;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        
        for(int i=0; i<t; i++) {
            String line = scanner.nextLine();
            
            if(Pangram(line)) System.out.println("true");
            else System.out.println("false");
        }
    }
}
