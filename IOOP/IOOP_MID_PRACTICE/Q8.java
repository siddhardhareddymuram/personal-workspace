import java.time.LocalDate;
public class Q8 {
    public static void main(String[] args){
        String month,day;
        int date,year;
        LocalDate today=LocalDate.now();
        month=today.getMonth().toString();
        day=today.getDayOfWeek().toString();
        year=today.getYear();
        System.out.println("today's Date: "+today);
        System.out.println("Month: "+month);
        System.out.println("Day: "+day);
        System.out.println("Year: "+year);
        LocalDate future=today.plusDays(10);
        System.out.println("fUTURE Date: "+future);
        LocalDate back=today.minusMonths(3);
        System.out.println("back date: "+back);
        



    }
}
