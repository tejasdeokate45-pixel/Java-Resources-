public class PrivateClass {
    private static int myVar = 10;

   public static void main(String args[]){
        System.out.println(myVar);
   } 
}

class AcessPrivate{
    public static void main(String args[]){
        PrivateClass obj = new PrivateClass();
        // System.out.println(obj.myVar);// cant acess its private
    }
}
