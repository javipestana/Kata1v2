package kata1v2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kata1v2 {

    public static void main(String[] args) {
        Calendar date;
        date = GregorianCalendar.getInstance();
        date.set(1988,1,21);
        
        Person person = new Person("Javi", date);
        System.out.println(person.getName()+" tiene "+person.getAge()+" años ");
    }
    
}
