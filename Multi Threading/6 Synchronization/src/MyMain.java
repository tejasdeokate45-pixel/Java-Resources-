// int this code i have created a class bank account with synchronized method and called using thread to perfrom
// some actions that's it

public class MyMain{

    public static void main(String args[]){
        BankAccount bk = new BankAccount();
        Runnable test = new Runnable(){ // -> new Runnable() -- lambda expression
            public void run(){
                bk.withdraw(501);
            }
        };
        Thread t1 = new Thread(test,"Thread 1");
        Thread t2 = new Thread(test,"Thread 2");
        Thread t3 = new Thread(test,"Thread 3");
        t1.start();
        t2.start();
        t3.start();
    }
}
class BankAccount{
    public int balance = 1000;

    public  synchronized void withdraw(int amt){
        System.out.println(Thread.currentThread().getName()+" IS trying to withdraw :: ");
        if(balance > amt){
            System.out.println(Thread.currentThread().getName()+" Is withdrawing  :: amount :: "+amt);
            balance -= amt;
            try{
                Thread.sleep(1000);
            }catch(InterruptedException r){
                System.out.println(r);
            }
        }else{
            System.out.println(Thread.currentThread().getName()+" Insufufcuend BValance  :: amount : "+amt+"Balance  :: "+balance);
        }
        System.out.println(Thread.currentThread().getName()+"BAlance remaining ::  "+balance);
    }
}

