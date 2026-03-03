//import java.util.concurrent.TimeUnit;
//import java.util.concurrent.locks.Lock;
//import java.util.concurrent.locks.ReentrantLock;
//
//public class ExplicitLock {
//    public static void main(String args[]){
//        Bank bk = new Bank();
//        Runnable test = new Runnable(){
//            public void run(){
//                bk.withDraw(100);
//            }
//        };
//        Thread t1 = new Thread(test);
//        Thread t2 = new Thread(test);
//
//        t1.start();
//        t2.start();
//    }
//}
//class BankAccount {
//    private int Balance =1000;
//    Lock lock= new ReentrantLock();
//
//    void withDraw(int amt){
//        try{
//            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
//                System.out.println(Thread.currentThread().getName()+"Thread Going to with-draw :: "+amt);
//                System.out.println("Withrawing processing :: ");
//
//                try {
//                    Thread.sleep(10000);
//                }catch(InterruptedException e){
//                    System.out.println(e.getMessage());
//                }finally{
//                    lock.unlock();
//                }
//                if(Balance>amt) {
//                    Balance -= amt;
//                    System.out.println(Thread.currentThread().getName() + "Amout withrad Sucessfully :: ");
//                    System.out.println(Thread.currentThread().getName() + "Avaliable balance is :: " + Balance);
//                }else{
//                    System.out.println(Thread.currentThread().getName() + "Insufufcuent Balance :: ");
//
//                }
//            }else{
//                System.out.println(Thread.currentThread().getName()+" Unable to get the lcok ");
//            }
//        }catch(InterruptedException e){
//            System.out.println(e.getMessage());
//        }
//
//    }
//}