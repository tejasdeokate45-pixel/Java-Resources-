// In this topic, we learn how a parent’s constructor is called at the time of a child object’s creation. Before the child constructor is executed, the parent constructor is called.

public class ConstructorCalling {
    public static void main(String args[]){
        Mustang m1 = new Mustang();// se closely the output you will gone know new concept
    }
}

abstract class Animal {

    Animal(){
        System.out.println("Animal Class constructor is called : ");
    }

    void animalFunc(){
        System.out.println("This is animal's class function ");
    }

    abstract void breed();
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse's Constructor is called ");
    }

    void breed(){
        System.out.println("Its an male horse breed : ");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustangs Constructire is called : ");
    }

    void breed(){
        System.out.println("This is racing breed solely used for racing : ");
    }
}
