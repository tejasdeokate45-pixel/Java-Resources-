class ChildDaemonThread extends Thread{
    public void run(){
        System.out.println("This is By deafult Daemon beacuse its parent is Daemon so no need to delareit Daemon");
        System.out.println("Is This thread Daemon  :: "+Thread.currentThread().isDaemon());
        System.out.println("This default Daemon Thread priority :: "+Thread.currentThread().getPriority());
    }
}

class DThread extends Thread{
    public void run(){
        System.out.println("This is Daemon Thread :: ");
        System.out.println("Is this Daemon Thread :: "+Thread.currentThread().isDaemon());
        System.out.println("This default Explicit Thread priority :: "+Thread.currentThread().getPriority());
        ChildDaemonThread d1 = new ChildDaemonThread();
        d1.start();
        try {
            Thread.sleep(100); // <-- give daemon thread time to run
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class DeamonThreads {
    public static void main(String args[]){
        System.out.println("This is main Thread :: ");
        System.out.println("This Main Thread priority :: "+Thread.currentThread().getPriority());

        DThread t1 = new DThread();
        t1.setDaemon(true);
        t1.start();
        try {
            Thread.sleep(100); // <-- give daemon thread time to run
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
// the priority here prove the properties are passed from parent to child thread ::