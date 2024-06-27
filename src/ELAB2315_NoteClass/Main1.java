//package ELAB2315;
//
//import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//class Note{
//    int id;
//    String content;
//    String date;
//    public String note(String date , String content){
//        String month= date.substring(0,3);
//        String day= date.substring(3,5);
//        String year= date.substring(5);
//        this.content= content;
//        this.date= day + " " + month + " " +year;
//        String n= this.date + " | " + this.content;
//        return n;
//    }
//}
//
//class Account {
//    int id;
//    String name;
//    List<String> list_Note = new ArrayList<>();
//    public void addNote(String date, String content){
//        Note tmp = new Note();
//        String c_note = tmp.note(date, content);
//        this.list_Note.add(c_note);
//    }
//    public void shareNote(Account other, int id_note){
//        other.list_Note.add(this.list_Note.get(id_note-1));
//    }
//}
//
//public class Main1 {
//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        try{
//            int t = Integer.parseInt(sc.nextLine());
//            List<Account> accounts = new ArrayList<>();
//            for(int i=0 ; i<t ; i++)
//            {
//                Account account = new Account();
//                account.id = i+1;
//                account.name = sc.nextLine();
//                accounts.add(account);
//            }
//            while (sc.hasNextLine()) {
//                String[] input;
//                input = sc.nextLine().split(" ",4);
//                if(input[1].equals("Add")){
//                    int id_input = Integer.parseInt(input[0]);
//                    String date = input[2];
//                    String content = input[3];
//                    accounts.get(id_input-1).addNote(date, content);
//                }
//                else if(input[1].equals("Share")){
//                    int id_m = Integer.parseInt(input[0]);
//                    int id_s = Integer.parseInt(input[2]);
//                    int id_c = Integer.parseInt(input[3]);
//                    accounts.get(id_m-1).shareNote(accounts.get(id_s-1), id_c);
//                }
//                else throw new Exception("invalid input");//throw ném ra ngoài 1 ngoại lệ mới
//            }
//            for(int i = 0; i < t; i++){
//                System.out.println("Account: "+ accounts.get(i).name);
//                for(String x: accounts.get(i).list_Note){
//                    System.out.println(x);
//                }
//            }
//        }
//        catch (Exception e) {
//            System.out.println("invalid input");
//        }
//    }
//}
