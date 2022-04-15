import java.util.Scanner;

public class Retangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input length:");
        double x= in.nextDouble();
        System.out.println("Please input width:");
        double y = in.nextDouble();

        Ret r = new Ret(x,y);
        System.out.println("The lengh is:"+r.length);
        System.out.println("The width is:"+r.width);
        System.out.println("The area is:"+r.area());
    }
}

class Ret{
    double length;
    double width;

    public Ret(double x , double y){
        length = x;
        width = y;
    }
    double area(){
        return length*width;
    }
}
