/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BASIC010;

/**
 *
 * @author maidu
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        
        for(int i=0; i<t; i++){
            int num = sc.nextInt();           
            System.out.println(swapDigitPairs(num));
        }
    }
    
    public static int swapDigitPairs(int num) {
        int swappedNum = 0, value = 1;
        while(num >= 10) {
            int num1 = num%10;
            num /= 10;
            int num2 = num%10;
            num /= 10;
            
            swappedNum += num1*10*value;
            swappedNum += num2*value;
            
            value *= 100;
        }
        
        swappedNum += num*value;
        
        return swappedNum;
    }
}

