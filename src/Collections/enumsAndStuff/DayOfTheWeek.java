package Collections.enumsAndStuff;

import java.util.Random;

public enum DayOfTheWeek{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

    public static DayOfTheWeek getRandomDay(){
        int randomInteger = new Random().nextInt(7);
        return DayOfTheWeek.values()[randomInteger];
    }
}
