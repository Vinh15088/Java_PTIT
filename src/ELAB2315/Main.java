import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

class note {
    private int id;
    private String ngayGhiChu;
    private String noiDung;

    public note(int id, String ngayGhiChu, String noiDung) {
        this.id = id;
        this.ngayGhiChu = ngayGhiChu;
        this.noiDung = noiDung;
    }

    public int getId() {
        return id;
    }

    public String getNgayGhiChu() {
        return ngayGhiChu;
    }

    public String getNoiDung() {
        return noiDung;
    }
}
class Account {
    private String id;
    private String name;

    private ArrayList<note> dsGhiChu;

    private static int idGhiChu = 0;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        this.dsGhiChu = new ArrayList<>();
    }

    public void addGhiChu(String ngayGhiChu, String noiDungGhiChu) {
        note noteNew = new note(idGhiChu++, ngayGhiChu, noiDungGhiChu);
        dsGhiChu.add(noteNew);
    }

    public void shareGhiChu(Account anotherAccount, int idGhiChu) {
        for(note newNote:dsGhiChu){
            if(newNote.getId() == idGhiChu) {
                anotherAccount.dsGhiChu.add(newNote);
            }
        }
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<note> getDsGhiChu() {
        return dsGhiChu;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        ArrayList<Account> dsAccount = new ArrayList<>();
        for(int i=0; i<n; i++) {
            String name = scanner.nextLine();
            Account account = new Account(String.format("%03d", i+1), name);
            dsAccount.add(account);
        }

        while(scanner.hasNextLine()) {
            String line1 = scanner.nextLine();
            String [] line = line1.split(" ");
            if (line1.isEmpty()) {
                break;
            }

            // check ko can
            if(line.length < 4) {
                System.out.println("invalid input");
                return;
            }

            String idAccount = line[0];
            // check ko can
            if(idAccount.length() != 3) {
                System.out.println("invalid input");
                return;
            }

            String choice = line[1];
            String idAccount1 = line[2];
            String idShare = line[3];
            String ngayGhiChu = line[2];
            String noiDung = String.join(" ", Arrays.copyOfRange(line, 3, line.length));

            Account account = null;
            for(Account ac:dsAccount) {
                if(ac.getId().equals(idAccount)) {
                    account = ac;
                    break;
                }
            }

//            System.out.println(account.getId() + " " + account.getName());

            // check ko can
            if(account == null) {
                System.out.println("invalid input");
                return;
            }

            if(choice.equals("Add")) {
                // check ko can
                if(ngayGhiChu.length() != 7) {
                    System.out.println("invalid input");
                    return;
                }

//                String mmm = ngayGhiChu.substring(0,3);
//                String dd = ngayGhiChu.substring(3,5);
//                String yy = ngayGhiChu.substring(5,7);
//
//                boolean isAllLetters = true;
//                boolean isAllDigitsDD = true;
//                boolean isAllDigitsYY = true;
//
//                for (char c : mmm.toCharArray()) {
//                    if (!Character.isLetter(c)) {
//                        isAllLetters = false;
//                        break;
//                    }
//                }
//
//                for (char c : dd.toCharArray()) {
//                    if (!Character.isDigit(c)) {
//                        isAllDigitsDD = false;
//                        break;
//                    }
//                }
//
//                for (char c : yy.toCharArray()) {
//                    if (!Character.isDigit(c)) {
//                        isAllDigitsYY = false;
//                        break;
//                    }
//                }
//
//                if(isAllDigitsDD == false || isAllDigitsYY == false || isAllLetters == false) {
//                    System.out.println("invalid input");
//                    return;
//                }

                String ngayGhiChuNew = ngayGhiChu.substring(3,5) + " " +  ngayGhiChu.substring(0,3) + " " + ngayGhiChu.substring(5,7);
                account.addGhiChu(ngayGhiChuNew, noiDung);
            }
            else if(choice.equals("Share")) {
                // check ko can
                if(line.length != 4) {
                    System.out.println("invalid input");
                    return;
                }

                Account anotherAccount = null;
                for(Account ac:dsAccount) {
                    if(ac.getId().equals(idAccount1)) {
                        anotherAccount = ac;
                        break;
                    }
                }
                if(anotherAccount == null) {
                    System.out.println("invalid input");
                    return;
                }

                int ghiChuId = Integer.parseInt(idShare);
                account.shareGhiChu(anotherAccount, ghiChuId-1);
            }
            else {
                System.out.println("invalid input");
                return;
            }
        }

        for(Account account:dsAccount) {
//            if(account.getDsGhiChu().size() != 0) {
//                System.out.println("Account: " + account.getName());
//                for(note newNote: account.getDsGhiChu()) {
//                    String ghiChu = newNote.getNgayGhiChu();
//                    String noiDung = newNote.getNoiDung();
//
//                    System.out.println(ghiChu + " | " + noiDung);
//                }
//            }
            System.out.println("Account: " + account.getName());
            for(note newNote: account.getDsGhiChu()) {
                String ghiChu = newNote.getNgayGhiChu();
                String noiDung = newNote.getNoiDung();

                System.out.println(ghiChu + " | " + noiDung);
            }
        }
    }
}