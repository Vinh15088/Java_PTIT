/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TET_HOLIDAY;

/**
 *
 * @author maidu
 */
class Dog {
    private String name;
    private String breed;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public void printDogDetail() {
        System.out.println("Name:" + name + "--Breed:" + breed + "--Age:" + age);
    }
}
public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        
        dog1.setName("Micky");
        dog1.setBreed("Husky");
        dog1.setAge(12);
        
        dog1.printDogDetail();
        
    }
}

