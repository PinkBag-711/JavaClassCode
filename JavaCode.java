import java.util.Scanner;

public class JavaCode {
    public static void main(String[] args) {
        System.out.println("This is your first, second, third, forth or fifth JAVA code?");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.printf("This is my "+name+" JAVA code!");
    }
}
