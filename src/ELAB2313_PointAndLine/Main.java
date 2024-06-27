package ELAB2313_PointAndLine;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Point> points = new ArrayList<Point>();
        ArrayList<String> listName = new ArrayList<String>();
        boolean check = true;
        while (scanner.hasNextLine()){
            try {
                String str = scanner.nextLine();
                String arr[] = str.split(" ");
                if(arr.length != 1 && arr.length != 3){
                    check = false;
                    break;
                }
                if(arr.length == 1){
                    listName.add(str);
                } else {
                    points.add(new Point(Double.parseDouble(arr[0]), Double.parseDouble(arr[1]), Double.parseDouble(arr[2])));
                }
            } catch (Exception e){
                check = false;
                break;
            }
        }
        int diemGoc = -1;
        int d = listName.size();
        int d2 = points.size();
        for(int i = 0; i < d-1; i++){
            if(listName.get(i).equals(listName.get(d-1))){
                diemGoc = i;
            }
        }
        if(!check || diemGoc == -1 || d < 3 || d2 < 2){
            System.out.println("invalid input");
        } else {
            for(int i = 0; i < d-1; i++){
                try {
                    if(i != diemGoc){
                        Line line = new Line(points.get(diemGoc), points.get(i));
                        if(line.calculatorLength() == 0){
                            System.out.println("Line "+ listName.get(diemGoc)+ listName.get(i) + ": same point");
                        } else {
                            System.out.printf("Line %s%s: %.2f\n", listName.get(diemGoc), listName.get(i), line.calculatorLength());
                        }
                    }
                } catch (Exception e){
                    System.out.println("invalid input");
                    break;
                }

            }
        }
    }
}

class Point{
    private double x;
    private double y;
    private double z;
    public Point(double x, double y, double z){
        this.y = y;
        this.x = x;
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }

}

class Line {
    private Point p1; // diem Goc
    private Point p2;
    public Line(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }
    public double calculatorLength(){
        double varX = Math.pow(p1.getX() - p2.getX(), 2);
        double varY = Math.pow(p1.getY() - p2.getY(), 2);
        double varZ = Math.pow(p1.getZ() - p2.getZ(), 2);
        return Math.sqrt(varX + varY + varZ);
    }
}