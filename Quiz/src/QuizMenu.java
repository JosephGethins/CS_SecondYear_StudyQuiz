import java.util.*;

public class QuizMenu{
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

    public void endQuiz(int correctCount){
        System.out.println("This quiz has ended! In total you got: " + correctCount + " correct!");
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

    public void warnQuiz(int correctCount){
        System.out.println("*********************************************************");
        System.out.println("Remember!!! Correct spelling and full answers matter!");
        System.out.println("*********************************************************");
    }

}

