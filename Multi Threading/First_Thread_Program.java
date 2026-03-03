class A extends Thread{
    public void run(){
        for(int i =0;i<100;++i){
            System.out.println("Hii");
            try {
                Thread.sleep(20);
            } catch (Exception e) {
                System.out.println(e.getStackTrace());
                // TODO: handle exception
            }
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i =0;i<100;++i){
            System.out.println("Hello");
            try{
                Thread.sleep(20);
            }catch(InterruptedException e){
                System.out.println(e.getStackTrace());
            }
        }
    }
}
public class First_Thread_Program{
public static void main(String[] args) {

    A obj = new A();
    B obj1 = new B();


    obj.setPriority(10);
    obj1.setPriority(9);
    
    obj.start();
    try {
        Thread.sleep(10);
        
    } catch (Exception e) {
        System.out.println(e.getStackTrace());
        // TODO: handle exception
    }
    obj1.start();
    

    System.out.println("class a thread priority : "+obj.getPriority());
    System.out.println("class b thread priority : "+obj1.getPriority());

}
}