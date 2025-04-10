
// write a program to search for a given element in the array of integer

package ArrayPrograming;

import java.util.Scanner;

public class program_to_search_for_a_given_element_in_the_array_of_integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        
        int arr[] = new int[n];

        System.out.println("Enter integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the element to the search: ");
        int key = sc.nextInt();

        boolean res =false;
        int index=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]  ==key){
                res = true;
                index = i;
            }
        }
        if (res==true){
            System.out.println("the element is found: "+res);
        }
        else {
            System.out.println("Element not found in Array");
        }  
        sc.close();  
        }
}
