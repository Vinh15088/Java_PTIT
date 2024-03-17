package LAB002_StaticClass;

import java.util.Scanner;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.regex.Pattern;



public class Main {
    static class Account {
        private String id;
        private String name;
        private BigInteger soDu;

        public Account(String id, String name, BigInteger soDu) {
            this.id = id;
            this.name = name;
            this.soDu = soDu;
        }

        String getId() {
            return this.id;
        }

        String getName() {
            return this.name;
        }

        BigInteger getSoDu() {
            return this.soDu;
        }

        public void adds(BigInteger obj) {
            this.soDu = this.soDu.add(obj);
        }

        public void sub(BigInteger obj) {
            this.soDu = this.soDu.subtract(obj);
        }
        @Override
        public String toString() {
                return  this.id + ", " + this.name + ", " + this.soDu;
        }
    }
    public static boolean isNumeric(String str) {
        return str.matches("\\d+");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        for(int i=0; i<t; i++) {
            String [] line = scanner.nextLine().split(" ");

            ArrayList<String> result = new ArrayList<>();
            int a = 0;
            while (a < line.length) {
                if (!isNumeric(line[a]) && a + 2 < line.length && !isNumeric(line[a+1]) && !isNumeric(line[a+2])) {
                    result.add(line[a] + " " +  line[a+1] + " " + line[a+2]);
                    a += 3;
                }
                else if (!isNumeric(line[a]) && a + 1 < line.length && !isNumeric(line[a+1])) {
                    result.add(line[a] + " " +  line[a+1]);
                    a += 2;
                } else {
                    result.add(line[a]);
                    a++;
                }
            }

            String[] line1 = result.toArray(new String[0]);

            int n = Integer.parseInt(line1[0]);

            ArrayList<Account> list = new ArrayList<>();

            for(int j=0; j<n; j++) {
                String newId;
                if(j>=0 && j<=8) {
                    newId = "00" + String.valueOf(j+1);
                }
                else if (j>=10 && j<=98) {
                    newId = "0" + String.valueOf(j+1);
                }
                else {
                    newId = String.valueOf(j+1);
                }
                list.add(new Account(newId, line1[j*2+1], (new BigInteger(line1[j*2 + 2]))));
            }

            String [] line2 = scanner.nextLine().split(" ");
            int m = Integer.parseInt(line2[0]);

            outter:for(int j=1; j<line2.length; j++) {
                if(line2[j].equals("rut") || line2[j].equals("nap")) {
                    int newId = Integer.parseInt(line2[j+1]);
                    BigInteger tien = new BigInteger(line2[j+2]);

                    if(line2[j].equals("rut")) {
                        if (tien.compareTo(list.get(newId - 1).getSoDu()) > 0) {
                            continue outter;
                        }
                        else {
                            list.get(newId-1).sub(tien);
                        }
                    }

                    if(line2[j].equals("nap")) {
                        list.get(newId-1).adds(tien);
                    }
//                    j += 2;
                }
                if(line2[j].equals("chuyen")) {
                    int newId1 = Integer.parseInt(line2[j+1]);
                    int newId2 = Integer.parseInt(line2[j+2]);
                    BigInteger tien = new BigInteger(line2[j+3]);

                    if(tien.compareTo(list.get(newId1-1).getSoDu()) > 0) {
                        continue outter;
                    }
                    else {
                        list.get(newId1-1).sub(tien);
                        list.get(newId2-1).adds(tien);
                    }
//                    j += 3;
                }
            }

            for(Account x : list) {
                System.out.print("[");
                System.out.print(x.toString());
                System.out.print("]");
            }
        }
    }
}