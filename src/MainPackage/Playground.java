package MainPackage;

public class Playground {

    public static void main(String[] args) {
        String string = "compute_camel-Case";
        System.out.println(computeResult(string));
        System.out.println(computeResult("_"));
    }



    public static String computeResult(String string){
        if(string.length() <= 1){
            if(string.equals("_") ||  string.equals("-")){
                return "";
            }else {
                return string;
            }
        }else {
            if(string.charAt(0) == '_' ||  string.charAt(0)=='-'){
                return string.substring(1,2).toUpperCase() + computeResult(string.substring(2));
            }else return string.substring(0,1) +  computeResult(string.substring(1));
        }
    }
}
