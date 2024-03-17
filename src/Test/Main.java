package Test;

class Exam {
   static void exem(int i, Integer wi, Integer [] a, int len) {
       a[0] = wi;
       wi = a[len-1];
       wi = i;
   }
}

public class Main {
   public static void main(String[] args) {
       Integer[] arr = {10, 20};
       Exam.exem(30, arr[1], arr, arr.length);
       System.out.println(arr[0]);
       System.out.println(arr[1]);
   }
}
