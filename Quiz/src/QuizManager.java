import java.util.*;

public class QuizManager {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<String[]> QuestionsList = new ArrayList<>();
        PopulateArrayList pop = new PopulateArrayList();

        boolean IsRunning = false;

        System.out.println("*********************************************************");
        System.out.println("Welcome to the Computer Science Maynooth second year study quiz!");
        System.out.println("Press 1 to start the basic quiz by topic");
        System.out.println("Press 2 to begin the random quiz game (More Challenging)");
        System.out.println("*********************************************************");

        int MenuSelection = scan.nextInt();
        scan.nextLine();

        if(MenuSelection == 1){
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

            int selection = scan.nextInt();
            scan.nextLine();

            while(IsRunning){
                switch (selection) {
                case 1:
                    pop.populate(QuestionsList, selection);
                break;

                case 2:
                    pop.populate(QuestionsList, selection);
                break;

                case 3:
                    pop.populate(QuestionsList, selection);
                break;

                case 4:
                    pop.populate(QuestionsList, selection);
                break;

                case 5:
                    pop.populate(QuestionsList, selection);
                break;

                case 6:
                    pop.populate(QuestionsList, selection);
                break;

                case 7:
                    pop.populate(QuestionsList, selection);
                break;

                case 8:
                    pop.populate(QuestionsList, selection);
                break;

                case 9:
                    pop.populate(QuestionsList, selection);
                break;

                case 10:
                    pop.populate(QuestionsList, selection);
                break;
        
                default:
                    System.out.println("Invalid choice");
                break;
                }
            }
        }

        if(MenuSelection == 1){
            // New class, populate random array list, will use populate array list but random number or do it a more hardcoded way
        }


        

        

        

        


        scan.close();
    }
}
