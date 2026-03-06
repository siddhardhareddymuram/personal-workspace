import java.util.*;
public class Reg_No {
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int reg_no;
System.out.println("Enter the 9-Digit Registartion number of the sStudent: ");
reg_no=sc.nextInt();
int b;
b=reg_no/10000000;

System.out.println("Year of Joining is 20"+b);
    }
}
