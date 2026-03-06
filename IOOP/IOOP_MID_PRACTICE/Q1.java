class Student {

    int regNum;
    String name;
    int[] subjectWiseMarks;
    int totalMarks;
    char grade;

    
    Student() {
        regNum = 0;
        name = "Unknown";
        subjectWiseMarks = new int[6];    
        totalMarks = 0;
        grade = 'F';
    }

    
    Student(int r, String n, int[] marks) {
        regNum = r;
        name = n;
        subjectWiseMarks = marks;
        totalMarks = 0;
        grade = 'F';
    }
    void compute(){
        totalMarks=0;
        for(int i:subjectWiseMarks){
            totalMarks=totalMarks+i;
        }
        if(totalMarks>=90){
            grade='A';
        }
        else if(totalMarks>=80&&totalMarks<90){
            grade='B';
        }
        else if(totalMarks>=70&&totalMarks<80){
            grade='C';
        }
        else if(totalMarks>=60&&totalMarks<70){
            grade='D';
        }
        else if(totalMarks>=50&&totalMarks<60){
            grade='E';
        }
        else{
            grade='F';
        }
    }
    void display(){
        System.out.println("Name of the Student is: "+name);
        System.out.println("RegNo of the Student is: "+regNum);
        System.out.println("Subject wise marks of the Student are: ");
        for(int j:subjectWiseMarks){
          System.out.println(j);
        }
        System.out.println("Total Marks of the Student is: "+totalMarks);
        System.out.println("Grade of the Student is: "+grade);
    }
}
public class Q1{
    public static void main(String[] args){
        Student s=new Student(2510900,"Siddhardha",new int[]{14,25,10,12,13,41});
        s.compute();
        s.display();

    }
}