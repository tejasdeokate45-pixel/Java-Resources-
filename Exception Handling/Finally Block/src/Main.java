import java.util.Scanner;
// how and when to use finallyu
public class Main{
    static class MyCustomException extends Exception{
       public  MyCustomException(String Message){
           super (Message);
       }
    }
    static int divide(int n1,int n2) throws MyCustomException{
//        if(n2==0){
//            throw new MyCustomException("Divide by zero");
//        }
            return n1/n2;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 Number : ");
        int num1= sc.nextInt();
        int num2= sc.nextInt();

        try {
            System.out.println("in try");
            divide(num1, num2);
        }catch(MyCustomException e){
            System.out.println("in catch");
            System.out.println(e.getMessage());
        }finally{
            System.out.println("in finally");
            sc.close();
        }
    }
}