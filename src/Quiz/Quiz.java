/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quiz;

import java.util.HashMap;

/**
 *
 * @author maidu
 */
//public class Quiz {
//    public static void Calculate () {
//        int [] nums = {3,4,15,10};
//        int target = 19;
//        
//        int [] res = new int[2];
//        
//        for(int i=0; i<nums.length; i++){
//            for(int j=i+1; j<nums.length-1; j++){
//                if(nums[i] + nums[j] == target) {
//                    res[0] = nums[i];
//                    res[1] = nums[j];
//                    System.out.println("[" + i + ", " + j + "]");
//                    break;
//                }
//            }
//        }       
//    }
//}

public class Quiz {
    public static void Calculate () {
        int [] nums = {3,4,15,10};
        int target = 19;
        
        HashMap<Integer, Integer> map = new HashMap<>();
    
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                int index = map.get(complement);
                System.out.println("[" + index + ", " + i + "]");
                break;
            }
            map.put(nums[i], i);
        }
    }
}


