package questao.dois;
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;
import java.io.File;

public class Utilidades{
    public static Set<String> getPalavroes(){
        Set<String> retorno = new HashSet<String>();
        try {
            File myObj = new File("palavroes.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                retorno.add(data);
            }
            myReader.close();
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return retorno;
    }
}
