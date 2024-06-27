package STACK001;

import java.util.Stack;
import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;
public class Main {
    public static void compressDuplicates(Stack<Integer> s) {
        Queue<Integer> queue = new LinkedList<>();
        int count = 1;
        int current = s.pop();
        while (!s.isEmpty()) {
            int top = s.pop();
            if (top == current) {
                count++;
            } else {
                queue.add(current);
                queue.add(count);
                count = 1;
                current = top;
            }
        }
        queue.add(current);
        queue.add(count);

        while (!queue.isEmpty()) {
            s.push(queue.poll());
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < t; i++) {
            String[] line = scanner.nextLine().split(" ");
            Stack<Integer> stack = new Stack<>();
            for (String element : line) {
                stack.push(Integer.parseInt(element));
            }

            compressDuplicates(stack);

            while (!stack.isEmpty()) {
                System.out.print(stack.pop() + " ");
            }
            System.out.println();
        }
    }
}