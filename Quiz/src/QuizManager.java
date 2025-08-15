import java.util.*;

public class QuizManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String[]> Questions = new ArrayList<>();

        PopulateArrayList pop = new PopulateArrayList();

        pop.populate(Questions);

        if (!Questions.isEmpty()) {
            System.out.println(Questions.get(0)[0]); // question text
            System.out.println(Questions.get(0)[1]); // answer because its index 0 and then the next along similar to 2d arrays
        }

        sc.close();
    }
}
