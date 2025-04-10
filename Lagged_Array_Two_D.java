
//Lagged arrays 2D

package ArrayPrograming;
import java.util.Scanner;
// in order to implemnet this requirment we must make use of the concept of jagged array
class ArrayOperation3 {
    int arr[][];

    // Method to create the 2D array
    void createArray(int cls) {
        arr = new int[cls][]; //class is first entity and since we have unequal data for stu er keep it as blank
        Scanner sc = new Scanner(System.in);
        //loop for collecting the student count 
        for(int i =0;i<arr.length;i++){
            System.out.println("enter the no. of stu inside the classroom n0 :"+(i+1));
            arr[i] =new int[sc.nextInt()];
        }
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

public class Lagged_Array_Two_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the count of classes: ");
        int cls = sc.nextInt();


        ArrayOperation3 ao1 = new ArrayOperation3(); // Creating an object of ArrayOperation
        ao1.createArray(cls);  // Calling method to create array
        ao1.collectData();          // Calling method to collect data
        ao1.displayData();          // Calling method to display data
    }
}