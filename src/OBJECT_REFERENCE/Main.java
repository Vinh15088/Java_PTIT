package OBJECT_REFERENCE;

import java.util.Scanner;

class Song {
    private String name;
    private String author;
    private int duration;

    public Song(String name, String author, int duration) {
        this.name = name;
        this.author = author;
        this.duration = duration;
    }

    @Override
    public boolean equals(Object obj) {
        Song other = (Song) obj;

        if(name.equals(other.name) && author.equals(other.author) && duration == other.duration) return true;
        return false;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i<t; i++){
            String [] song1 = scanner.nextLine().split(" ");
            String name1 = song1[0];
            String author1 = song1[1];
            int deration1 = Integer.parseInt(song1[2]);

            String [] song2 = scanner.nextLine().split(" ");
            String name2 = song2[0];
            String author2 = song2[1];
            int deration2 = Integer.parseInt(song2[2]);

            Song s1 = new Song(name1, author1, deration1);
            Song s2 = new Song(name2, author2, deration2);

            if(s1.equals(s2)) System.out.println("true");
            else System.out.println("false");
        }
    }
}
