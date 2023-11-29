package questao.um;
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;
import java.io.File;

public class LerArquivo{
    public static Set<String> retornaString(){
        Set<String> retorno = new HashSet<String>();
        try {
            File myObj = new File("C:\\Users\\Jose\\Desktop\\BCC\\POO\\Provas Antigas\\2022_P2_01\\2022_P2_01\\src\\questao\\um\\corposCelestes.txt");
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