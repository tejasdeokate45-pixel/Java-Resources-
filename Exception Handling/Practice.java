// public class Practice{
//     public static void main(String[] args) {
//         int arr[]= new int[9];
//         try{
//             int num = arr[10]/0;
//         }catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
//             System.out.println(e);
//         }//in a single catch block with multiple exception only one excpetion will implemnt not in the order they written but in the order exception will occur like in this code first array out of bound will occur then so it will be printed 
        
//     }
// }
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
public class Practice{
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