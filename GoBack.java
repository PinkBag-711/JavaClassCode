import java.util.Scanner;

public class GoBack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] ori = new int[10];
        System.out.println("Please input 10 numbers:");
        for(int i=0; i<10;i++){
            ori[i] = input.nextInt();
        }
        System.out.println("Your numbers are:");
        for (int ii :ori){
            System.out.printf(ii+" ");
        }
        System.out.println("");
        System.out.println("Please input m:");
        int m = input.nextInt();
        System.out.println("The new numbers are:");
        //要得到最终结果实际上不用真的对数组元素进行移动， 只需要控制输出的起始位置即可
        for (int i =10- m; i<10; i++ ){
            System.out.printf(ori[i]+" ");
        }
        for (int i =0; i<10-m; i++){
            System.out.printf(ori[i]+" ");
        }
    }
}
