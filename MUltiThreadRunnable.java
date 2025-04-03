package Threading;

import java. util. Scanner;
// Multi-Threading using Thread class with Runnable
class Operations implements Runnable{
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

public class MUltiThreadRunnable {
    public static void main(String[] args) {
        Operations op1 = new Operations();
        Thread t1 = new Thread();
        t1.setName("addition");

        Operations op2 = new Operations();
        Thread t2 = new Thread();
        t2.setName("Subtraction");

        Operations op3 = new Operations();
        Thread t3 = new Thread();
        t3.setName("Multiplication");

        Operations op4 = new Operations();
        Thread t4 = new Thread();
        t4.setName("printin1");

        Operations op5 = new Operations();
        Thread t5 = new Thread();
        t5.setName("printing2");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
