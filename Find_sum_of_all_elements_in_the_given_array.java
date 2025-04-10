
//Find sum of all elements in the given array

package ArrayPrograming;

import java.util.Scanner;

public class Find_sum_of_all_elements_in_the_given_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        
        int arr[] = new int[n];

        System.out.println("Enter integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }


        System.out.println("Sum of array elements: " + sum);
        
    }
}
