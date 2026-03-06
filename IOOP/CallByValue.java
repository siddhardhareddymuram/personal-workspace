 class NumberTest {
   
    void modify(int x){
         x*=5;
    }
}
public class CallByValue{
    public static void main(String[] args) {
        NumberTest ob=new NumberTest();
        int a=10;
        System.out.println("Before Modify:"+a);
        ob.modify(a);
        System.out.println("After Modify: "+a);

    }
}

