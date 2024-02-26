/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP009;

/**
 *
 * @author maidu
 */
import java.util.Scanner;

class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public double slope(Point other) {
        if(this.x == other.x) {
            return -1;
        }
        
        else if(other.y - this.y == 0) return 0;
        
        else {
            return (double) (other.y - this.y) / (other.x - this.x);
        }
    }
    
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int t = scanner.nextInt();
        scanner.nextLine();
        
        for(int i=0; i<t; i++) {
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();
            
            Point point1 = new Point(x1, y1);
            Point point2 = new Point(x2, y2);
            
            double result = point1.slope(point2);
            
            System.out.println(result);
        }
        
    }
}
