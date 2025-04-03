package Threading;

import java.util.Scanner;

public class ThreadCode2 {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Addition Operation is Started");
        System.out.println("Enter the first number : ");
        int add_num1 = sc.nextInt();
        System.out.println("Enter the second number : ");
        int add_num2 = sc.nextInt();
        int sum = add_num1 + add_num2;
        System.out.println(sum);
        System.out.println("Addition Operation is completed");
        System.out.println("===================");

        System.out.println("Subtraction Operation is Started");
        System.out.println("Enter the first number : ");
        int sub_num1 = sc.nextInt();
        System.out.println("Enter the second number : ");
        int sub_num2 = sc.nextInt();
        int dif = sub_num1 - sub_num2;
        System.out.println(sum);
        System.out.println("Subtraction Operation is completed");
        System.out.println("===================");

        System. out.println("Multiplication Operation is Started");
        System.out.println("Enter the first number : ");
        int mul_num1 = sc.nextInt();
        System.out.println("Enter the second number : ");
        int mul_num2 = sc.nextInt();
        int prod = mul_num1 * mul_num2;
        System.out.println(sum);
        System.out.println("Multiglication Operation is completed");
        System.out.println("==============================");

        System.out.println("Priniting-1 Operation is started");
            for(int i=1;i <= 5;i++) {
                System.out.println("Hello From Print-1");
                Thread.sleep(3000);//halt the thread execution for 3 seconds
            }
        System.out.println("Priniting-1 Operation is completed");
        System.out.println("====================================");

        System.out.println("Priniting-2 Operation is started");
            for(int i=1;i <= 5;i++) {
                System.out.println("Hello From Print-2");
                Thread.sleep(3000);//halt the thread execution for 3 seconds
            }
        System.out.println("Priniting-2 Operation is completed");



    }

}
