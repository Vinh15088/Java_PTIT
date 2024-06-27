package LAB01_BigDec;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static BigDecimal solve(String [] line) {
        BigDecimal result = BigDecimal.ZERO;

        for(String num:line) {
            BigDecimal temp = new BigDecimal(num);
            result = result.add(temp.remainder(BigDecimal.ONE));
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        for(int i=0; i<t; i++) {
            String [] line = scanner.nextLine().split(" ");

            System.out.println(solve(line));
        }
    }
}


//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int t = scanner.nextInt();
//        scanner.nextLine();
//
//        for(int i=0; i<t; i++) {
//            String [] line = scanner.nextLine().split(" ");
//
//            BigDecimal res =  BigDecimal.ZERO;
//
//            for(String num:line) {
//                BigDecimal temp = new BigDecimal(num);
//                res = res.add(temp.remainder(BigDecimal.ONE));
//            }
//
//            System.out.println(res);
//
//        }
//    }
//}