public class Main {
    public static void main(String[] args) {
        Counter c= new Counter();
        MyThread t1 = new MyThread(c);
        MyThread t2 = new MyThread(c);
        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println(c.getCount());
    }
}

class MyThread extends Thread{
    private Counter c;
    public MyThread(Counter c){
        this.c=c;
    }
    public void run(){
        for(int i = 0;i<1000;i++){
            c.increase();
        }
    }
}

class Counter {
    private int  count = 0;

    synchronized void increase(){
        count++;
    }
    int getCount(){
        return count;
    }
}