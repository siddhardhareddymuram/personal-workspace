import java.time.LocalDate;
class EMPLOYEE{
    int empId;
    String empName;
    double basicSalary;
    LocalDate joiningDate;
    double DA;
    double gross;
    double Tax;
    double net_sal;
    EMPLOYEE(int empId,String empName,double basicSalary,LocalDate joiningDate){
        this.empId=empId;
        this.empName=empName;
        this.basicSalary=basicSalary;
        this.joiningDate=joiningDate;
    }
    void computeNetSalary(){
        DA=basicSalary*0.40;
        gross=basicSalary+DA;
        Tax=gross*0.10;
        net_sal=gross-Tax;
    }
    void display(){
        System.out.println("ID: "+empId);
        System.out.println("Name: "+empName);
        System.out.println("Basic Salary: "+basicSalary);
        System.out.println("Joining Date: "+joiningDate);
        System.out.println("DA: "+DA);
        System.out.println("Gross: "+gross);
        System.out.println("Tax: "+Tax);
        System.out.println("Net Salary: "+net_sal);
    }
    void display(String Dept){
        System.out.println("ID: "+empId);
        System.out.println("Name: "+empName);
        System.out.println("Basic Salary: "+basicSalary);
        System.out.println("Joining Date: "+joiningDate);
        System.out.println("DA: "+DA);
        System.out.println("Gross: "+gross);
        System.out.println("Tax: "+Tax);
        System.out.println("Net Salary: "+net_sal);
        System.out.println("ID: "+empId);
        System.out.println("Name: "+empName);
        System.out.println("Basic Salary: "+basicSalary);
        System.out.println("Joining Date: "+joiningDate);
        System.out.println("DA: "+DA);
        System.out.println("Gross: "+gross);
        System.out.println("Tax: "+Tax);
        System.out.println("Department: "+Dept);
    }
    class Project{
        int projId;
        String proName;
        void displayProject(){
            System.out.println("Project ID: "+projId);
            System.out.println("Project Name: "+proName);
        }
    }


}

public class Q11 {
    public static void main(String[] args){
        EMPLOYEE e1=new EMPLOYEE(52220,"Siddhardha",50000,LocalDate.of(2024,5,10));
        e1.computeNetSalary();
        e1.display();
        e1.display("School of Computer Engineering");
        EMPLOYEE.Project inner=e1.new Project();
        inner.displayProject();


    }
    
}
