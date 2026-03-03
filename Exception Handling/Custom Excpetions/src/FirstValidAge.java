// age is smaller than 18 custom exception
import java.util.Scanner;

public class FirstValidAge {
    static class SmallAgeException extends Exception{
        public SmallAgeException(String message){
            super (message);
        }
    }

    static void validateAge(int age) throws SmallAgeException{
        if(age<18){
            throw new SmallAgeException("Your age is smaller than 18");
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int age;
        System.out.println("Enter your age : ");
        age = sc.nextInt();

        try {
            validateAge(age);
        }catch(SmallAgeException e){
            System.out.println(e);
        }
    }
}
