public class Main {
    public static void main(String[] args) {
        int value = (int) Math.floor(Math.random()*10);
        switch (value) {
            case 1:
                System.out.println("value is 1");
                break;
            case 2:
                System.out.println("value is 2");
                break;
            case 3: case 4: case 5:
                System.out.println("value is 3, 4, or 5");
                System.out.println("value actually is " + value);
                break;
            default:
                System.out.println("value is neither 1 or 2");
                System.out.println(value);

        }
    }
}
