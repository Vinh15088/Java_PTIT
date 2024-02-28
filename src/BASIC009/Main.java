/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BASIC009;

/**
 *
 * @author maidu
 */

import java.util.Scanner;

public class Main {
    public static int quadrant(int x, int y) {
        if(x == 0 || y == 0) return 0;
        else if (x > 0 && y > 0) return 1;
        else if(x < 0 && y > 0) return 2;
        else if(x < 0 && y < 0) return 3;
        else return 4;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        
        for(int i=0; i<t; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            
            int result = quadrant(x,y);
            System.out.println(result);
            
        }
    }
}
