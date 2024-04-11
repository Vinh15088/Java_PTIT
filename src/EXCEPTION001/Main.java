package EXCEPTION001;

import java.util.Scanner;

class Amount {
    private String currency;
    private int amount;

    public Amount(String currency, int amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public int getAmount() {
        return amount;
    }

    public void add(Amount amount) throws Exception {
        if(!this.currency.equals(amount.getCurrency())) {
            throw new Exception("Currency doesn't match");
        }
        else {
            this.amount += amount.getAmount();
            System.out.println(this.amount);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        for(int i=0; i<t; i++) {
            String currency1 = scanner.next();
            int amount1 = scanner.nextInt();
            String currency2 = scanner.next();
            int amount2 = scanner.nextInt();

            Amount a1 = new Amount(currency1, amount1);
            Amount a2 = new Amount(currency2, amount2);


            try {
                a1.add(a2);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
