package Default;
import Protected.ParentClass;

public class ProtectedExample {
    public static void main(String[] args) {
        ParentClass obj = new ParentClass();
        System.out.println("Hello i am myVar i am acessed from outside the packaeg of diffrent file : "+obj.myVar);
    }
}
