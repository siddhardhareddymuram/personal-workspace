import java.util.*;
public class ProductManage1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of products: ");
        n=sc.nextInt();
        String[] name = new String[n];
        double[] price = new double[n];
        int[] quant = new int[n];
        System.out.println("Enter the details of the products: ");
        for(int i=0;i<n;i++){
            int a=i+1;
            System.out.println("Name of Product-"+a);
            name[i]=sc.next();
            System.out.println("Price of Product-"+a);
            price[i]=sc.nextDouble();
            System.out.println("Quantity of Product-"+a);
            quant[i]=sc.nextInt();

        }
        String userProd;
        int userQuant;
        System.out.println("Enter the name of the product required: ");
        userProd=sc.next();
        System.out.println("Enter the quantity: ");
        userQuant=sc.nextInt();
        double bill=0;
        int flag=0;
        for(int i=0;i<n;i++){
            if(userProd.equals(name[i])){
           if(userQuant<=quant[i]){
          bill=price[i]*userQuant;
           flag=1;
           }
           else{
            System.out.println("Stock of the product is not Available...");
           }
            }
            else{
                System.out.println("There is No such Product Available ....");
            }
        }
        if(flag==1){
            System.out.println("Total Bill amount is $"+bill);
        }
    }
}