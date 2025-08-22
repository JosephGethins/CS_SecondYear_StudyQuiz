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
        int size;

        switch (selection) {
        case 1:
            QuestionsList.clear(); // making sure its emptied so no old questions from diff topics
            pop.populateAlgo1(QuestionsList);

            QuizLogic.warnQuiz();

            size = QuestionsList.size();
            correctCount = QuizLogic.playerAnswer(QuestionsList); 

            QuizLogic.endQuiz(correctCount, size);
        break;

        case 2:
            QuestionsList.clear();
            pop.populateAlgo2(QuestionsList);

            QuizLogic.warnQuiz();

            size = QuestionsList.size();
            correctCount = QuizLogic.playerAnswer(QuestionsList); 

            QuizLogic.endQuiz(correctCount, size);
        break;

        case 3:
            QuestionsList.clear();  
            pop.populateDb(QuestionsList);

            QuizLogic.warnQuiz();

            size = QuestionsList.size();
            correctCount = QuizLogic.playerAnswer(QuestionsList); 

            QuizLogic.endQuiz(correctCount, size);
        break;

        case 4:
            QuestionsList.clear();
            pop.populateCompArch(QuestionsList);

            QuizLogic.warnQuiz();

            size = QuestionsList.size();
            correctCount = QuizLogic.playerAnswer(QuestionsList); 

            QuizLogic.endQuiz(correctCount, size);
        break;

        case 5:
            QuestionsList.clear();
            pop.populateWebInfoProcessing(QuestionsList);

            QuizLogic.warnQuiz();

            size = QuestionsList.size();
            correctCount = QuizLogic.playerAnswer(QuestionsList); 

            QuizLogic.endQuiz(correctCount, size);
        break;

        case 6:
            QuestionsList.clear();
            pop.populateOS(QuestionsList);

            QuizLogic.warnQuiz();

            size = QuestionsList.size();
            correctCount = QuizLogic.playerAnswer(QuestionsList); 

            QuizLogic.endQuiz(correctCount, size);
        break;

        case 7:
            QuestionsList.clear();
            pop.populateSoftTest(QuestionsList);

            QuizLogic.warnQuiz();

            size = QuestionsList.size();
            correctCount = QuizLogic.playerAnswer(QuestionsList); 

            QuizLogic.endQuiz(correctCount, size);
        break;

        case 8:
            QuestionsList.clear();
            pop.populateUXUI(QuestionsList);

            QuizLogic.warnQuiz();

            size = QuestionsList.size();
            correctCount = QuizLogic.playerAnswer(QuestionsList); 

            QuizLogic.endQuiz(correctCount, size);
        break;

        case 9:
            QuestionsList.clear();
            pop.populateSoftEngProcess(QuestionsList);

            QuizLogic.warnQuiz();

            size = QuestionsList.size();
            correctCount = QuizLogic.playerAnswer(QuestionsList); 

            QuizLogic.endQuiz(correctCount, size);
        break;

        case 10:
            QuestionsList.clear();
            pop.populateTheoryOfComp(QuestionsList);

            QuizLogic.warnQuiz();

            size = QuestionsList.size();
            correctCount = QuizLogic.playerAnswer(QuestionsList); 

            QuizLogic.endQuiz(correctCount, size);
        break;
        
        default:
            System.out.println("Invalid choice");
        break;
        }
    }

     public void quiz2(ArrayList<String[]> QuestionsList){
        PopulateArrayList pop = new PopulateArrayList();
        QuizLogic QuizLogic = new QuizLogic();

        pop.populateAlgo1(QuestionsList);
        pop.populateAlgo2(QuestionsList);
        pop.populateCompArch(QuestionsList);
        pop.populateDb(QuestionsList);
        pop.populateOS(QuestionsList);
        pop.populateSoftEngProcess(QuestionsList);
        pop.populateSoftTest(QuestionsList);
        pop.populateUXUI(QuestionsList);
        pop.populateWebInfoProcessing(QuestionsList);
        pop.populateTheoryOfComp(QuestionsList);

        Collections.shuffle(QuestionsList);

        QuizLogic.startQuiz();
        QuizLogic.warnQuiz();

        int correctCount = 0;
        int size = QuestionsList.size();

        correctCount = QuizLogic.playerAnswer(QuestionsList); 

        QuizLogic.endQuiz(correctCount, size);

    }
} 
