import java.util.Scanner;

public class Chars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a sentence:");
        char a='0';// a__97  A__65  z__122  Z__90
        char b=' '; //0-9__48-57  ' '__32
//
        int as=0, ks=0, ns=0,os = 0;
        String sen = input.nextLine();
        char[] senC = sen.toCharArray();
        for( char c :senC){  //找到他们对应的askll码进行比较，可以判断出当前字符是空格或者数字或者字母
            int cc = (int)(c);
            if((cc>=97 && cc<=122) ||(cc>=65 && cc<=90)){
                as+=1;
            }else if(cc==32){ // 空格的askll码为32
                ks+=1;
            }else if(cc>=48 && cc<=57){
                ns+=1;
            }else {
                os+=1;
            }
        }
        System.out.println("The number of numbers is: "+ns);
        System.out.println("The number of English letters is: "+as);
        System.out.println("The number of blank space is: "+ks);
        System.out.println("The number of other characters is: "+os);
    }
}
