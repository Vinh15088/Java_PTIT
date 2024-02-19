/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BASIC005;

/**
 *
 * @author maidu
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int t;
        Scanner scanner = new Scanner(System.in);
        t = scanner.nextInt();
        
        for(int i=0; i<t; i++){
            int sum = 0;
            for(int j=0; j<5; j++) {
                int temp = scanner.nextInt();
                sum += temp;
            }
            
            System.out.println(sum);
        }
    }
}
