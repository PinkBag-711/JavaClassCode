import java.security.PrivateKey;
import java.util.Scanner;

public class triangle_test {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        double x = in.nextDouble();
        double y = in.nextDouble();
        double z = in.nextDouble();
       // x.setSide(a,b,c);

        Triangel s = new Triangel(x,y,z);
        System.out.println("perimeter="+s.getPeerimeter());
        System.out.println("area="+s.getArea());
        System.out.println(s);
    }
}

class Triangel{
    private double a,b,c;

    @Override
    public String toString() {
        return "a=" + a + ",b=" + b + ",c=" + c ;
    }

    double getPeerimeter(){
        return a+b+c;
    }

    String getArea(){
        double p = (a+b+c)/2.0;
        double s = (p*(p-a)*(p-b)*(p-c));
        s = Math.sqrt(s);
        String ss = String.format("%.1f",s);
        return ss;
    }

    public Triangel(double x, double y, double z) {
        if (x+y>z && y+z>x && x+z>y) {
            a = x;
            b = y;
            c = z;
        } else {
            a = 0;
            b = 0;
            c = 0;
        }
    }
/*
    public void setSide(double x, double y, double z){
        a = x;
        b = y;
        c = z;
    }

 */
}
