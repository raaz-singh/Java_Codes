import java.util.Scanner;
class Algebra{
    int a;
    int b;
    Algebra(int x, int y){
        System.out.println("Constructor Called");
        a = x;
        b = y;
    }
    int add(){
        return a + b;
    }
    int subtract(){
        return a - b;
    }
    int multiply(){
        return a * b;
    }
}
public class Parameterised_Constructor {
    public static void main(String[] args) {
        int x, y;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();

        Algebra obj = new Algebra(x, y);
        System.out.println(obj.add());
        System.out.println(obj.subtract());
        System.out.println(obj.multiply());
    }
}