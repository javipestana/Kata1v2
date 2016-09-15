package kata1v2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {

    private final String name;
    private final Calendar birthday;
    private static final long MILLISECONDS_PER_YEAR = (long) (1000 * 60 * 60 * 24 * 365.25);

    public String getName() {
        return name;
    }

    public Calendar getBirthday() {
        return birthday;
    }

    public Person(String name, Calendar Birthday) {
        this.name = name;
        this.birthday = Birthday;
    }

    public int getAge() {
        Calendar today;
        today = GregorianCalendar.getInstance();
        return (int) (milliSecondsToYear(today.getTimeInMillis() - birthday.getTimeInMillis()));
    }
    
    private long milliSecondsToYear(long milles){
        return milles/MILLISECONDS_PER_YEAR;
    }
}
