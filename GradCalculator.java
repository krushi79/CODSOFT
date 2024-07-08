import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Ask the user for the number of subjects
        System.out.print("Please enter the number of subjects: ");
        int subjectCount = input.nextInt();

        // Array to store the marks for each subject
        int[] scores = new int[subjectCount];

        // Collect the marks for each subject from the user
        for (int i = 0; i < subjectCount; i++) {
            System.out.print("Enter the marks out of 100 for subject " + (i + 1) + ": ");
            scores[i] = input.nextInt();
        }

        // Calculate the total marks
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }

        // Calculate the average percentage
        float average = (float) sum / subjectCount;

        // Determine the grade based on the average percentage
        String grade;
        if (average >= 90) {
            grade = "O";
        } else if (average >= 80) {
            grade = "A+";
        } else if (average >= 70) {
            grade = "A";
        } else if (average >= 60) {
            grade = "B";
        } else if (average >= 50) {
            grade = "C";
        } else {
            grade = "F";
        }

        // Print the results
        System.out.println("Total marks: " + sum + "/" + (subjectCount * 100));
        System.out.println("Average percentage: " + average);
        System.out.println("Grade: " + grade);

        // Close the Scanner
        input.close();
    }
}
