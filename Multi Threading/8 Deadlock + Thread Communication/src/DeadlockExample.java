class Pen{
    void write(){
        System.out.println("Pen is writing ");
    }
}

class Paper{
    void draw(){
        System.out.println("Paper is used for writing on it");
    }
}
public class DeadlockExample {


    public static void main(String args[]){

        Pen pen = new Pen();
        Paper paper= new Paper();


        Thread t1 = new Thread(new Runnable(){
            public void run(){
                synchronized(pen){
                    pen.write();
                    System.out.println(Thread.currentThread().getName()+"Acquired Pen");
                    try{
                        Thread.sleep(400);
                    }catch(InterruptedException e){
                        Thread.currentThread().interrupt();
                    }
                    System.out.println(Thread.currentThread().getName()+" Waiting for paper ::.................... ");
                    synchronized(paper) {
                        paper.draw();
                    }
                }
            }
        });

        Thread t2 = new Thread(new Runnable(){
            public void run(){
                synchronized(paper) {
                    paper.draw();
                    System.out.println(Thread.currentThread().getName() + "Acquired Paper");
                    try {
                        Thread.sleep(400);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    System.out.println(Thread.currentThread().getName() + " Waiting for Pen :: .................");
                    synchronized (pen) {
                        pen.write();
                    }
                }
            }
        });
        t1.start();
        t2.start();
    }

}
