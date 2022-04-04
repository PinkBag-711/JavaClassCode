import java.util.Scanner;

public class huiwen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        for(int i=a; i<=b; i++){
            if(nixu(i)){
                System.out.println(i);
            }
        }
    }

    //判断 n 是不是回文数
    public static Boolean nixu(int n){
        String ni = new String();
        int m = n; //用m保留n的值
        while (n!=0){ //用whlie和字符串不断得到n的最后一位，并作为字符串ni的下一位，
                 // 这样最终得到的字符串ni就是n的逆序
            ni += n%10;
            n = n/10;
        }
        n = Integer.parseInt(ni); //得到ni的int类型，懒得再申请一个int的数字，
                                    // 所以重复利用了n
        if(m==n){
            return true;
        } else
            return false;
    }

}
