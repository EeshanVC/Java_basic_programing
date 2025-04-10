
//3d array

package ArrayPrograming;
import java.util.Scanner;

class ArrayOperation2 {
    int arr[][][];

    void createArray(int sch, int cls, int stu) {
        arr = new int[sch][cls][stu]; 
        // school is the first entity
        // class is the second entity inside the school
        // student is the third entity inside the class
    }

    void collectData() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) { 
            // looping to schools
            System.out.println("Inside the school number - " + (i + 1));
            for (int j = 0; j < arr[i].length; j++) {
                // looping to classes
                System.out.println("Inside the class number - " + (j + 1));
                for (int k = 0; k < arr[i][j].length; k++) { 
                    // looping the students
                    System.out.println("Enter the marks of student number - " + (k + 1));
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }
    }

    void displayData() {
        for (int i = 0; i < arr.length; i++) { 
            // looping to schools
            System.out.println("Inside the school number - " + (i + 1));
            for (int j = 0; j < arr[i].length; j++) {
                // looping to classes
                System.out.println("Inside the class number - " + (j + 1));
                for (int k = 0; k < arr[i][j].length; k++) { 
                    // looping the students
                    System.out.println("The marks of student number - " + (k + 1) + " is = " + arr[i][j][k]);
                }
            }
        }
    }
}

public class Three_D_Array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayOperation2 ao = new ArrayOperation2();
        System.out.println("Enter the number of schools: ");
        int schools = sc.nextInt();
        System.out.println("Enter the number of classes per school: ");
        int classes = sc.nextInt();
        System.out.println("Enter the number of students per class: ");
        int students = sc.nextInt();
        ao.createArray(schools, classes, students);
        ao.collectData();
        ao.displayData();
    }
}