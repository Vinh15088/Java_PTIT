package STACK001;

import java.util.Stack;
import java.util.Scanner;
public class Main1 {
    public static void compressDuplicates(Stack<Integer> s) {
        Stack<Integer> stack = new Stack<>();
        int count = 1;
        int current = s.pop();

        while(!s.empty()) {
            int top = s.pop();

            if(top == current) {
                count++;
            }
            else {
                stack.push(count);
                stack.push(current);
                count = 1;
                current = top;
            }
        }
        stack.push(count);
        stack.push(current);

        while(!stack.empty()) {
            s.push(stack.pop());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        for(int i=0; i<t; i++) {
            Stack<Integer> s = new Stack<>();
            String [] line = scanner.nextLine().split(" ");

            for(int j= (line.length - 1); j>=0; j--) {
                s.push(Integer.parseInt(line[j]));
            }

            compressDuplicates(s);

            String results = "";

            while(!s.empty()) {
                results += s.pop() + " ";
            }

            System.out.print(results.trim());
            System.out.println();
        }
    }
}
