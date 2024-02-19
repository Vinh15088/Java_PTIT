/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB01_BigInt;

/**
 *
 * @author maidu
 */
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=0; i<t; i++) {
            String s1 = sc.next();          
            String op = sc.next();
            String s2 = sc.next();

            BigInteger num1 = new BigInteger(s1);
            BigInteger num2 = new BigInteger(s2);
            BigInteger result;
            
            switch(op) {
              case "+":
                  result = num1.add(num2);
                  System.out.println(result);
                  break;
              case "-": 
                  result = num1.subtract(num2);
                  System.out.println(result);
                  break;  
              case "*":
                  result = num1.multiply(num2);
                  System.out.println(result);
                  break;
            }         
        }
    }
}
