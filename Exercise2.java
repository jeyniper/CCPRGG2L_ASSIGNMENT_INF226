import java.util.Scanner;

public class Assignment2 {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        drive ("Student");
        scan.close();
    }

    static void drive (String student) {

        System.out.println("Training!");
        test (student);

        String feedback = getFeedBack(student);

        // Define the base case / stopping condition
        if (feedback.equals("no")) {

            // Do something to reach the goal
            addSkill(student);

            // Recursive call
            drive(student);
        } else if (feedback.equals("yes")) {
            approve(student);
        }
    }

    static void test(String car) {
        System.out.println("Practice More");
    }

    static String getFeedBack(String student) {
        System.out.println("Is the " + student + " ready to drive? (Enter \"yes\" or \"no\")");

        String feedback = scan.next();

        return feedback;
    }

    static void addSkill(String student) {
        System.out.print("What skill do you want to improve?:");
        String skill = scan.next();
        System.out.println("Adding the skill..... Added " + skill);
    }

    static void approve(String student) {
        System.out.println("You can now let the " + student + " drive!");
    }

}