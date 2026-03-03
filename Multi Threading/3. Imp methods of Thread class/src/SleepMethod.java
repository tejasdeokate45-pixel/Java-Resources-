public class SleepMethod {
    public static void main(String args[]){
        ThreadToSleep th = new ThreadToSleep("Thrad first");
        th.start();

        ThreadToSleep th1 = new ThreadToSleep("Thread Second");
        th1.start();

    }
}

class ThreadToSleep extends Thread{
    ThreadToSleep(String name){
        super(name);
    }
    public void run() {
        for (int i = 0; i < 5; ++i) {
            System.out.println(i+" Cureent Thread is :: "+Thread.currentThread().getName());
            try {
                Thread.sleep(1);
            }catch(Exception e ){
                System.out.println(e);
            }
        }
    }
}
