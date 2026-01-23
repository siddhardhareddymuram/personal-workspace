
import java.util.Scanner;

class Reverse {

    int reverse(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        num = sc.nextInt();

        Reverse obj = new Reverse();   // object created
        int rev = obj.reverse(num);    // method call

        System.out.println("Reversed Number is " + rev);
    }
}
