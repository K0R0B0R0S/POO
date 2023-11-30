package questao.tres;

public class Inverte {

    public static void main(String[] args) {
        String x = "abcdefghijk";
        System.out.println(inverteStringString(x));
        System.out.println(inverStringCharArray(x));
    }

    //Uma maneira de resolver
    public static String inverteStringString(String a) {
        String reversedString = "";

        for (int i = a.length() - 1; i >= 0; i--) {
            reversedString += a.charAt(i);
        }
        return reversedString;
    }

    //Outra maneira de resolver
    public static String inverStringCharArray(String a) {
        char[] str = a.toCharArray();
        for (int i = 0; i < str.length / 2; i++) {
            char aux = str[i];
            str[i] = str[str.length - i - 1];
            str[str.length - i - 1] = aux;
        }
        String returnString = "";
        for (char c: str){
            returnString += c;
        }
        return returnString;
    }
}