public class InterruptUse {
    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        t1.start();
        t1.interrupt();
    }
}

class MyThread extends Thread{
    public void run(){
        System.out.println("Is Thread Interrupted :: "+Thread.currentThread().isInterrupted());// just print the status not change the status
        try{
            for(int i = 0;i<5;i++){
                Thread.sleep(1000);
                System.out.println(i);
            }
        }catch(Exception e){
            System.out.println(e);
        }



    }
}