import java.util.Scanner;

public class Biggest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input the first number:");
        int a = in.nextInt();
        System.out.println("Please input the second number:");

        int b = in.nextInt();
        System.out.println("Please input the third number:");

        int c = in.nextInt();
        int max;
        if(b>a ){
            max = b;
            if(c>b ){
                max = c;
            }
        }else
        {
            max = a;
            if(c>a){
                max = c;
            }
        }

        System.out.println("The maximum number is:"+max);

    }
}
