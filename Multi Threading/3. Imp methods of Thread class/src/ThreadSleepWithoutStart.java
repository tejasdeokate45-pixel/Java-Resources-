// in this we will invoke thread without start menas we are not crating a thread
public class ThreadSleepWithoutStart {
    public static void main(String args[]){
        Method m1 = new Method();
        m1.run();// this will create a class object not  a thread because to create a thread we require start()method

        Method m2 = new Method();
        m2.run(); // se the output you will get it

    }
}

class Method extends Thread{
    public void run(){
        for(int i = 0;i<5;++i){
            System.out.println(i+" Current Thread :: "+Thread.currentThread().getName());
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
