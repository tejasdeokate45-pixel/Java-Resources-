public class StackTrace {
    public static void main(String args[]){
        try{
        fun1();
        }catch(Exception e){
           e.printStackTrace();
        }
    }

    static void fun1(){
        fun2();
    }


    static void fun2(){
        fun3();
    }

    static void fun3(){
        int arr[] = new int[5];
            arr[10] = 12;
        
    }
}
// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 5
//         at StackTrace.fun3(StackTrace.java:17)
//         at StackTrace.fun2(StackTrace.java:12)
//         at StackTrace.fun1(StackTrace.java:7)
//         at StackTrace.main(StackTrace.java:3)
//this is the stack trace - help for debuging 
