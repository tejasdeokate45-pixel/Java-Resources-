
public class InterfaceImplementation{
    public static void main(String args[]){
        Bishop b1 = new Bishop();
        b1.moves();

        Queen q1 = new Queen();
        q1.moves();

        King k1 = new King();
        k1.moves();

        Pawn p1 = new Pawn();
        p1.moves();

        Rook r1 = new Rook();
        r1.moves();

        Knights k2 = new Knights();
        k2.moves();
    }
}

interface Chess{
    public abstract void moves(); 

}

class Knights implements Chess{
    Knights(){
        System.out.println("Knights Construcor called : ");
    }
    public void moves(){
        System.out.println("Knights moves : Goes in an “L” shape (2 steps one way, then 1 step sideways) and can jump over others.");
    }
}

class Pawn implements Chess{

    Pawn(){
        System.out.println("pawns Constrcuctor called : ");
    }
    public void moves(){
        System.out.println("Pawn moves : Goes forward 1 step (first time it can go 2), but eats (captures) slant/diagonal.");
    }
}

class Rook implements Chess{

    Rook(){
        System.out.println("Rooks constructor called : ");
    }
    public void moves(){
        System.out.println("Rook Moves : Goes straight in any direction (up, down, left, right).");
    }
}

class Queen implements Chess{

    Queen(){
        System.out.println("Queens Constructor called : ");
    }

    public void moves(){
        System.out.println("Queen moves : Goes straight or slant, any distance.");
    }
}

class King implements Chess{

    King(){
        System.out.println("Kings Constructor called : ");
    }
    public void moves(){
        System.out.println("King moves :  Goes 1 step in any direction.");
    }
}

class Bishop implements Chess{

    Bishop(){
        System.out.println("Bishops constructor called : ");
    }
    public void moves(){
        System.out.println("Bishop moves : Goes slant/diagonal as far as it wants.");
    }
}