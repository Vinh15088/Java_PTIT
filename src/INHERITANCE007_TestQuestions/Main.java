package INHERITANCE007_TestQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //input
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        List<TestQuestion> listQuestion = new ArrayList<>();
        scanner.nextLine();
        while (num-- > 0){
            String typeOfQuestion = scanner.nextLine();
            if(typeOfQuestion.equals("e")){
                int lineOfANS = scanner.nextInt();
                scanner.nextLine();
                String question = scanner.nextLine();
                Essay e = new Essay(question, lineOfANS);
                listQuestion.add(e);
            } else if (typeOfQuestion.equals("m")) {
                int numOfChoices = scanner.nextInt();
                scanner.nextLine();
                String question = scanner.nextLine();
                MultChoice m = new MultChoice(question);
                for(int i = 0; i < numOfChoices; i++){
                    String ans = scanner.nextLine();
                    m.addChoice(ans);
                }
                listQuestion.add(m);
            }
        }

        // output
        output(listQuestion);
    }
    public static void output(List<TestQuestion> listQuestion){
        System.out.println(listQuestion.size());
        for(TestQuestion q : listQuestion){
            q.readQuestion();
        }
    }
}


abstract class TestQuestion{
    protected String question;
    protected abstract void readQuestion();
}
class Essay extends TestQuestion{
    private int lineOfAns;
    public Essay(String question, int lineOfAns){
        this.lineOfAns = lineOfAns;
        this.question = question;
    }
    @Override
    protected void readQuestion() {
        // Loai cau hoi
        System.out.println("e");
        // So dong tra loi
        System.out.println(this.lineOfAns);
        // cau hoi
        System.out.println(this.question);
    }
}

class MultChoice extends TestQuestion{
    private List<String> choices;
    public MultChoice(String question){
        choices = new ArrayList<>();
        this.question = question;
    }
    public void addChoice(String ans){
        choices.add(ans);
    }
    @Override
    protected void readQuestion() {
        // loai cau hoi
        System.out.println("m");
        //so lua chon
        System.out.println(this.choices.size());
        //cau hoi
        System.out.println(this.question);
        // cac lua chon
        for(String ans : choices){
            System.out.println(ans);
        }
    }
}