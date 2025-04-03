package Threading;

import java. util. Scanner;
// Multi-Threading using Thread class with single -
class Operations extends Thread{
    @Override
    public void run() {
        if(Thread.currentThread().getName().equals("addition")) {
            addition();
        }
        else if(Thread.currentThread().getName().equals("subtraction") ) {
            subtraction();
        }
        else if(Thread.currentThread().getName().equals("multiplication")) {
            multiplication();
        }
        else if(Thread.currentThread().getName().equals("printing1")) {
            printing1();
        }
        else {
            printing2();
        }
    }

    private void addition() {
    System.out.println(" ---- Addition Started ---- ");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number : ");
    int n1 = sc.nextInt();
    System.out.println("Enter the second number : ");
    int n2 = sc.nextInt ();
    int sum = n1+n2;
    System.out.println(sum);
    System.out.println("-------Addition completed-------");
    }

    private void subtraction(){
    System.out.println(" ---- Subtraction Started ---- ");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number : ");
    int n1 = sc.nextInt();
    System.out.println("Enter the second number : ");
    int n2 = sc.nextInt ();
    int sub = n1-n2;
    System.out.println(sub);
    System.out.println("-------Subtraction completed-------");
    }

    private void multiplication(){
    System.out.println(" ---- Multiplication Started ---- ");   
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number : ");
    int n1 = sc.nextInt();
    System.out.println("Enter the second number : ");
    int n2 = sc.nextInt ();
    int sub = n1*n2;
    System.out.println(sub);
    System.out.println("-------Multiplication completed-------");
    }

    private void printing1() {
        try {
            System.out.println("Printing-1 Operation is started");
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hello From Print-1");
                Thread.sleep(2000); // halt the thread execution for 3 seconds
            }
            System.out.println("Printing-1 Operation is completed");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void printing2() {
        try {
            System.out.println("Printing-2 Operation is started");
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hello From Print-2");
                Thread.sleep(2000); // halt the thread execution for 3 seconds
            }
            System.out.println("Printing-2 Operation is completed");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class MultiThreading {
    public static void main(String[] args) {
        Operations addition = new Operations();
        addition.setName("addition");
        addition.start();

        Operations subtraction = new Operations();
        subtraction.setName("subtraction");
        subtraction.start();

        Operations multiplication = new Operations();
        multiplication.setName("multiplication");
        multiplication.start();

        Operations printing1 = new Operations();
        printing1.setName("printing1");
        printing1.start();

        Operations printing2 = new Operations();
        printing2.setName("printing2");
        printing2.start();
    }
}
