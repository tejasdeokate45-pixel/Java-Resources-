public class currentThreadGetName {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread());
        System.out.println("Current Thread Name :: "+Thread.currentThread().getName());
        Thread.currentThread().setName("Tejas");
        System.out.println("Current Thread Name :: "+Thread.currentThread().getName());
        MyThread t1 = new MyThread();
        t1.start();

        MyThread t2 = new MyThread();
        t2.start();
        t2.setName("Tejas 13");
    }
}
class MyThread extends Thread{
    public void run(){
        System.out.println("Hello from Thread Name :: "+Thread.currentThread().getName());
    }
}