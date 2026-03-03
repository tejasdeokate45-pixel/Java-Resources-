package Protected;

public class SamePackage {
    public static void main(String[] args) {
        ParentClass obj = new ParentClass();
        System.out.println("Hello i am myVar I am aceesed from diffrent file which belong to same package "+obj.myVar);
    }
}
