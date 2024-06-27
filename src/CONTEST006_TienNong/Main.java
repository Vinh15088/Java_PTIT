package CONTEST006_TienNong;

import java.util.ArrayList;
import java.util.Scanner;

interface Moveable {
    public void move(int dx, int dy);
}
class Organism implements Moveable {
    private int x;
    private int y;
    public Organism(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void move(int dx, int dy) {
        x = x + dx;
        y = y + dy;
    }
    public String toString() {
        return "x:" + x + ";y:" + y;
    }
}
class Herd {
    private ArrayList<Organism> organisms;
    public Herd() {
        organisms = new ArrayList<>();
    }
    public void addToHerd(Organism organism) {
        organisms.add(organism);
    }
    public void move() {
        for(Organism organism:organisms) {
            organism.move(1,1);
        }
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Organism organism:organisms) {
            sb.append(organism.toString()).append("\n");
        }
        return sb.toString();
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        Herd herd = new Herd();
        for(int i=0; i<t; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            scanner.nextLine();
            Organism organism = new Organism(x,y);
            herd.addToHerd(organism);
        }
        herd.move();
        System.out.println(herd.toString());
    }
}