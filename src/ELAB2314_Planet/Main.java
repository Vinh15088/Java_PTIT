package ELAB2314;

import java.util.Scanner;

class HanhTinh {
    private double khoiLuong;
    private double banKinh;
    private double G = 6.67300e-11;

    private double SurfaceGravity = (5.976e+24 * G) / (6.37814e6 * 6.37814e6);
    public HanhTinh(double khoiLuong, double banKinh) {
        this.khoiLuong = khoiLuong;
        this.banKinh = banKinh;
    }
    public double trongLucBeMat() {
        return (khoiLuong*G)/(banKinh*banKinh);
    }

    public double khoiLuongBeMat(double khoiLuongVat) {
        return khoiLuongVat*trongLucBeMat() / (SurfaceGravity);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameEarth = scanner.nextLine();
        double khoiLuong = scanner.nextDouble();
        double banKinh = scanner.nextDouble();
        double m = scanner.nextDouble();

        HanhTinh h1 = new HanhTinh(khoiLuong, banKinh);
        double result = h1.khoiLuongBeMat(m);
        String value = String.format("%.2f", result);
        System.out.println("Your weight on " + nameEarth + " is " + value);
    }
}