package SP;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap j: ");
        int j = scanner.nextInt();

        int p = 5;

        int n = j + p;

        String N = convertToHex(n);
        System.out.println("Chuyen n sang hex: " + N);

        String binaryN = convertToBinary(N);
        System.out.println("Chuyen n sang binary: " + binaryN);
    }

    public static String convertToHex(int number) {
        StringBuilder hex = new StringBuilder();

        while (number != 0) {
            int remainder = number % 16;

            if (remainder < 10) hex.insert(0, (char) (remainder + 48));
            else hex.insert(0, (char) (remainder + 55));

            number /= 16;
        }
        return hex.toString();
    }

    public static String convertToBinary(String hex) {
        StringBuilder binary = new StringBuilder();

        for (int i = 0; i < hex.length(); i++) {
            int decimal = Integer.parseInt(String.valueOf(hex.charAt(i)), 16);
            String binaryDigit = "";

            while (decimal > 0) {
                binaryDigit = decimal % 2 + binaryDigit;
                decimal /= 2;
            }

            binary.append(String.format("%4s", binaryDigit).replace(' ', '0'));
        }
        return binary.toString();
    }
}
