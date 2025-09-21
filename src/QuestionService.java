import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuestionService {

    List<String> selection = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    Question[] question = new Question[5];
    boolean playAgain = true;

    public QuestionService() {
        question[0] = new Question(1, "What","Java","C++","Python","Java", "Ruby");
        question[1] = new Question(2, "Why","Java","C++","Python","Java", "Ruby");
        question[2] = new Question(3, "How","Java","C++","Python","Java", "Ruby");
        question[3] = new Question(4, "Where","Java","C++","Python","Java", "Ruby");
        question[4] = new Question(5, "Whenever","Java","C++","Python","Java", "Ruby");

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
