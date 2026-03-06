public class Test {
    int a;
    void SetVal(int i){
        a=i;
    }
    Test incrByten(int n){
        Test temp=new Test();
        temp.a=a+n;
        return temp;
    }
}
class TestRetObject{
    public static void main(String[] args){
        Test ob1=new Test();
        Test ob2;
        ob1.SetVal(2);
        ob2=ob1.incrByten(10);
        System.out.println("ob1.a: "+ob1.a);
        System.out.println("ob2.a: "+ob2.a);
    }
}
