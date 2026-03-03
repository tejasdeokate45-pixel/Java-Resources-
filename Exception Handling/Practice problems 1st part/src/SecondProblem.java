//Create an array of size 3, then write a try-catch block to access an invalid index (like 5) and
// catch ArrayIndexOutOfBoundsException. Print the exception message.
public class SecondProblem {
    public static void main(String args[]){
        int arr[] = new int[3];
        try{
            arr[5] = 10;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
