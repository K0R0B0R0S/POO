package heranca.um;

public class TestaArray{
    public static void main(String[] args){
        int[] array = new int[20];
        for(int i=0;i < array.length; i++){
            array[i] = i;
        }
        imprimeVetor(array);
        inverte(array);
        imprimeVetor(array);

    }

    public static void imprimeVetor(int[] a){
        for(int i: a){
            System.out.print(i + " ");
        }
    }
    public static void inverte(int[] a){
        for(int i=0;i < (a.length/2);i++){
            int aux = a[i];
            a[i] = a[a.length-i-1];
            a[a.length-i-1] = aux;
        }
    }
}