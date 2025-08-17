import java.util.*;

public class PlayerAnswerQuiz{

    public void quiz1(ArrayList<String[]> QuestionsList){
        Scanner scan = new Scanner(System.in); // Dont close here because it breaks System.in and inputs, its closed in main
        PopulateArrayList pop = new PopulateArrayList();
        QuizLogic QuizLogic = new QuizLogic();

        QuizLogic.startQuiz();
           
        int selection = scan.nextInt();
        scan.nextLine();

        int correctCount = 0;

        switch (selection) {
        case 1:
            pop.populateAlgo1(QuestionsList);

            QuizLogic.warnQuiz();

            correctCount = QuizLogic.playerAnswer(QuestionsList); 

            QuizLogic.endQuiz(correctCount);
        break;

        case 2:
            pop.populateAlgo2(QuestionsList);

            QuizLogic.warnQuiz();

            correctCount = QuizLogic.playerAnswer(QuestionsList); 

            QuizLogic.endQuiz(correctCount);
        break;

        case 3:
            pop.populateDb(QuestionsList);

            QuizLogic.warnQuiz();

            correctCount = QuizLogic.playerAnswer(QuestionsList); 

            QuizLogic.endQuiz(correctCount);
        break;

        case 4:
            //pop.populate(QuestionsList, selection);
        break;

        case 5:
            //pop.populate(QuestionsList, selection);
        break;

        case 6:
            //pop.populate(QuestionsList, selection);
        break;

        case 7:
            //pop.populate(QuestionsList, selection);
        break;

        case 8:
            //pop.populate(QuestionsList, selection);
        break;

        case 9:
            //pop.populate(QuestionsList, selection);
        break;

        case 10:
            //pop.populate(QuestionsList, selection);
        break;
        
        default:
            System.out.println("Invalid choice");
        break;
        }
    }
} 
