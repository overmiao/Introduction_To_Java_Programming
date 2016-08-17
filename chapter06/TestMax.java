import java.util.Scanner;
public class TestMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(max(a, b));
    }

    public static int max(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }
}
