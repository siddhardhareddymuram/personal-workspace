 import java.util.Scanner;
 
    public class roatation {
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    int n;
    
    System.out.println("Enter the size of array: ");
    n=s.nextInt();
    int arr[];
    arr=new int[n];
    System.out.println("Enter the elements of array: ");
    for(int i=0;i<n;i++){
        
        arr[i]=s.nextInt();
    }
    int rot;
    System.out.println("Enter the number of rotations: ");
    rot=s.nextInt();
    char dir;
    System.out.println("Enter the direction of rotation (L or R): ");
    dir=s.next().charAt(0);
    for(int i=0;i<rot;i++){
    if(dir=='R'|| dir=='r'){
        int last=arr[n-1];
        for(int j=n-1;j>0;j--){
            arr[j]=arr[j-1];
        }
        arr[0]=last;
        
    }
    else if(dir=='L'|| dir =='l'){
        int first=arr[0];
        for(int j=0;j<n-1;j++){
            arr[j]=arr[j+1];
        }
        arr[n-1]=first;

    }
}
System.out.println("Array after rotation: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    
  }
} 
