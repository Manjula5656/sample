import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        System.out.println("simple calculator");
        float r,b,h;
        String operation;
        Scanner a = new Scanner(System.in);
        System.out.println("enter the r");
        r = a.nextFloat();
        System.out.println("enter the b");
        b = a.nextFloat();
        System.out.println("enter the h");
        h = a.nextFloat();
        System.out.println("enter the operation");
        operation = a.next();
        switch (operation){
            case"circle":
                System.out.println(3.14*r*r);
                break;
            case"triangle":
                System.out.println(0.5*b*h);
                break;
            default:
                System.out.println("undefined");
        }
    }
}
