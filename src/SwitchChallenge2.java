public class SwitchChallenge2 {
    public static void main(String[] args) {

        for(int i = 0; i <= 7; i++){
            printDayOfWeek(i);
            printWeekDay(i);
        }

    }

    public static void printDayOfWeek(int day){
        String result = switch(day){
            case 0 -> {yield "Sunday";}
            case 1 -> {yield "Monday";}
            case 2 -> {yield "Tuesday";}
            case 3 -> {yield "Wednesday";}
            case 4 -> {yield "Thursday";}
            case 5 -> {yield "Friday";}
            case 6 -> {yield "Saturday";}
            default -> {yield "Invalid data";}
        };
        System.out.println(day + " day of the week is " + result);
    }

    public static void printWeekDay(int day){
        String result;
        if(day == 0){
            result = "Sunday";
        } else if(day == 1){
            result = "Monday";
        } else if(day == 2){
            result = "Tuesday";
        }  else if(day == 3){
            result = "Wednesday";
        } else if(day == 4){
            result = "Thursday";
        } else if(day == 5){
            result = "Friday";
        }  else if(day == 6){
            result = "Saturday";
        }else {
            result = "Invalid data";
        }
        System.out.println(day + " day of the week is " + result);
    }
}
