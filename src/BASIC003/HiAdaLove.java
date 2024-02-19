/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BASIC003;

/**
 *
 * @author maidu
 */
import java.util.*;

public class HiAdaLove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        for(int i=0; i<t; i++){
            String name = scanner.nextLine();
            System.out.println("Hi " + name);
        }
    }
}
