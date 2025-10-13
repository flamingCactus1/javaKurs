public class SecondAndMinutesChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(16000));
    }

    public static String getDurationString(int seconds) {
        if (seconds >= 0) {
            return getDurationString(seconds % 60, seconds / 60);
        }
        return "Provide a valid duration";
    }

    public static String getDurationString(int seconds, int minutes) {
        int hours = minutes / 60;
        minutes = minutes % 60;
        if (seconds >= 0 && minutes <= 59 && minutes >= 0) {
            return hours + "h: " + minutes + "m: " + seconds + "s";
        }
        return "Provide a valid duration";
    }
}
