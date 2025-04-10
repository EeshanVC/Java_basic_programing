
//2 matrix

package ArrayPrograming;
import java.util.Scanner;

public class Two_Matrix {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size:");
        int n =sc.nextInt();

        //creating martix 1
        int m1 [][] =new int [n][n];

        //creating martix 2
        int m2 [][] =new int [n][n];

        //creating martix res
        int res [][] =new int [n][n];

        //collecting matrix 1
        System.out.println("collecting matrix 1 data");
        for(int i=0;i<n;i++){
            for(int j=0; j<n; j++){
                m1[i][j] = sc.nextInt();
            }  
        }
        //collecting matrix 2
        System.out.println("collecting matrix 2 data");
        for(int i=0;i<n;i++){
            for(int j=0; j<n; j++){
                m2[i][j] = sc.nextInt();
            }  
        }
        //collecting sum of matrix 1 and matrix 2
        for(int i=0;i<n;i++){
            for(int j=0; j<n; j++){
                res[i][j] = m1[i][j] + m2[i][j];
            }  
        }
        System.out.println("--------------");
        System.out.println("sum of 2 matrix is : ");
        for(int i=0;i<n;i++){
            for(int j=0; j<n; j++){
                System.out.print(res[i][j]+ "    ");
            }  
            System.out.println();
        }
    }
}
