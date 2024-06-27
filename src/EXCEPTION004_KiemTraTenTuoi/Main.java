package EXCEPTION004;

import java.util.Scanner;

class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        for(int i=0; i<t; i++) {
            String name = scanner.nextLine();
            int age = scanner.nextInt();
            scanner.nextLine();

            try {
                if(name.isEmpty() || name.length() > 40) {
                    throw new Exception("Name is not valid");
                }
                if(age < 0 || age > 120) {
                    throw new Exception("Age is not valid");
                }

                Person person = new Person(name, age);
                System.out.println("Name: " + person.getName() + "--Age:" + person.getAge());
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
