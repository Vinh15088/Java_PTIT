package INHERTANCE003;

import java.util.ArrayList;
class Item {
    private String name;
    private double price;
    private double discount;

    public Item(String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }

    @Override
    public String toString() {
        return String.format("%s $%.2f (-$%.2f)", name, price, discount);
    }
}

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}

class GroceryBill {
    protected Employee clerk;
    protected ArrayList<Item> items;

    protected double total;

    public GroceryBill() {

    }

    public GroceryBill(Employee clerk) {
        this.clerk = clerk;
        items = new ArrayList<>();
        total = 0;
    }

    public void add(Item item) {
        items.add(item);
        total += item.getPrice();
    }

    public ArrayList getItems() {
        return items;
    }

    public double getTotal() {
        return total;
    }

    public String toString1() {
        StringBuilder sb = new StringBuilder();
        sb.append("items:\n");

        for(Item item:items) {
            sb.append("   ").append(item.toString()).append("\n");
        }

        return sb.toString();
    }


    public String toString2() {
        StringBuilder sb = new StringBuilder();

        sb.append("total: $" + String.format("%.2f", total) + "\n");
        sb.append("Clerk: ").append(clerk.getName()).append("\n");

        return sb.toString();
    }
}
class DiscountBill extends GroceryBill {
    private double discountAmount;


    public DiscountBill(Employee clerk) {
        super(clerk);
        discountAmount = 0;
    }

    public void add(Item item) {
        super.add(item);
        discountAmount += item.getDiscount();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString1());
        sb.append("sub-total: $").append(String.format("%.2f", super.getTotal())).append("\n");
        sb.append("discount: $").append(String.format("%.2f", discountAmount)).append("\n");
        sb.append("total: $").append(String.format("%.2f", super.getTotal() - discountAmount)).append("\n");
        sb.append("Clerk: ").append(super.clerk.getName());
        return sb.toString();
    }
}
public class Main {
    public static void main(String[] args) {
        Item item1 = new Item("item 1", 2.3, 0);
        Item item2 = new Item("item 2", 3.45, 0);
        Item item3 = new Item("item 3", 20, 15);
        Item item4 = new Item("item 4", 40, 35);
        Item item5 = new Item("item 5", 50, 35);

        Employee clerk1 = new Employee("Grocery Bill");
        Employee clerk2 = new Employee("Discount Bill");

        GroceryBill gr = new GroceryBill(clerk1);
        gr.add(item1);
        gr.add(item2);
        System.out.println(gr.toString1() + gr.toString2());

        DiscountBill dc = new DiscountBill(clerk2);
        dc.add(item3);
        dc.add(item4);
        dc.add(item5);
        System.out.print(dc.toString());
    }
}