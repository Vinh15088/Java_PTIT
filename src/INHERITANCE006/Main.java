package INHERITANCE006;

interface Pet {
    public String getName();
    public void setName(String name);
    public void play();
}

class Animal {
    private int legs;
    public Animal(int legs) {
        this.legs = legs;
    }
    public void walk() {
        System.out.println("This animal walks on " + legs + " legs.");
    }
    public void eat() {

    }
}

class Spider extends Animal {
    public Spider() {
        super(8);
    }
    public void eat() {
        System.out.println("The spider eats a fly.");
    }
}

class Fish extends Animal implements Pet {
    private String name;
    public Fish() {
        super(0);
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void play() {
        System.out.println("Fish swim in their tanks all day.");
    }
    public void walk() {
        super.walk();
        System.out.println("Fish, of course, can't walk; they swim.");
    }
    public void eat() {
        System.out.println("Fish eat pond scum.");
    }
}

class Cat extends Animal implements Pet {
    private String name;
    public Cat() {
        super(4);
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void play() {
        System.out.println(name + " likes to play with string.");
    }
    public void eat() {
        System.out.println("Cats like to eat spiders and mice.");
    }
}
public class Main {
    public static void main(String[] args) {
        Spider spider = new Spider();
        Fish fish = new Fish();
        Cat cat = new Cat();

        fish.play();
        fish.walk();

        cat.setName("Fluffy");
        cat.play();
        cat.eat();

        spider.eat();

        cat.walk();
        spider.walk();
    }
}