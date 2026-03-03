public class MultipleTaskMultipleThread{

    static class MyThread1 extends Thread{
        public void run(){
            System.out.println("Hello :: My thread1 ");
        }
    }

    static class MyThread2 extends Thread{
        public void run(){
            System.out.println("Hello :: My thread2 ");
        }
    }
    public static void main(String args[]){
        MyThread1 t1 = new MyThread1();
        t1.start();

        MyThread2 t2 = new MyThread2();
        t2.start();
    }

}