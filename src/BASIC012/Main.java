/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BASIC012;

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
        
        for(int i=0; i<t; i++) {
            String[] input = sc.nextLine().split(" "); // nhap vao, tach luon thanh mang String dua vao khoang trang
            int [] array = new int[input.length]; 
            
            for(int j=0; j<input.length; j++) {
                array[j] = Integer.parseInt(input[j]); // chuyen doi tu mang String sang Int
            }
            
            System.out.println(longestSortedSequence(array));
        }
    }
    
    public static int longestSortedSequence(int[] array) {
        if(array.length == 0) return 0;
        
        int count1 = 1, count2 = 1;
        
        for(int i=1; i<array.length; i++){
            if(array[i] >= array[i-1]) count1++;
            else count1 = 1;
            
            if(count1 > count2) count2 = count1;
        }
        
        return count2;
    }
}
