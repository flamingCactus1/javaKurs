public class Main {
    public static void main(String[] args) {
        int value = (int) Math.floor(Math.random() * 10);
        switch (value) {
            case 1 -> System.out.println("value is 1");
            case 2 -> System.out.println("value is 2");
            case 3, 4, 5 -> {
                System.out.println("value is 3, 4, or 5");
                System.out.println("value actually is " + value);
            }
            default -> {
                System.out.println("value is neither 1 or 2");
                System.out.println(value);
            }
        }
        String month = "Yo mama";
        System.out.println(month + " is a " + getSeason(month) + " month");
    }

    public static String getSeason(String month) {
        return switch (month) {
            case "January", "February", "December" -> "Winter";
            case "March", "April", "May" -> "Spring";
            case "June", "July", "August" -> "Summer";
            case "September", "October", "November" -> "Fall";
            default -> month + " is a bad data";
        };
    }
}
