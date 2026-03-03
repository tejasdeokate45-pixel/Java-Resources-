// implememntation of default acess speciifer inside same package - cant be acess outside the package 
package Default;

public class SecondDefaultClass {
    public static void main(String args[]){
        Default obj = new Default();
        System.out.println("Hello i am myNum acessed from diffrent File of same package "+obj.myNum);// default acess modifier acessed to difrrent file withinn same package 
    }
}
