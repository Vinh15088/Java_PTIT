package OOP004;
import java.lang.Math;
import java.util.Scanner;

class Point {
    private int x;
    private int y;

    public int getX(){
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void move(int dx, int dy) {
        x = x + dx;
        y = y + dy;
    }
    public double distance(Point p) {
        double d = Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2));
        return d;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        for(int i=0; i<t; i++) {
            int xA = scanner.nextInt();
            int yA = scanner.nextInt();
            int xB = scanner.nextInt();
            int yB = scanner.nextInt();
            Point pA = new Point(xA, yA);
            Point pB = new Point(xB, yB);
            pA.move(1,1);
            double dis = pA.distance(pB);
            String result = String.format("%.2f", dis);
            System.out.println(result);
        }
    }
}
