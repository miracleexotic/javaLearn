import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class OOP01 {
    
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);
        System.out.println(today.getDayOfWeek());
        System.out.println(today.getDayOfYear());

        LocalDate day199 = LocalDate.ofYearDay(2014, 199);
        System.out.println("วันลำดับที่ 199 ของปี 2014 คือ " + day199);

        LocalDate worldCup2014 = LocalDate.of(2014, Month.JUNE, 12);
        System.out.println(today.until(worldCup2014, ChronoUnit.DAYS));

        LocalDate birthdate = LocalDate.of(2000, Month.JULY, 31);
        System.out.println(birthdate.until(today, ChronoUnit.DAYS));

        System.out.printf("อายุ %d ปี %d เดือน %d วัน", birthdate.until(today).getYears(), birthdate.until(today).getMonths(), birthdate.until(today).getDays());
    }

}
