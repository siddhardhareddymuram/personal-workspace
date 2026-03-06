public class Box{
    int length,width,height;
    void SetDim(int l,int w,int h){
        length=l;
        width=w;
        height=h;
    }
    Box increaseSize(int x){
        Box temp=new Box();
        temp.length=length+x;
        temp.width=width+x; 
        temp.height=height+x;
        return temp;
    }


    public static void main(String[] args){
     Box box1=new Box();
     Box box2;
     box1.SetDim(2,3,4);
     box2=box1.increaseSize(5);
        System.out.println("box1 dimensions: "+box1.length+" x "+box1.width+" x "+box1.height);
        System.out.println("box2 dimensions: "+box2.length+" x "+box2.width+" x "+box2.height);
    }

}