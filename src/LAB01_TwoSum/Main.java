package LAB01_TwoSum;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        for(int i=0; i<t; i++){
            int n = scanner.nextInt();
            int [] nums = new int[n];
            for(int j=0; j<n; j++){
                nums[j] = scanner.nextInt();
            }
            int target = scanner.nextInt();

            HashMap<Integer, Integer> map = new HashMap<>();

            boolean check = false;

            for(int j=0; j<n; j++) {
                int temp = target - nums[j];
                if(map.containsKey(temp)) {
                    int index = map.get(temp);
                    System.out.println(index + " " + j);
                    check = true;
                    break;
                }
                map.put(nums[j], j);
            }

            if(check == false) System.out.println("Not found");
        }
    }
}
