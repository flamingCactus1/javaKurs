public class switchChallenge {

    public static void main(String[] args) {

        spell("Hello World");

    }

    public static String sayByLetter(char letter) {
        return switch (letter){
            case 'a',  'A' -> "Able";
            case 'b',  'B' -> "Baker";
            case 'c',  'C' -> "Charlie";
            case 'd',  'D' -> "Dog";
            case 'e',  'E' -> "Easy";
            case 'f',  'F' -> "Fox";
            case 'g',  'G' -> "George";
            case 'h',  'H' -> "How";
            case 'i',  'I' -> "Item";
            case 'j',  'J' -> "Jig";
            case 'k',  'K' -> "King";
            case 'l',  'L' -> "Love";
            case 'm',  'M' -> "Mike";
            case 'n',  'N' -> "Nan";
            case 'o',  'O' -> "Oboe";
            case 'p',  'P' -> "Peter";
            case 'q',  'Q' -> "Queen";
            case 'r',  'R' -> "Roger";
            case 's',  'S' -> "Sugar";
            case 't',  'T' -> "Tare";
            case 'u',  'U' -> "Uncle";
            case 'v',  'V' -> "Victor";
            case 'w',  'W' -> "William";
            case 'x',  'X' -> "X-Ray";
            case 'y',  'Y' -> "Yoke";
            case 'z',  'Z' -> "Zebra";
            case ' ' -> " ";

            default -> "Unknown";
        };
    }

    public static String spell(String word){
        if(word.length() == 0){
            return "";
        }else {
            System.out.println(sayByLetter(word.charAt(0)));
            return spell(word.substring(1));
        }
    }
}
