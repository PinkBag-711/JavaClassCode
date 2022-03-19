import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = Dao(n);
        if(Isprime(m)&& Isprime(n)){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }

    }

    public static int Dao(int n){
        int m = 0;
        String nm="";
        do {

            int a = n%10;
            n = n/10;
            nm = nm+a;
        }while (n%10 !=0);
        m = Integer.parseInt(nm);
        return m;
    }


    public static Boolean Isprime(int n){
        for(int i=2 ;i<n/2; i++){
            if(n%i ==0){
                return false;
            }
        }
        return  true;
    }
}
