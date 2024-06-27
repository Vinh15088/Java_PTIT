package LAB002_StaticClass;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        ArrayList<Account> list_Acc = new ArrayList<Account>();
        while(test-- > 0){
            String init_Account = sc.nextLine();
            CreateAcc(init_Account, list_Acc);

            if(!sc.hasNextLine()){
                for(Account acc : list_Acc){
                    System.out.print(acc.toString());
                }
                return;
            }

            String transactions = sc.nextLine();
            thucThiLenh(transactions, list_Acc);
            for(Account acc : list_Acc){
                System.out.print(acc.toString());
            }
            System.out.println();
            list_Acc.clear();
        }
    }
    public static boolean checkStringDigit(String s){
        for(int i = 0; i < s.length(); i++){
            if(!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    public static boolean checkStringLetter(String s){
        for(int i = 0; i < s.length(); i++){
            if(!Character.isLetter(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    public static void CreateAcc(String init_Account, ArrayList<Account> list_acc){
        String[] arr_Init_Account = init_Account.split("\\s+");
        int id = 1;
        int slgTaiKhoan = Integer.parseInt(arr_Init_Account[0]);
        String name = "";

        for(int i = 1; i < arr_Init_Account.length; i++){
            if(checkStringLetter(arr_Init_Account[i])){
                name = name + " " + arr_Init_Account[i];
            }else {
                if(!name.equals("")){
                    BigInteger soDuTaiKhoan = new BigInteger(arr_Init_Account[i]);
                    list_acc.add(new Account(id,name, soDuTaiKhoan));
                    name = "";
                    id++;
                }
            }
        }

    }
    public static void thucThiLenh(String transactions, ArrayList<Account> list_acc){
        String[] arr_Transactions = transactions.split("\\s+");
        int slgLenh = Integer.parseInt(arr_Transactions[0]);
        int index = 1;
        while (index < arr_Transactions.length){
            if(!checkStringLetter(arr_Transactions[index]))
            {
                index++;
            }else {
                if(arr_Transactions[index].equals("nap")){
                    int id = Integer.parseInt(arr_Transactions[index+1]);
                    BigInteger tien = new BigInteger(arr_Transactions[index+2]);
                    if(id <= list_acc.size()){
                        list_acc.get(id-1).napTien(tien);
                    }
                    index+=3;
                    continue;
                }
                if(arr_Transactions[index].equals("rut")){
                    int id = Integer.parseInt(arr_Transactions[index+1]);
                    BigInteger tien = new BigInteger(arr_Transactions[index+2]);
                    if(id <= list_acc.size()){
                        list_acc.get(id-1).rutTien(tien);
                    }
                    index+=3;
                    continue;
                }
                if(arr_Transactions[index].equals("chuyen")){
                    int id = Integer.parseInt(arr_Transactions[index+1]);
                    int id_nhan = Integer.parseInt(arr_Transactions[index+2]);
                    BigInteger tien = new BigInteger(arr_Transactions[index+3]);
                    if(id == id_nhan){
                        index+=4;
                        continue;
                    }
                    if(id <= list_acc.size() && id_nhan <= list_acc.size())
                    {
                        list_acc.get(id-1).chuyenTien(list_acc.get(id_nhan-1), tien);
                    }
                    index+=4;
                    continue;
                }
//                index+=3;
            }

        }
    }
    static class Account{
        private int id;
        private String name;
        private BigInteger accountBalance;

        public Account(){}
        public Account(int id, String name, BigInteger accountBalance){
            this.id = id;
            this.name = name.trim();
            this.accountBalance = accountBalance;
        }
        //getter method
        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAccountBalance(BigInteger accountBalance) {
            this.accountBalance = accountBalance;
        }
        //getter method
        public String getId() {
            String idAccount = String.valueOf(this.id);
            if(this.id < 10) return "00" + idAccount;
            if(this.id >= 10 && this.id < 100) return "0" + idAccount;
            return  idAccount;
        }

        public String getName() {
            return name;
        }

        public BigInteger getAccountBalance() {
            return accountBalance;
        }
        public void napTien(BigInteger soTien){
            this.accountBalance = this.accountBalance.add(soTien);
        }
        public void rutTien(BigInteger soTien){
            if(this.accountBalance.compareTo(soTien) < 0){
                return;
            }else {
                this.accountBalance = this.accountBalance.subtract(soTien);
            }

        }
        public void chuyenTien(Account acc_other, BigInteger soTien){
            if(this.accountBalance.compareTo(soTien) < 0){
                return;
            }else {
                acc_other.accountBalance = acc_other.accountBalance.add(soTien);
                this.accountBalance = this.accountBalance.subtract(soTien);
            }
        }

        public String toString(){
            return "[" + this.getId() + ", " + this.name + ", " + this.accountBalance + "]";
        }

    }
}