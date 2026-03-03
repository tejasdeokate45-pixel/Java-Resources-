public class MethodOverriding {
    public static void main(String args[]){
        Deer d1 = new Deer();
        d1.Eats();
    }
}

class animal{
    void Eats(){
        System.out.println("Animal eats");
    }
}

class Deer extends animal{
    void Eats(){
        System.out.println("Deer eats grass");
    }
}
