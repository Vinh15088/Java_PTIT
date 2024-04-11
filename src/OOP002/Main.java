package OOP002;

import java.util.Scanner;

class Rectangle {
    private int x;
    private int y;
    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getX() {
        return x;
    }

    public  int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Rectangle[x=" + getX() + ",y=" + getY() +
                ",width=" + getWidth() + ",height=" + getHeight() + "]";
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        for(int i=0; i<t; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int width = scanner.nextInt();
            int height = scanner.nextInt();

            Rectangle r = new Rectangle(x, y, width, height);

            System.out.println(r.toString());
        }
    }
}
