import java.util.*;
class Die{
    int sideUp;
    int getSideUp(){
        return sideUp;
    }
    void roll(){
    Random r=new Random();
    sideUp=r.nextInt(6)+1;
    }
}
public class Q3 {
    public static void main(String[] args){
        Die d1=new Die();
        Die d2=new Die();
        d1.roll();
        d2.roll();
        int r1=d1.getSideUp();
        int r2=d2.getSideUp();
        int result=r1+r2;
        System.out.println("Sum of the Faces: "+result);

    }
    
}
