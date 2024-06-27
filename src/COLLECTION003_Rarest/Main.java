package COLLECTION003;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        for(int i=0; i<t; i++) {
            String [] line = scanner.nextLine().split(" ");

            Map<String, Integer> map = new HashMap<>();

            for(int j=0; j<line.length; j+=2) {
                String name = line[j];
                int age = Integer.parseInt(line[j+1]);
                map.put(name, age);
            }

            System.out.println(rarest(map));
        }
    }

    public static int rarest(Map<String, Integer> map) {
        Map<Integer, Integer> ageCount = new HashMap<>();

        for(int age:map.values()) {
            ageCount.put(age, ageCount.getOrDefault(age,0) + 1);
        }

        int minAge = Integer.MAX_VALUE;
        int minCount = Integer.MAX_VALUE;

         for(int age:ageCount.keySet()) {
             int count = ageCount.get(age);

             if(count < minCount || (count == minCount && age < minAge)) {
                 minAge = age;
                 minCount = count;
             }
         }
         return minAge;
    }

}
