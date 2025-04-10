
//2 d array

package ArrayPrograming;
import java.util.Scanner;

class ArrayOperation {
    int arr[][];

    // Method to create the 2D array
    void createArray(int cls, int stu) {
        arr = new int[cls][stu]; // Initialize the array
    }

    // Method to collect student marks
    void collectData() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) { // Looping through classes
            System.out.println("Inside class number " + (i + 1));
            for (int j = 0; j < arr[i].length; j++) { // Looping through students
                System.out.print("Enter the marks of student number " + (j + 1) + ": ");
                arr[i][j] = sc.nextInt();
            }
        }
    }

    // Method to display student marks
    void displayData() {
        for (int i = 0; i < arr.length; i++) { // Looping through classes
            System.out.println("Inside class number " + (i + 1));
            for (int j = 0; j < arr[i].length; j++) { // Looping through students
                System.out.println("The marks of student number " + (j + 1) + " is: " + arr[i][j]);
            }
        }
    }
}

public class Two_D_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the count of classes: ");
        int cls = sc.nextInt();

        System.out.print("Enter the student count: ");
        int stu = sc.nextInt();

        ArrayOperation ao1 = new ArrayOperation(); // Creating an object of ArrayOperation
        ao1.createArray(cls, stu);  // Calling method to create array
        ao1.collectData();          // Calling method to collect data
        ao1.displayData();          // Calling method to display data
    }
}