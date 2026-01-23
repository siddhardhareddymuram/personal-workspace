import java.util.*;
public class BitwiseAdd{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x,y;
    x=sc.nextInt();
    y=sc.nextInt();
    int sum=x&y;
    if((sum>>1)<<1==sum){
        System.out.println("Sum is even");
    }
    else{
        System.out.println("Sum is Odd");
    }
    }
}