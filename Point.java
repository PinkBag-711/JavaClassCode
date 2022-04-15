import java.util.Scanner;

public class Point {
    public static void main(String[] args) {

        Scanner in =  new Scanner(System.in);
        System.out.println("Please input the horizontal (X) :");
        double x = in.nextDouble();
        System.out.println("Please input the ordinate (Y) :");
        double y = in.nextDouble();
        MyPiont myPiont = new MyPiont(x,y);
        myPiont.get();

    }
}


class MyPiont{
    double x;
    double y;


    public MyPiont(){
        x=0;
        y=0;
    }

    public MyPiont(double x, double y){
        this.x=x;
        this.y=y;
    }

    void get(){
        System.out.println("Your location of horizontal (X) is :"+x);
        System.out.printf("Your location of ordinate (Y) is :"+y);
    }

}