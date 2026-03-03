
import java.util.Scanner;

public class Main{
    static class WeakPasswordException extends Exception{
        public WeakPasswordException(String message){
            super (message);
        }
    }
    static void validatePassword(String password) throws WeakPasswordException {
        if(password.length()<8){
            throw new WeakPasswordException("Your password limit should be of more than 8 charcters : ");

        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        try{
        validatePassword(password);
        }catch (WeakPasswordException e){
            System.out.println(e.getMessage());
            return;
        }
        System.out.println("Your pass word is fine ");

    }
}