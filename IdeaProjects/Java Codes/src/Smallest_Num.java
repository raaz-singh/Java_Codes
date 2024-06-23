import java.util.Scanner;
public class Smallest_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.println(small(a, b, c));
    }
    public static int small(int a, int b, int c){
        if (a < b && a < c){
            return a;
        } else if (b < c && b < a) {
            return b;
        }else {
            return c;
        }
    }
}
