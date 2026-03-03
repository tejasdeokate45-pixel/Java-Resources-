//Write a Java program that tries to divide a number by zero inside a try block and catches the resulting
// ArithmeticException to print "Cannot divide by zero."
public class FirstProblem {
    public static void main(String args[]){
        try{
            int ans = 10/0;
        }catch (ArithmeticException e){
            System.out.println("Can not dovide by zero : ");
        }
    }
}
