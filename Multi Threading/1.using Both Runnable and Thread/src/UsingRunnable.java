public class UsingRunnable {


    static class ThreadUsingRunnable implements Runnable{
        public void run(){
            for(int i = 0;i<100;++i){
                try{
                    Thread.sleep(10);
                }catch(InterruptedException e){
                    System.out.println(e.getMessage());
                }
                System.out.println("At Thread class : "+(i+1));
            }
        }
    }
    public static void main(String args[]){
        ThreadUsingRunnable thread = new ThreadUsingRunnable();
        Thread t = new Thread(thread);
        t.start();

        for(int i = 0;i<100;++i){
            try{
                Thread.sleep(10);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
            System.out.println("Main Class thread : "+(i+1));
        }
    }
}
