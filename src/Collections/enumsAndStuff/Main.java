package Collections.enumsAndStuff;

import java.io.FilterOutputStream;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        DayOfTheWeek weekDay = DayOfTheWeek.MONDAY;
        DayOfTheWeek randomWeekDay;
        System.out.println(weekDay);

        System.out.printf("Name is %s, Original Value = %d%n",
                weekDay.name(), weekDay.ordinal());
        for (int i = 0; i < 10; i++) {
            randomWeekDay = getRandomDay();
//            System.out.printf("Name is %s, Original Value = %d%n",
//                    randomWeekDay.name(), randomWeekDay.ordinal());
//            if (randomWeekDay == DayOfTheWeek.FRIDAY) {
//                System.out.println("Found a friday!");
//            }
            switchDayOfTheWeek(randomWeekDay);
        }

        for (Topping topping : Topping.values()) {
            System.out.println("Topping: " + topping.getNameNormalCase() + ", Price: " + topping.getPrice());
        }

    }

    public static DayOfTheWeek getRandomDay() {
        int randomInt = new Random().nextInt(7);
        var allDays = DayOfTheWeek.values();
        return allDays[randomInt];
    }

    public static void switchDayOfTheWeek(DayOfTheWeek dayOfTheWeek) {
        int weekDayAsInteger = dayOfTheWeek.ordinal() + 1;
        switch (dayOfTheWeek){
            case WEDNESDAY -> System.out.println("Wednesday is Day " +  weekDayAsInteger);
            case SATURDAY -> System.out.println("Saturday is Day " +  weekDayAsInteger);
            default -> System.out.println(dayOfTheWeek.name().charAt(0) +
                    dayOfTheWeek.name().substring(1).toLowerCase() +
                    " is  Day " + weekDayAsInteger);
        }
    }
}
