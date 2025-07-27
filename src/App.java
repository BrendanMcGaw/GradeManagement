import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // instantiate our variables.
        Scanner keyboard = new Scanner(System.in);
        int numberOfStudents = 0;
        
        // Try catch to make sure we catch any unexpected exceptions. Takes user input to assign how many students there are in the class.
        try {
            System.out.print("Please enter the number of students: ");
            numberOfStudents = keyboard.nextInt();
            if (numberOfStudents < 0) {
                System.out.println("That is an invalid number of students, please try again.");
                System.out.print("Please enter the number of students: ");
                numberOfStudents = keyboard.nextInt();
            }
        } catch (Exception e) {
            System.out.println("There was an issue.");
            keyboard.close();
        }

        // Array instantiation for amount of grades to match amount of students.
        int[] grades = new int[numberOfStudents];

        // For loop to add a grade to each student.
        for (int i = 0; i < grades.length; i++) {
            try {
                System.out.print("Please enter the grades for the student " + (i + 1) + ": " );
                grades[i] = keyboard.nextInt();
                if (grades[i] < 0) {
                    System.out.println("That is an invalid grade number, please try again:.");
                    System.out.print("Please enter the grade for the student " + (i + 1) + ": ");
                    grades[i] = keyboard.nextInt();
                }
            } catch (Exception e) {
                System.out.println("There was an error entering the studen grades.");
                keyboard.close();
            }
        }

        // variables to record total sum, highest and lowest grades.
        int sum = 0;
        int highestGrade = grades[0];
        int lowestGrade = grades[0];

        // loop to assign values to the sum, highest and lowest grades.
        for (int grade: grades) {
            sum += grade;
            if (grade > highestGrade) {
                highestGrade = grade;
            }
            else if (grade < lowestGrade) {
                lowestGrade = grade;
            }
        }

        // Finds the average grade score based on the sum, divided by the number of students.
        double average = (double) sum / numberOfStudents;
        System.out.println("Average grade: " + average);
        System.out.println("Highest grade: " + highestGrade);
        System.out.println("Lowest grade: " + lowestGrade);


        // Checks to see if the student has passed the class with a grade of 50 or more.
        for (int i = 0; i < numberOfStudents; i++) {
            if (grades[i] >= 50) {
                System.out.println("Student " + (i + 1) + " has passed the class with a grade of " + grades[i]);
            }
            else {
                System.out.println("Student " + (i + 1) + " has failed the class with a grade of " + grades[i]);
            }
        }

        keyboard.close();
    }
}
