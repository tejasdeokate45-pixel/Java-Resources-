import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WithoutExecutors {
    /*
    * In the below code we haven't used execuotrs due to whcih out put is not perfect code is not good we
    * haven't used Executors framework  */


//    public static void main(String args[]){
//            long startTime = System.currentTimeMillis();
//            Thread[] thread = new Thread[10];
//           for(int i = 1;i<=10;i++){
//               final int val = i;
//               thread[i-1] = new Thread(()->{
//               System.out.println(factorial(val));
//               }
//               );
//               thread[i-1].start();
//           }
//           for(Thread threads : thread){
//               try{
//                   threads.join();
//               }catch(InterruptedException e){
//                   Thread.currentThread().interrupted();
//               }
//           }
//           System.out.println("Total Time required :: "+(System.currentTimeMillis()-startTime));
//    }

    // same program using Thread pools


    public static void main(String args[]){
        long startTime = System.currentTimeMillis();
        ExecutorService executor = Executors.newFixedThreadPool(3);
        for( int i = 1;i<=10;++i){
            final int num = i;
            executor.submit(()->{
            System.out.println(factorial(num));
            });
        }
        executor.shutdown();
        System.out.println("Total Time Taken ::"+(System.currentTimeMillis()-startTime));
    }

    static int factorial(int num){
        //System.out.println(Thread.currentThread().getName()+" Current Thread name :: ");
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            Thread.currentThread().interrupted();
        }
        int mul = 1;
        for(int i = 1;i<=num;++i){
            mul =mul * i;
        }
        return mul;
    }
}

