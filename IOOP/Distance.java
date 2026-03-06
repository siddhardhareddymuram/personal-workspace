import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total fare paid (INR): ");
        double fare = sc.nextDouble();

        double distance = 0;

        if (fare <= 5 * 10) { 
            distance = fare / 10;
        } else if (fare <= 5*10 + 15*8) {
            distance = 5 + (fare - 50) / 8;
        } else if (fare <= 5*10 + 15*8 + 25*5) { 
            distance = 5 + 15 + (fare - 50 - 120) / 5;
        } else { 
            distance = 5 + 15 + 25 + (fare - 50 - 120 - 125) / 5;
        }

        System.out.println("Total distance traveled = " + distance + " km");
    }
}
