import java.util.Scanner;
public class GeterSetter{
    private String color;
    private int tipSize;

    String getColor(){
        return color;
    }

    void setColor(String color){
        this.color=color;
    }

    int getTipSize(){
        return tipSize;
    }

    void setTipSize(int tipSize){
        this.tipSize = tipSize;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        GeterSetter obj = new GeterSetter();

        System.out.println("Enter Colour : ");
        String str = sc.nextLine();

        System.out.println("Enter tip size");
        int num = sc.nextInt();

        obj.setColor(str);
        obj.setTipSize(num);
        
        System.out.println("Colour of pen is : "+obj.getColor());
        System.out.println("Tip size of pen is : "+obj.getTipSize());
    }
}