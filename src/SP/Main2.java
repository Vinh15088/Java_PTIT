import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so: ");
        double soThapPhan = scanner.nextDouble();

        int phanNguyen = (int) soThapPhan;
        StringBuilder phanNguyenNhiPhan = new StringBuilder();

        while (phanNguyen > 0) {
            int digit = phanNguyen % 2;
            phanNguyenNhiPhan.insert(0, digit);
            phanNguyen /= 2;
        }

        double phanThapPhan = soThapPhan - (int) soThapPhan;
        StringBuilder phanThapPhanNhiPhan = new StringBuilder();
        while (phanThapPhan != 0) {
            phanThapPhan *= 2;
            int digit = (int) phanThapPhan;
            phanThapPhanNhiPhan.append(digit);
            phanThapPhan -= digit;
        }

        System.out.println("Dang nhi phan: " + phanNguyenNhiPhan + "." + phanThapPhanNhiPhan);
    }
}
