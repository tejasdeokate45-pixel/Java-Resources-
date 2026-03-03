package Protected;

public class ParentClass {
    protected int myVar = 20;

    public static void main(String args[]){
        ParentClass obj = new ParentClass();
        System.out.println("Hello i ma myVAr Acessed thorgh same class "+obj.myVar);// acess protected within a same class 
    }
}

class SecondOne{
    public static void main(String[] args) {
        ParentClass obj = new ParentClass();
        System.out.println("Hello i am myVar of parent class acessed thorgh another class "+obj.myVar);// acess myvar of protected type through anoother class through same file

    }
}
