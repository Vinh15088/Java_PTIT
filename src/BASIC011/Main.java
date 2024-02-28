/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BASIC011;

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
        
        for(int i=0; i<t; i++) {
            String [] line = scanner.nextLine().split(" ");
            int [] nums = new int[line.length];
            
            for(int j=0; j<line.length; j++) {
                nums[j] = Integer.parseInt(line[j]);
            }
            
            int result = Integer.MAX_VALUE;
            
            for(int j=1; j<line.length; j++) {
                int res = nums[j] - nums[j-1];
                if(res < result) result = res;
            }
            
            System.out.println(result);
        }
    }
}
