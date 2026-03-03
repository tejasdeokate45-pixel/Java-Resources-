package src;
import src.Bank;
public class LockClass {
    public static void main(String args[]){
        Bank b = new Bank();
        Runnable test = new Runnable(){
          public void run(){
              b.withDraw(100);
          }
        };
        Thread th = new Thread(test);
        th.start();
        Thread th1 = new Thread(test);
        th1.start();

    }
}
