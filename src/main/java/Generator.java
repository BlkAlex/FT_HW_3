import javax.print.attribute.DateTimeSyntax;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.*;

public class Generator {
    public static int getRandomNumeric(int startRange){
        return getRandomNumeric(startRange,Integer.MAX_VALUE);
    }
    public static int getRandomNumeric(int startRange,int endRange){
        Random rnd = new Random(System.currentTimeMillis());
        return startRange + rnd.nextInt(endRange - startRange + 1);
    }
    public static String getRandomStringFromList(ArrayList<String> inputList){
        return inputList.get(0);
    }
    public static LocalDate getRandomDate(){
        Calendar calendar = new GregorianCalendar();
        //ZonedDateTime zdt = ZonedDateTime.of(getRandomNumeric(1,Calendar.getInstance().get(Calendar.YEAR)),getRandomNumeric(0,11),getRandomNumeric(0,30),0,0,0,0, ZoneId.of("Europe/Moscow"));
        calendar.set(getRandomNumeric(1,Calendar.getInstance().get(Calendar.YEAR)),getRandomNumeric(0,11),getRandomNumeric(0,30));
        return  calendar.getTime().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

    }
    public static int getAgeByDate(LocalDate date){
        Period period = Period.between ( date,LocalDate.now() );
        return period.getYears ();
    }
    public static String getRandomINN(){
        return "";
    }
    public static SEX getRandomSex(){
        return SEX.MALE;
    }
    public static String getRandomNumberHouse(){
        return "";
    }
}
