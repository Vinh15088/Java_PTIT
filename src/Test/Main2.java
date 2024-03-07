package Test;

class Exam {
   static void exam(int [] arr, int i, Integer wi) {
       arr[0] = i + wi;
   }
   static void exam(int i, Integer wi, Integer[] arr) {
       arr[0] = i - wi;
   }
}

public class Main2 {
   public static void main(String[] args) {
       int arr_i = 10;
       int [] i  = {1,2,3};
       Integer[] arr_wi = {3,4,5};
       Exam.exam(i, arr_i, arr_wi[1]);
       Exam.exam(arr_i, i[0], arr_wi);
       System.out.println(i + " " + arr_i + " " + arr_wi[0]);
   }
}
