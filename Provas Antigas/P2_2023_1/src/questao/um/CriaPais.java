package questao.um;

import java.util.List;
import java.util.ArrayList;

public class CriaPais {
    public static List<Pais> retornaPais(){
        Pais x = new Pais("USA", "Estados Unidos", 5000.0);
        Pais y = new Pais("CND", "Canada", 6000.0);
        Pais z = new Pais("MXC", "Mexico", 2000.0);
        y.addPaisFronteira(x);
        x.addPaisFronteira(y);
        x.addPaisFronteira(z);
        z.addPaisFronteira(x);
        x.setPopulacao(10000);
        y.setPopulacao(20000);
        z.setPopulacao(30000);

        ArrayList<Pais> paises = new ArrayList<Pais>();
        paises.add(x);
        paises.add(y);
        paises.add(z);

        return paises;
    }

    public static List<Pais> retornaPais(String[] paises) throws FormatoIncorretoException{
        ArrayList<Pais> listaPaises = new ArrayList<Pais>();
        for (String pais: paises){
            String[] splitedPais = pais.split("#");

            int qnt = pais.length() - pais.replace("#", "").length();
            if (qnt != 3){
                throw new FormatoIncorretoException(qnt, pais);
            }

            Pais x = new Pais(splitedPais[0], splitedPais[1], Double.parseDouble(splitedPais[2]));
            x.setPopulacao(Integer.parseInt(splitedPais[3]));
            listaPaises.add(x);
        }
        return listaPaises;
    }
}
