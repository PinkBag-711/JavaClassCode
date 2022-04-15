import java.util.Scanner;

public class Desk {
    public static void main(String[] args) {
        Scanner  sc=new  Scanner(System.in);
        String  s=sc.nextLine();
        int  leg=sc.nextInt();
        int  hight=sc.nextInt();
        int  ar=sc.nextInt();
        Table  ta=new  Table(s,leg,hight,ar);
        System.out.println(ta);
        sc.close();
    }
}

class Table{
    String shape;
    int leg;
    int Hight;
    int Area;

    @Override
    public String toString() {
        return
                "Shape:" + shape + "\n"+
                "Legs:" + leg +"\n"+
                "Hight" + Hight +"\n"+
                "Area:" + Area ;
    }

    public Table(String s, int leg, int hight, int ar) {
        shape = s;
        this.leg = leg;
        Hight = hight;
        Area = ar;
    }

}
