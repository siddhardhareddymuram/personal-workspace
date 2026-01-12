import java.util.Scanner;
public class counting{
  public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the word/string for counting vowels: ");
    String str=sc.nextLine();
    int count=0;
    for(int i=0;i<str.length();i++){
      char ch=str.charAt(i);
      if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
           count++;
      }
    }
    System.out.println("The number of vowels in the given string is: " + count);
  }
}
      