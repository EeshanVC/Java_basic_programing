package Threading;
//Race contion: It is a scenario where multiple threads are fighting with each other to get OS
//time so that they can complete their execution. While trying to acquire the OS time the threads will not
//be in synchronized mode.
   
class Microsoft extends Thread{
    @Override
    public void run(){
        if (Thread.currentThread().getName().equals("typing")){
            typing();
        }
        else if(Thread.currentThread().getName().equals("checing")){
            checking();
        }
        else{
            save();
        }
    }
    private void typing(){
        try{
            for (int i = 0; i < 5; i++){
                System.out.println("Typing...."+i);
                Thread.sleep(1000);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    private void checking(){
        try{
            for (int i = 0; i < 5; i++){
                System.out.println("Checking...."+i);
                Thread.sleep(1000);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    private void save(){
        try{
            for (int i = 0; i < 5; i++){
                System.out.println("Saving...."+i);
                Thread.sleep(1000);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
}
}
public class Race_Condition_In_MultiThread{
    public static void main(String[] args) {
        Microsoft m = new Microsoft();
        Thread t1 = new Thread(m, "typing");
        Thread t2 = new Thread(m, "checing");
        Thread t3 = new Thread(m, "saving");
        t1.start();
        t2.start();
        t3.start();
    }
}

// As seen in execution after the last execution of typing at least once saving and checking must be executed.
// Which is not happening, hence this program suffers from race condition.