import java.util.*;

public class ProductManage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of products:");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        int[] quant = new int[n];
        float[] price = new float[n];
        String[] name = new String[n];

        // Input product details
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the name of product " + (i + 1));
            name[i] = sc.nextLine();

            System.out.println("Enter the price of product " + (i + 1));
            price[i] = sc.nextFloat();

            System.out.println("Enter the quantity available of product " + (i + 1));
            quant[i] = sc.nextInt();
            sc.nextLine(); // consume newline
        }

        // Purchase details
        System.out.println("Enter the product name you want:");
        String username = sc.nextLine();

        System.out.println("Enter the quantity you want:");
        int userquant = sc.nextInt();

        float amount = 0;

        for (int i = 0; i < n; i++) {
            if (username.equals(name[i]) && userquant <= quant[i]) {
                amount = price[i] * userquant;
                break;
            }
        }

        System.out.println("Total bill amount: " + amount);
    }
}
