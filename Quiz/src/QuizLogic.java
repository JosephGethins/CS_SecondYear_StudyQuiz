import java.util.*;

public class QuizLogic{
    Scanner scan = new Scanner(System.in);
    QuizManager quizManage = new QuizManager();

    public void startQuiz(){
        System.out.println("Below You will find a list of numbers with a topic assosciated with them");
        System.out.println("Simply pick a number and then begin a quiz on that topic!");
        System.out.println("*********************************************************");
        System.out.println("1: Algorithms & Data Structures 1");
        System.out.println("2: Algorithms & Data Structures 2");
        System.out.println("3: Databases");
        System.out.println("4: Computer Architecture");
        System.out.println("5: Web Information Processing");
        System.out.println("6: Operating Systems: Communications & Concurrency");
        System.out.println("7: Software Testing");
        System.out.println("8: Introduction to UX/UI Design");
        System.out.println("9: Software Engineering & Software Process");
        System.out.println("10: Theory of Computation");
        System.out.println("*********************************************************");
    }

    public void warnQuiz(){
        System.out.println("*********************************************************");
        System.out.println("* Remember!!! Correct spelling and full answers matter! *");
        System.out.println("******* and n squared can be entered as n^2! ************");
        System.out.println("*********************************************************");
    }

    public void endQuiz(int correctCount, int size){
        System.out.println("This quiz has ended! In total you got: " + correctCount + "out of " + size + " correct!");
        System.out.println("*********************************************************");
        System.out.println("****** Would you like to go back to the main menu?*******");
        System.out.println("*********************************************************");
        System.out.println("");
        System.out.print("Answer here! (y / n): ");
        String input = scan.nextLine();

        if(input.equalsIgnoreCase("y")){
            quizManage.quizManage();
        } else {
            System.out.println("Goodbye!");
            System.exit(0); 
        }
    }

    public int playerAnswer(ArrayList<String[]> QuestionsList){
        int correctCount = 0;
        String input = "";

        for(int i = 0; i < QuestionsList.size(); i++){
            System.out.println(QuestionsList.get(i)[0]);
            System.out.print("Please type your answer here: ");
            input = scan.nextLine();
                        
            if (QuestionsList.get(i)[1].equalsIgnoreCase(input)){
                System.out.println();
                System.out.println("********************* Well done! ************************");
                System.out.println();
                correctCount++;
            } else {
                System.out.println();
                System.out.println("******** Incorrect. The correct answer was: " + QuestionsList.get(i)[1] + " *********");
                System.out.println();
            }
        }
        return correctCount;
    }
}

