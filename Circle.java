import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double r = in.nextDouble();
        Cir c = new Cir(r);
        c.disp();
    }
}


class Cir{
    private double radius;

    public Cir(double r) {
        radius = r;
    }
    public Cir() {
        radius = 0;
    }

    double getPerimeter(){
        return 2*Math.PI*radius;
    }
    double getArea(){
        return Math.PI*radius*radius;
    }
    void disp(){
        System.out.printf("radius=%.4f\n",radius);
        System.out.printf("perimeter=%.4f\n",getPerimeter());
        System.out.printf("area=%.4f\n",getArea());
    }

}