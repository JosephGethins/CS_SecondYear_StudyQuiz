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

            
            switch (selection) {
            case 1:
               pop.populateAlgo1(QuestionsList, selection);

                String input;
                int correctCount = 0;

                System.out.println("*********************************************************");
                System.out.println("Remember!!! Correct spelling and full answeres matter!");

                for(int i = 0; i < 10; i++){
                        
                    System.out.println(QuestionsList.get(i)[0]);
                    System.out.print("Please type your answer here: ");
                    input = scan.nextLine();
                        
                    if (QuestionsList.get(i)[1].equalsIgnoreCase(input)){
                        System.out.println("Well done!");
                        correctCount++;
                        } else {
                        System.out.println("Incorrect. The correct answer was: " + QuestionsList.get(i)[1]);
                    }
                }

                System.out.println("This quiz has ended! In total you got: " + correctCount + " correct!");
                System.out.println("*********************************************************");
                System.out.println("****** Would you like to go back to the main menu?*******");
                System.out.println("*********************************************************");
                System.out.println("");
                System.out.print("Answer here!: (y\n): ");
                input = scan.nextLine();

                if(input.equalsIgnoreCase("y")){
                    // reload main menu here, so create a another class that holds main menu logic since then the player can return anytime if they want to stop mid topic or smth
                } else {
                    System.out.println("Goodbye!");
                    System.exit(0); 
                }
                break;

                case 2:
                    //pop.populate(QuestionsList, selection);
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
            }
        

        if(MenuSelection == 1){
            // New class, populate random array list, will use populate array list but random number or do it a more hardcoded way
        }


        

        

        

        


        scan.close();
    }
}
