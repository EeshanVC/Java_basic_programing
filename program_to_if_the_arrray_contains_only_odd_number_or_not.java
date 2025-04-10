
// write a program to if the arrray contains only odd number or not

package ArrayPrograming;

import java.util.*;

public class program_to_if_the_arrray_contains_only_odd_number_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        
        int arr[] = new int[n];

        System.out.println("Enter integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int flag = 1;
        for (int i = 0; i < n; i++) {
            if(arr[i] %2 ==0){
                flag = 0;
            }
        }
        if (flag==0){
            System.out.println("the array also contain even numbers");
        }
        else {
            System.out.println("Array contain only odd numbers");
        }    
        }
    }
