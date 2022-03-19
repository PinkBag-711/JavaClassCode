import java.util.Locale;
import java.util.Scanner;

public class SmallToBig {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        s = s.toUpperCase(Locale.ROOT);
        System.out.println("result:"+s);
    }
}
