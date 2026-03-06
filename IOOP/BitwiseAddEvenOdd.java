import java.util.Scanner;

public class BitwiseAddEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Bitwise addition using only a and b
        b=~b+1;
        while (b != 0) {
            int c = (a & b) << 1;  // carry using left shift
            a = a ^ b;            // sum without carry
            b = c;                // add carry
        }

        System.out.println("Difference is  = " + a);

        // Even or Odd check using right shift
        if ((a >> 1) << 1 == a) {
            System.out.println("The result is Even");
        } else {
            System.out.println("The result is Odd");
        }
    }
}
