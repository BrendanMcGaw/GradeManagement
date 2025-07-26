import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
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
        }

        int[] grades = new int[numberOfStudents];
        System.out.print(grades.length);
    }
}
