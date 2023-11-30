package questao.um;

import java.util.List;
import java.util.ArrayList;

public class Utils{
    public static boolean existe(List x, Biscoito y){
        if (x instanceof ArrayList){
            return x.contains(y);
        }
        return false;
    }
}