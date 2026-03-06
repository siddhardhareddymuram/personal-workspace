public class Q4 {
    public static void main(String[] args){
        int a=2;
        int b=3;
        while(b!=0){
            int c=((~a)&b)<<1;
            a=a^b;
            b=c;
        }
        System.out.println("Sum of the integers is: "+a);
    }
    
}
