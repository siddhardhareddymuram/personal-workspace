import java.util.*;
class product{
    String pname;
    double price;
    double discount;
    double tax;
    double dprice;
    double tprice;
    product(String pname,double price,double discount,double tax){
        this.pname=pname;
        this.price=price;
        this.discount=discount;
        this.tax=tax;
    }
    void bill(){
       dprice=price-(price*(discount/100));
       tprice=dprice+(dprice*(tax/100));
    }
    void display(){
        System.out.println("Name of the Product is: "+pname);
        System.out.println("Original Price of product is: "+price);
        System.out.println("Discounted Price of product is: "+dprice);
        System.out.println("Final Price of product is: "+tprice);

    }
}

public class Q14 {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
        product[] products=new product[5];
        for(int i=0;i<products.length;i++){
           System.out.println("Name of P:"+(i+1));
           String n=sc.nextLine();
           System.out.println("Price of P:"+(i+1));
           double p=sc.nextDouble();
           System.out.println("Discount of P:"+(i+1));
           double d=sc.nextDouble();
           System.out.println("Tax of P:"+(i+1));
           double t=sc.nextDouble();
           sc.nextLine();
            products[i]=new product(n,p,d,t);


        }
        for(int i=0;i<products.length;i++){
            products[i].bill();
            products[i].display();
        }
    }
    
}
