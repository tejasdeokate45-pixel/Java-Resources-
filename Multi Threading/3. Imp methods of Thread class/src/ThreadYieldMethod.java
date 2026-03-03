public class ThreadYieldMethod {

    public static void main(String args[]){
        Thread1 th = new Thread1("Tejas Thread");
        th.start();
        Thread.yield();
        for(int i=0;i<5;i++){
            System.out.println(i+" Current tHrea :: "+Thread.currentThread().getName());
        }
    }
}

class Thread1 extends Thread{
    Thread1(String name){
        super(name);
    }
    public void run(){
        //Thread.yield();
        for(int i=0;i<5;++i){
            System.out.println(i+" Current tHrea :: "+Thread.currentThread().getName());
        }
    }
}
