// perfroming single task from multiple thread's


public class SingleTaskMultiplethread {
    static class MyWork implements Runnable{
        public void run(){
            System.out.println("Hello from New thread :: ");
        }
    }
    public static void main(String[] args) {
        MyWork obj1 = new MyWork();
        Thread t1 = new Thread(obj1);
        t1.start();

        MyWork obj2 = new MyWork();
        Thread t2 = new Thread(obj2);
        t2.start();
    }
}