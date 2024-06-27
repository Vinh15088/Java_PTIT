package OOP015;

import java.util.Scanner;
class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
    @Override
    public String toString() {
        return this.name + " - " + this.address;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < t; i++) {
            String s1 = scanner.nextLine();
            String s2 = scanner.nextLine();

            Person p = new Person(s1, s2);
            System.out.println(p.toString());
        }
    }
}
