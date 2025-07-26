import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {\
        // instantiate our variables.
        Scanner keyboard = new Scanner(System.in);
        int numberOfStudents = 0;
        
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

        // for (int grade : grades) {
        //     System.out.println(grade);
        // }

        keyboard.close();
    }
}
