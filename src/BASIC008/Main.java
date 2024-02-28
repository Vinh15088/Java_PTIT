/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BASIC008;

/**
 *
 * @author maidu
 */
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Numbers between 100 and 200, divisible by 9:");
        
        for(int i=101; i<=200; i++) {
            if(i % 9 == 0) {
                System.out.println(i);
                sum += i;
            }
        }
        
        System.out.println(sum);
    }
}
