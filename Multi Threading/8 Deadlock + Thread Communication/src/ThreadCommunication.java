class SharedResource{
    private int data;
    private boolean hasdata;

    synchronized void producer(int val){
        while(hasdata){
            try{
                wait();
            }catch(InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        data = val;
        hasdata=true;
        System.out.println("Produced : "+val);
        notify();
    }

    synchronized void consumer(){
        while(!hasdata){
            try{
                wait();
            }catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
        hasdata = false;
        System.out.println("Consumer Consumed : "+data);
        notify();
    }
}

class Producer extends Thread{
    SharedResource resource;

    public Producer(SharedResource resource){
        this.resource = resource;
    }
    public void run(){
        for(int i = 0;i<5;i++){
            resource.producer(i);
        }
    }
}

class Consumer extends Thread{
    SharedResource resource;

    public Consumer(SharedResource resource){
        this.resource = resource;
    }

    public void run(){
        for(int i = 0;i<5;i++){
            resource.consumer();
        }
    }
}
public class ThreadCommunication {
    public static void main(String args[]){
        SharedResource sh = new SharedResource();
        Consumer c = new Consumer(sh);
        Producer p = new Producer(sh);

        p.start();
        c.start();
    }
}
