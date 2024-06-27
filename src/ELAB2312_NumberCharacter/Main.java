/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ELAB2312;

/**
 *
 * @author maidu
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            int count = 0;
            
            for(int i=0; i<line.length(); i++) {
                if(Character.isDigit(line.charAt(i))) count++;
            }
            System.out.println(count);
        }
    }
}
