import java.util.Scanner;
public class Avg_Method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter the numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.println(avg(a, b, c));
    }
    public static int avg(int a, int b, int c){
        return (a + b + c) / 3;
    }
}
