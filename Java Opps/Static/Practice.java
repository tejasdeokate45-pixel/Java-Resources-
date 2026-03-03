import java.util.Scanner;
public class Practice{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and coloumn");
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(j==0||j==3||i==0||i==2){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }



    }
}