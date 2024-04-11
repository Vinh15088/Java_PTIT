package ELAB2308;

import java.util.Scanner;

class Car {
    protected double price;
    protected int year;
    public Car(double price, int year) {
        this.price = price;
        this.year = year;
    }
    @Override
    public String toString() {
        return String.format("Price: %,2f VND | Year: %d", price, year);
    }
    public double calculateSalePrice() {
        return price;
    }
}

class SportCar extends Car {
    public SportCar(double price, int year) {
        super(price, year);
    }
    @Override
    public double calculateSalePrice() {
        if(year > 2018) return price*0.8;
        else if(year > 2010) return price*0.5;
        else return price*0.1;
    }
}

class ClassicCar extends Car {
    public ClassicCar(double price, int year) {
        super(price, year);
    }
    public double calculateSalePrice() {
        return price*1.12 + 20000000;
    }
}
public class Main {
    private static double highestSalePrice = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        for(int i=0; i<t; i++) {
            String [] line = scanner.nextLine().split(" ");

            String typeCar = line[0];
            double price = Double.parseDouble(line[1]);
            int year = Integer.parseInt(line[2]);

            Car car;
            if(typeCar.equals("SC")) {
                car = new SportCar(price, year);
            }
            else car = new ClassicCar(price,year);

            double salePrice = car.calculateSalePrice();
            highestSalePrice = Math.max(highestSalePrice, salePrice);

            System.out.println(String.format("Price: %,.2f VND | Year: %d", salePrice, year));
        }
        String result = String.format("Most Expensive: %,.2f VND", highestSalePrice);
        System.out.println(result);
    }
}
