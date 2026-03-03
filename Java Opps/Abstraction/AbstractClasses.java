public class AbstractClasses{
    //Animal a = new Animal(); -> this line throw an error because we cant make object of an anstract class 

    public static void main(String[] args) {
        // Animal a = new Animal(); -> this line throw an error because we cant make object of an anstract class 


        Lion lion = new Lion();
        lion.eat();
        lion.legs();


    }
    
}

abstract class Animal{
    void eat(){
        System.out.println("All Animal eats : ");
    }

    abstract void legs();
}

class Lion extends Animal{
    void legs(){
        System.out.println("Lion has 4 legs and they eat animals ");
    }
}
