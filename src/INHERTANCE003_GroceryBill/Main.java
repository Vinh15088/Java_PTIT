package INHERTANCE003;

import java.util.ArrayList;

class Item {
    private String name;
    private double price;
    private double discount;
    public Item(String name, double price, double discount) {
        this.discount = discount;
        this.price = price;
        this.name = name;
    }
    public double getPrice() {return price;}
    public double getDiscount() {return discount;}
    public String toString() {
        return String.format("   %s $%.2f (-$%.2f)", name,price,discount);
    }
}
class Employee {
    private String name;
    public Employee(String name) {
        this.name = name;
    }
    public String getName() {return name;}
}
class GroceryBill {
    private Employee clerk;
    protected ArrayList<Item> receipt;
    private double total;
    public GroceryBill(Employee clerk) {
        this.clerk = clerk;
        total = 0;
        receipt = new ArrayList<Item>();
    }
    public double getTotal() {
        return total;
    }
    public Employee getClerk() {
        return clerk;
    }
    public void add(Item i) {
        total += i.getPrice();
        receipt.add(i);
    }
    public String toString() {
        StringBuilder sb = new StringBuilder("items:\n");
        for(Item i:receipt) sb.append(i.toString()).append("\n");
        sb.append("total: ").append(String.format("$%.2f", getTotal())).append("\n");
        sb.append("Clerk: ").append(getClerk().getName()).append("\n");
        return sb.toString();
    }
}
class DiscountBill extends GroceryBill{
    private double discountAmount;
    private double sub_total;
    private double total;
    public DiscountBill(Employee clerk) {
        super(clerk);
        this.total = 0;
        this.sub_total = 0;
    }
    public void add(Item i) {
        receipt.add(i);
        sub_total += i.getPrice();
        discountAmount += i.getDiscount();
        total = sub_total - discountAmount;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder("items:\n");
        for(Item i:receipt) sb.append(i.toString()).append("\n");
        sb.append("sub-total: ").append(String.format("$%.2f", sub_total)).append("\n");
        sb.append("discount: ").append(String.format("$%.2f",discountAmount)).append("\n");
        sb.append("total: ").append(String.format("$%.2f", total)).append("\n");
        sb.append("Clerk: ").append(getClerk().getName());
        return sb.toString();
    }
}
public class Main {
    public static void main(String[] args) {
        Employee clerk1 = new Employee("Grocery Bill");
        GroceryBill gb = new GroceryBill(clerk1);
        gb.add(new Item("item 1", 2.3, 0));
        gb.add(new Item("item 2", 3.45, 0));
        System.out.println(gb.toString());
        Employee clerk2 = new Employee("Discount Bill");
        DiscountBill db = new DiscountBill(clerk2);
        db.add(new Item("item 3", 20, 15));
        db.add(new Item("item 4", 40, 35));
        db.add(new Item("item 5", 50, 35));
        System.out.print(db.toString());
    }
}