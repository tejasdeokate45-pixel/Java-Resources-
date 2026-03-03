public class InterruptedUse {

    public static void main(String args[]){

    }
}


class Thread1 extends Thread{
    public void run(){
        System.out.println("Interrupted Status :: "+Thread.currentThread().isInterrupted());//Just Print the status didn't change it
        System.out.println("Interrupted Status :: "+Thread.interrupted());// change the status :- True -> false
        System.out.println("Interrupted Status :: "+Thread.interrupted());// using this 2 time cant change the status to true re again
        // it only cunvert true -> to false but cant false -> true for false to true we have to use interrupt() method
        try{
            for(int i = 0;i<5;i++){
                System.out.println();
                Thread.sleep(1000);
                System.out.println("Interrupted Status :: "+Thread.interrupted());// this statement can only print false
            }
        }catch(InterruptedException e){
            System.out.println(e);
        }

    }
}
