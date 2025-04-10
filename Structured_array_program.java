
//Structured array program

package ArrayPrograming;
import java.util.*;
class arrayop{
    String arr[];

    void creatarr( int size){
        arr  = new String[size];
    }

    void collect(){
        Scanner sc = new Scanner(System.in);
        for ( int i =0 ; i<arr.length; i++){
            System.out.println("names of std : " +(i+1));
            arr[i] = sc.next();
        }    
    }

    void display(){
        for ( int i =0 ; i<arr.length; i++){
            System.out.println("names of  std no : " +(i+1)+" is= "+arr[i]);
        }
    }
}

public class Structured_array_program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        arrayop a = new arrayop();
        System.out.println("array size: ");
        int size = sc.nextInt();
        a.creatarr(size);
        a.collect();
        a.display();


    }
    
}
