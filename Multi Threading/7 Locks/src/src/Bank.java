package src;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Bank{
    private int Balance = 1000;
    Lock lock = new ReentrantLock(true);
    void withDraw(int amt) {
        boolean isLock = false;
        try {
            isLock = lock.tryLock(1000, TimeUnit.MILLISECONDS);
            if (isLock) {
                System.out.println(Thread.currentThread().getName()+" we entere and acquired the lock ");
                System.out.println("Processing Transaction : ");
                Thread.sleep(1000);
                if(Balance>amt){
                    Balance -= amt;
                    System.out.println(" Trasaction Completed ::  of amount : :"+amt);
                }else{
                    System.out.println("In-sufficient Balance :: ");
                }


            }else{
                System.out.println(Thread.currentThread().getName()+" Cant ABle to aquire the lock Stopedd ");
            }
        }catch(Exception e){
            Thread.currentThread().interrupt();
        }finally{
            if(isLock){
                System.out.println("Lock Removed");
               lock.unlock();

            }
        }
    }
}