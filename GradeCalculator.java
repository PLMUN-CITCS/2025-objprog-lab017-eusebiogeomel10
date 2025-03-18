import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create Scanner object
        int score = getStudentScore(input); // Get user input
        input.close(); // Close Scanner after use
        
        if (score < 0 || score > 100) {
            System.out.println("Invalid score! Please enter a value between 0 and 100.");
        } else {
            String grade = calculateGrade(score);
            System.out.println("Your Grade is: " + grade);
        }
    }

    public static int getStudentScore(Scanner input) {
        System.out.print("Enter your score (0-100): ");
        return input.nextInt();
    }

    public static String calculateGrade(int score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
