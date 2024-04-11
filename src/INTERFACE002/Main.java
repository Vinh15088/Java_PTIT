package INTERFACE002;

interface TacoBox {
    public int tacoRemaining();
    public void eat();
}

class TripleTacobox {
    protected int tacos;
    public TripleTacobox() {
        tacos = 3;
    }
    public int tacoRemaining() {
        return tacos;
    }
    public void eat() {
        tacos = tacos - 1;
    }
}

class CustomTacobox {
    protected int tacos;
    public CustomTacobox(int tacos) {
        this.tacos = tacos;
    }
    public int tacoRemaining() {
        return tacos;
    }
    public void eat() {
        tacos = tacos - 1;
    }
}
public class Main {
    public static void main(String[] args) {
        TripleTacobox t = new TripleTacobox();
        t.eat();
        t.eat();
        System.out.println("Triple taco boxes left: " + t.tacos);

        CustomTacobox c = new CustomTacobox(8);
        c.eat();
        System.out.println("Custom taco boxes left: " + c.tacos);
    }
}
