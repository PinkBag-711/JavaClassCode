import java.util.Scanner;

public class Aver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        double sum,aver;
        sum  = a+b+c;
        aver = sum/3;
        System.out.println("sum="+sum);
        System.out.println("average="+aver);
    }
}
