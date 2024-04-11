package OBJECT_REFERENCES002;

class SimpleDate {
    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean equals(Object obj) {
        if(obj instanceof SimpleDate) {
            SimpleDate other = (SimpleDate) obj;
            return this.day == other.day && this.month == other.month && this.year == other.year;
        }
        return false;
    }
}
public class Main {
    public static void main(String[] args) {
        SimpleDate sd = new SimpleDate(1, 2, 2000);

        System.out.println(sd.equals("heh"));
        System.out.println(sd.equals(new SimpleDate(5, 2, 2012)));
        System.out.println(sd.equals(new SimpleDate(1, 2, 2000)));

    }
}
