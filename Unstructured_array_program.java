
//Unstructured array program

package ArrayPrograming;
import java.util.*;


public class Unstructured_array_program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter count of std" );
        int count = sc. nextInt();

        //creating an array
        String arr[] = new String[count];

        //collecting theb std names
        for ( int i =0 ; i<arr.length; i++){
            System.out.println("names of std :" +(i+1));
            arr[i] = sc.next();
        }
        
        //display std names
        for ( int i =0 ; i<arr.length; i++){
            System.out.println("names of  std no : " +(i+1)+"is= "+arr[i]);
        }
    }
}