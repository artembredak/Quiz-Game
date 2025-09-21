import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuestionService {

    List<String> selection = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    Question[] question = new Question[5];
    boolean playAgain = true;

    public QuestionService() {
        question[0] = new Question(1, "Which of the following is a mutable data type in Python?","list","tuple","string","list", "int");
        question[1] = new Question(2, "What will the following code output?\nprint(2 ** 3 ** 2)","512","64","512","36", "256");
        question[2] = new Question(3, "In Java, which keyword is used to prevent a class from being inherited?","final","static","abstract","final", "const");
        question[3] = new Question(4, "Which SQL statement is used to remove a table completely from a database?","DROP","DELETE","REMOVE","TRUNCATE", "DROP");
        question[4] = new Question(5, "n Big-O notation, which of the following represents the fastest growing complexity?","O(2^n)","O(log n)","O(2^n)","O(n)", "O(n log n)");

    }

    public void playQuiz() {

        while(playAgain) {
            for(Question q : question){
                System.out.println("Question number: " + q.getId());
                System.out.println("Question: " + q.getQuestion());
                System.out.println(q.getOption1());
                System.out.println(q.getOption2());
                System.out.println(q.getOption3());
                System.out.println(q.getOption4());
                System.out.println();
                selection.add(sc.nextLine());

            }
            break;
        }


    }
    public void displayResults(){
        for(String result : selection){
            System.out.println(result);
            System.out.println();
        }
    }
    public void printScore(){
        int score = 0;
        for(int i = 0; i<question.length; i++){

            Question q = question[i];
            String answer = q.getAnswer();
            String userAnswer = selection.get(i);

            if(answer.equals(userAnswer)){

                score++;
            }
        }
        System.out.println("Your score is: "+ score);
        System.out.println();
        System.out.println("Would ypu like to continue? (y/n)");
        String answer = sc.nextLine();
        if(answer.equals("y")){
            playQuiz();
            displayResults();
            printScore();
        }
        else if(answer.equals("n")){
           playAgain = false;
        }


    }



}
