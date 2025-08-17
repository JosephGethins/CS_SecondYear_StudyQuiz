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
            QuestionsList.clear(); // making sure its emptied so no old questions from diff topics
            pop.populateAlgo1(QuestionsList);

            QuizLogic.warnQuiz();

            correctCount = QuizLogic.playerAnswer(QuestionsList); 

            QuizLogic.endQuiz(correctCount);
        break;

        case 2:
            QuestionsList.clear();
            pop.populateAlgo2(QuestionsList);

            QuizLogic.warnQuiz();

            correctCount = QuizLogic.playerAnswer(QuestionsList); 

            QuizLogic.endQuiz(correctCount);
        break;

        case 3:
            QuestionsList.clear();  
            pop.populateDb(QuestionsList);

            QuizLogic.warnQuiz();

            correctCount = QuizLogic.playerAnswer(QuestionsList); 

            QuizLogic.endQuiz(correctCount);
        break;

        case 4:
            QuestionsList.clear();
            pop.populateCompArch(QuestionsList);

            QuizLogic.warnQuiz();

            correctCount = QuizLogic.playerAnswer(QuestionsList); 

            QuizLogic.endQuiz(correctCount);
        break;

        case 5:
            QuestionsList.clear();
            pop.populateWebInfoProcessing(QuestionsList);

            QuizLogic.warnQuiz();

            correctCount = QuizLogic.playerAnswer(QuestionsList); 

            QuizLogic.endQuiz(correctCount);
        break;

        case 6:
            QuestionsList.clear();
            pop.populateOS(QuestionsList);

            QuizLogic.warnQuiz();

            correctCount = QuizLogic.playerAnswer(QuestionsList); 

            QuizLogic.endQuiz(correctCount);
        break;

        case 7:
            QuestionsList.clear();
            pop.populateSoftTest(QuestionsList);

            QuizLogic.warnQuiz();

            correctCount = QuizLogic.playerAnswer(QuestionsList); 

            QuizLogic.endQuiz(correctCount);
        break;

        case 8:
            QuestionsList.clear();
            pop.populateUXUI(QuestionsList);

            QuizLogic.warnQuiz();

            correctCount = QuizLogic.playerAnswer(QuestionsList); 

            QuizLogic.endQuiz(correctCount);
        break;

        case 9:
            QuestionsList.clear();
            pop.populateSoftEngProcess(QuestionsList);

            QuizLogic.warnQuiz();

            correctCount = QuizLogic.playerAnswer(QuestionsList); 

            QuizLogic.endQuiz(correctCount);
        break;

        case 10:
            QuestionsList.clear();
            pop.populateTheoryOfComp(QuestionsList);

            QuizLogic.warnQuiz();

            correctCount = QuizLogic.playerAnswer(QuestionsList); 

            QuizLogic.endQuiz(correctCount);
        break;
        
        default:
            System.out.println("Invalid choice");
        break;
        }
    }
} 
