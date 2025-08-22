import java.util.*;

public class QuizManager {

    public static void main(String[] args) {
        // putting a basic entry point here for now, may change
        QuizManager manager = new QuizManager();
        manager.quizManage();
    }

    public void quizManage() {
        Scanner scan = new Scanner(System.in);

        ArrayList<String[]> QuestionsList = new ArrayList<>();
        PlayerAnswerQuiz playerChoice = new PlayerAnswerQuiz();

        System.out.println("----------------------------------------------------------------");
        System.out.println("Welcome to the Computer Science Maynooth second year study quiz!");
        System.out.println("********* Press 1 to start the basic quiz by topic *************");
        System.out.println("*** Press 2 to begin the random quiz game (More Challenging) ***");
        System.out.println("----------------------------------------------------------------");

        int MenuSelection = scan.nextInt();
        scan.nextLine();

        switch (MenuSelection) {
            case 1 -> playerChoice.quiz1(QuestionsList);
            case 2 -> playerChoice.quiz2(QuestionsList);
            default -> System.out.println("Invalid choice!");
        }
        
        scan.close();
    }
}
