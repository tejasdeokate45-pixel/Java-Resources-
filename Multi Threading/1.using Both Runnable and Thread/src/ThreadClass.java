public class ThreadClass {
    static class UsingThreadClass extends Thread{
        public void run(){
            for(int i = 0;i<100;++i){
                // this try catch will slepp this thread for 100milli second in that time period main will execute
                try {
                    Thread.sleep(100);
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }
                System.out.println("Thread Class "+(i+1));
            }
        }
    }

    public static void main(String args[]){

        UsingThreadClass t = new UsingThreadClass();
        t.start();

        for(int i = 0;i<100;++i){
            // this try block will sleep this Main thread for some time so that new thread can execute at that tim e
            try{
                Thread.sleep(100);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
            System.out.println("Main Class Thread : "+(i+1));
        }



    }
}