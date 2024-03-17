/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BASIC007;

/**
 *
 * @author maidu
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        
        for(int i=0; i<t; i++){
            int year = scanner.nextInt();

            if(year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) {
                System.out.println(year + " : Leap-year");
            }
            else System.out.println(year + " : Non Leap-year");
        }
    }
}
