/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ELAB23_03;

/**
 *
 * @author maidu
 */

class MyStuff {
    private String name;
    
    MyStuff(String name) {
        this.name = name;
//        System.out.println("My Stuff is: " + name);
    }
    
    @Override
    public boolean equals(Object obj) {
        MyStuff other = (MyStuff) obj;
        return name.equals(other.name);
    }
}

public class Main {
    public static void main(String[] args) {
        MyStuff m1 = new MyStuff("PC");
        MyStuff m2 = new MyStuff("PC");
        
        System.out.println("value compared: " + (m1.equals(m2) ? "same" : "different"));
        System.out.println("reference compared: " + (m1 == m2 ? "same" : "different"));
    }
}
