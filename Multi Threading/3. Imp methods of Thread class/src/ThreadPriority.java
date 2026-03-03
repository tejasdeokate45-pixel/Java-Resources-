class MyThreads implements Runnable{
    Thread t;
    public void run(){

        System.out.println("This is MyThread :: is it alive :: "+Thread.currentThread().isAlive());
        Thread.currentThread().setPriority(10);
        System.out.println(" Current Thread Priority :: "+Thread.currentThread().getPriority());

    }
}

public class ThreadPriority {
    public static void main(String[] args){
        Thread.currentThread().setPriority(1);
        MyThreads m = new MyThreads();
        Thread t = new Thread(m);
        t.setPriority(10);
        t.start();
        System.out.println("This is main Thread :: ");
    }
}
