import java.util.Scanner;
public class DeleNum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String s = input.next(); //即使0在最开始也要输出，所以可以考虑用字符串的形式得到大数
        int sl = s.length();  // 大数的长度 sl
        int n = input.nextInt();  //要删去的个数
        char[] num = s.toCharArray(); //将大数的每一位都转化成数组里面的一个元素
        for(int j=0;j<n; j++) {
            for (int i=0; i<sl-1 ;i++){
                if(num[i]>num[i+1] ){
                   for (int p=i; p<sl-1;p++){ // 发现一个前面比后面大的，就移位,相当于删除了该数；
                       num[p] =num[p+1];
                   }
                    break; //删掉了一次之后就要退出循环重新判断
                }
            }
            }
        for(int k=0;k<sl-n ;k++ ){  //只输出 sl-n位，因为并没有将字符个数真正的减少，而是被后面的覆盖，
                                      //所以前面的（sl-n）位得到的是应该输出的数
            if(num[k] > 0){
                System.out.print(num[k]);
            }
        }
    }
}
