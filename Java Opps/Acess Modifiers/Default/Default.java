package Default;
public class Default {
    static int myNum = 20;

    public static void main(String args[]){
        System.out.println("Hello i am myNum acessed through smae class "+myNum);// default acess modifier acessed through smae class 
    }
    
}

class pen{
    public static void main(String[] args) {
        Default obj = new Default();
        System.out.println("Hello i am myNum acessed through Diffrent class "+obj.myNum);// default acess modifier acessed through diffrent class 
    }
}
