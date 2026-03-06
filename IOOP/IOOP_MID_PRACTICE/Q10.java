class swapper{
    int x;
    int y;
    swapper(int x,int y){
        this.x=x;
        this.y=y;
    }
    int getX(){
        return x;
    }
    int getY(){
        return y;
    }
    void swap(){
    int temp=x;
        x=y;
        y=temp;
        System.out.println("X= "+x);
        System.out.println("Y= "+y);

    }
}

public class Q10 {
    public static void main(String[] args){
        swapper sw=new swapper(25,36);
        System.out.println("getX: "+sw.getX());
        System.out.println("getY: "+sw.getY());
        sw.swap();

    }
}
