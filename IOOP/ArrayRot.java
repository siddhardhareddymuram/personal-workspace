import java.util.*;

public class ArrayRot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter direction (L/R):");
        char dir = sc.next().charAt(0);
        dir = Character.toUpperCase(dir);

        System.out.println("Enter number of rotations:");
        int rot = sc.nextInt();

       

        for (int j = 0; j < rot; j++) {

            if (dir == 'L') {
                int first = a[0];
                for (int i = 0; i < n - 1; i++) {
                    a[i] = a[i + 1];
                }
                a[n - 1] = first;

            } else if (dir == 'R') {
                int last = a[n - 1];
                for (int i = n - 1; i > 0; i--) {
                    a[i] = a[i - 1];
                }
                a[0] = last;
            }
        }

        System.out.println("Rotated array:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
