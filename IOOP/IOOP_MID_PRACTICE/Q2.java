import java.time.LocalDate;
public class Q2{
    public static void main(String[] args){
    int month,year;
    String dayName,Month;
    LocalDate today=LocalDate.now();
    dayName=today.getDayOfWeek().toString();
    Month=today.getMonth().toString();
    year=today.getYear();
    System.out.println("Today's Date: "+today);
    System.out.println("Today's Day: "+dayName);
    System.out.println("Today's Month: "+Month);
    LocalDate futureDate = today.plusDays(10);
    System.out.println("Date After 10 days: "+futureDate);
    }
}