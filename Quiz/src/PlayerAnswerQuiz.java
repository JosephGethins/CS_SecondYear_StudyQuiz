import java.util.*;

public class PlayerAnswerQuiz{

    public void quiz1(ArrayList<String[]> QuestionsList){
        Scanner scan = new Scanner(System.in);
        PopulateArrayList pop = new PopulateArrayList();
        QuizMenu QuizMenu = new QuizMenu();

        QuizMenu.startQuiz();
           
        int selection = scan.nextInt();
        scan.nextLine();

        String input = "";
        int correctCount = 0;

        switch (selection) {
        case 1:
            pop.populateAlgo1(QuestionsList);

            QuizMenu.warnQuiz(correctCount);

            for(int i = 0; i < 10; i++){
                System.out.println(QuestionsList.get(i)[0]);
                System.out.print("Please type your answer here: ");
                input = scan.nextLine();
                        
                if (QuestionsList.get(i)[1].equalsIgnoreCase(input)){
                    System.out.println("********************* Well done! ************************");
                       correctCount++;
                    } else {
                    System.out.println("******** Incorrect. The correct answer was: " + QuestionsList.get(i)[1] + "*********");
                }
            }
            QuizMenu.endQuiz(correctCount);
        break;

        case 2:
            pop.populateAlgo1(QuestionsList);

            QuizMenu.warnQuiz(correctCount);

            for(int i = 0; i < 10; i++){
                System.out.println(QuestionsList.get(i)[0]);
                System.out.print("Please type your answer here: ");
                input = scan.nextLine();
                        
                if (QuestionsList.get(i)[1].equalsIgnoreCase(input)){
                    System.out.println("********************* Well done! ************************");
                       correctCount++;
                    } else {
                    System.out.println("******** Incorrect. The correct answer was: " + QuestionsList.get(i)[1] + "*********");
                }
            }
            QuizMenu.endQuiz(correctCount);
        break;

        case 3:
            //pop.populate(QuestionsList, selection);
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

        scan.close();
    }
} 
