import java.util.Scanner;
public class SecondStringEmpty {

    static class NullStringException extends Exception{
        public NullStringException(String message){
            super(message);
        }
    }
    static void checkString(String name) throws NullStringException{
        if(name.length()==0){
            throw new NullStringException("String is null bro : ");
        }
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            String name;
            System.out.println("Enter your name ");
            name = sc.nextLine();
            try{
                checkString(name);
            }catch(NullStringException e){
                System.out.println(e.getMessage());
            }
            System.out.println("You entered a valid Name and it's not null : "+name);
        }
    }
}
