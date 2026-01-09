    import java.util.Scanner;

    public class Salary_calc {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter number of hours worked (integer only): ");
            int hrs=s.nextInt();
            double salary;
            if(hrs<=40){
               salary=1500.0;
            }
            else{
                salary=1500.0+(double)((hrs-40)*1.5);
            }
            System.out.println("Salary: " + salary);
        }
    }