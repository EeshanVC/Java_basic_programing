
//jagged array 3D

package ArrayPrograming;
import java.util.Scanner;

class JaggedArray {
    int arr[][][];  // 3D Jagged Array to store marks

    // Method to create the jagged array dynamically
    void createArray(int schools) {
        Scanner sc = new Scanner(System.in);
        arr = new int[schools][][];  // Initialize schools array

        for (int i = 0; i < schools; i++) {
            System.out.println("Enter the number of classes in school " + (i + 1) + ": ");
            int classCount = sc.nextInt();
            arr[i] = new int[classCount][];  // Initialize classes array (jagged)

            for (int j = 0; j < classCount; j++) {
                System.out.println("Enter the number of students in class " + (j + 1) + " of school " + (i + 1) + ": ");
                int studentCount = sc.nextInt();
                arr[i][j] = new int[studentCount];  // Initialize students array (jagged)
            }
        }
    }

    // Method to collect marks for each student
    void collectData() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("\nEntering marks for School " + (i + 1));

            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Entering marks for Class " + (j + 1));

                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print("Enter marks for Student " + (k + 1) + ": ");
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }
    }

    // Method to display stored marks
    void displayData() {
        System.out.println("\nDisplaying all entered data:");

        for (int i = 0; i < arr.length; i++) {
            System.out.println("\nSchool " + (i + 1));

            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("  Class " + (j + 1) + ":");

                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.println("    Student " + (k + 1) + " Marks: " + arr[i][j][k]);
                }
            }
        }
    }
}

// Main class
public class jagged_Array_Three_D{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of schools: ");
        int schools = sc.nextInt();

        JaggedArray obj = new JaggedArray();
        obj.createArray(schools);  // Create jagged array dynamically
        obj.collectData();  // Collect marks
        obj.displayData();  // Display marks
    }
}