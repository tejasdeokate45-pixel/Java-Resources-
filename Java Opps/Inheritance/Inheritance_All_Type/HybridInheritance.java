public class HybridInheritance{

     static float sum(float a, float b){
            return a+b;
        }
    public static void main(String args[]){
        Human tejas = new Human();


        System.out.println(sum((float)2.3,(float)3.4));

        tejas.Breathe="yes tejas breathes";

        System.out.println(tejas.Breathe);
        tejas.Breath();
        tejas.Eat();

        Tuna t1 = new Tuna();
        t1.fins=2;
        System.out.println("tuna have : "+t1.fins);
    }
} 

class Animal{
    String Breathe;

    void Breath(){
        System.out.println("Animal Can Breathe");
    }

    void Eat(){
        System.out.println("All animal can eat : ");
    }

}

class Fish extends Animal{

    int fins;

    void Swim(){
        System.out.println("Fish can swim eaisly : ");
    }
}

        class Tuna extends Fish{
            void specification(){
                System.out.println("it can swim very fast");
            }
        }

class Bird extends Animal{

    int feather;

    void Fly(){
        System.out.println("Birds can fly eailsy ");
    }
}

        class Peacock extends Bird{
            void Color(){
                System.out.println("Peacock is  a bird with beautiful feathers : ");
            }
        }


class Mamals extends Animal{
    String type;

    void live(){
        System.out.println("Either they live on land or are amphibians");
    }
}

        class Human extends Animal{
            void legs(){
                System.out.println("Human have 2 legs and they are very intelligent animals ");
            }
        }