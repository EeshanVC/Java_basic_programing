package Threading;

public class ThreadCode1{
    public static void main(String[] args) {
        Thread tmain = Thread. currentThread();
        System.out.println(tmain);
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().getClass());
        System.out.println(Thread.currentThread().getState());
        System.out.println("==================");
        Thread t1 = new Thread();//Object of the Thread class
        System.out.println(t1);
        //allocate new value for the thread name
        t1.setName("PES");
        //allocate new value for the priority
        t1.setPriority(9);
        System.out.println(t1);

    }
}

/*
 * as seen in the above program we notice that there will a significant delay in the excution which is caused by the end 
 * user not providingthe input oe execution of sleep() will lead to the wastage of the cpu time which ideally should not
 * happen as the cpu can execute lakhs of tasks in one second hence this approach is not ideal approach.
 */

