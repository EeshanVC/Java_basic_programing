
//WAP to check if the product of the given array is perfect square or not

package ArrayPrograming;

import java.util.Scanner;

public class WAP_to_check_if_the_product_of_the_given_array_is_perfect_square_or_not {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the total number of elements: ");
        int n = sc.nextInt();
        
        int arr[] = new int[n];

        System.out.println("Enter elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        long product = 1;
        for (int i = 0; i < n; i++) {
            product *= arr[i];
        }

        long sqrt = (long) Math.sqrt(product);
        if (sqrt * sqrt == product) {
            System.out.println("The product of the array is a perfect square.");
        } else {
            System.out.println("The product of the array is NOT a perfect square.");
        }

        sc.close();
    }
}
