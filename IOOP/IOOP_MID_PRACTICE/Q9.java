class EMPLOYEE{
    int id;
    String name;
    double bas_sal;
    double DA;
    double gross;
    double ded;
    double net_sal;


    EMPLOYEE(int id,String name,double bas_sal){
        this.id=id;
        this.name=name;
        this.bas_sal=bas_sal;
    }
    void NetSalary(){
        DA=bas_sal*0.4;
        gross=bas_sal+DA;
        ded=gross*0.1;
        net_sal=gross-(0.25)*gross;
        
    }
    void display(){
        System.out.println("ID: "+id);
        System.out.println("Name:"+name);
        System.out.println("basic Salary: "+bas_sal);
        System.out.println("Net Salary: "+net_sal);
    }
}

public class Q9 {
    public static void main(String[] args){
        EMPLOYEE e= new EMPLOYEE(52220,"Siddhardha",50000);
        e.NetSalary();
        e.display();

    }
    
}
