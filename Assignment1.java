import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // Java program to check if a student number is valid
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Student Email: ");
        String studentEmail = scan.nextLine();

        // Long method
        Pattern pattern = Pattern.compile("\\w{1,}@students.national-u.edu.ph");
        Matcher matcher = pattern.matcher(studentEmail);
        

        boolean match = matcher.matches();

        if (match) {
            System.out.println("Valid Student Email");
        } else {
            System.out.println("Invalid Student Email");
        }

            System.out.print("Enter Student Phone Number: ");
            String studentPhoneNumber = scan.nextLine();
    
            // Long method
            Pattern pattern1 = Pattern.compile("\\+639\\d{9}");
            Matcher matcher1 = pattern1.matcher(studentPhoneNumber);
            
    
            boolean match1 = matcher1.matches();
    
            if (match1) {
                System.out.println("Valid Student Phone Number");
            } else {
                System.out.println("Invalid Student Phone Number");   
            
        }
        System.out.print("Enter Student Birth Date: ");
        String studentBirthDate = scan.nextLine();

        // Long method
        Pattern pattern2 = Pattern.compile("\\d{2}-\\d{2}-\\d{4}");
        Matcher matcher2 = pattern2.matcher(studentBirthDate);
        

        boolean match2 = matcher2.matches();

        if (match2) {
            System.out.println("Valid Student Birthdate");
        } else {
            System.out.println("Invalid Student Birthdate");
        
        }
    }
}

