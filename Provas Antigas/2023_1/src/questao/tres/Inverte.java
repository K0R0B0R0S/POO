package questao.tres;

public class Inverte{

    public static void main(String[] args){
        String x = "abcdefghij";
        System.out.println(inverte(x));
    }

    public static String inverte(String a){
        String reversedString = "";

        for(int i = a.length() - 1; i >= 0 ; i--){
            reversedString += a.charAt(i);
        }
        return reversedString;
    }
}