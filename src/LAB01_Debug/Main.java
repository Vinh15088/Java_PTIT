package LAB01_Debug;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = {0, 3, 3, 0};
        System.out.println(arr[random.nextInt(3)]);
    }
}