class Details{
    int radius;
    void SetRadius(int r){
        radius=r;
    }
    Details doubleRadius(){
        Details NewRadius=new Details();
        NewRadius.radius=2*radius;
        return NewRadius;
    }
}

public class Circle {
    public static void main(String[] args){
        Details ob1=new Details();
        Details ob2;
        ob1.SetRadius(5);
        ob2=ob1.doubleRadius();
        System.out.println("ob1.radius: "+ob1.radius);
        System.out.println("ob2.radius: "+ob2.radius);
        
    }
}
