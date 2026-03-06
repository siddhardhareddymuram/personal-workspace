class Student{
    int Marks;
    void addGrace(Student s){
        s=new Student();
        s.Marks=100;
    }
}
public class StudentMain{
public static void main(String[] args){
    Student s1=new Student();
    s1.Marks=70;
    System.out.println("Before adding grace marks: "+s1.Marks);
    s1.addGrace(s1);
    System.out.println("After adding grace marks: "+s1.Marks);
}
}