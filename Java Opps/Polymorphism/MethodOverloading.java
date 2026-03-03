public class MethodOverloading{

    public static void main(String args[]){
        System.out.println(sum(12,13));
        System.out.println(sum((float)3.4,(float)5.6));
        System.out.println(sum(12,13,14));


    }

    static int sum(int a, int b){
        return a+b;
    }

    static float sum(float a,float b){
        return a+b;
    }

    static int sum(int a,int b,int c){
        return a+b+c;
    }

}