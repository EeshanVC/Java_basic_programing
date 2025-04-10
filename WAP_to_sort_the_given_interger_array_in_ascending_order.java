
//WAP to sort the given interger array in ascending order

package ArrayPrograming;

import java.util.Scanner;

public class WAP_to_sort_the_given_interger_array_in_ascending_order { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        
        int arr[] = new int[n];

        System.out.println("Enter integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int temp = 0;

        for (int i = 0; i < n; i++) {
            for(int j=1;j<n;j++){
                if (arr[j-1]>arr[j]){
                    temp =arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;

                }
            }
            }

            System.out.println("the final sorted array");
            for (int i = 0; i < n; i++) {
                System.out.println(arr[i]);
            }
            sc.close();

        }
}

