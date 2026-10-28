import java.util.Arrays;

public class mediana{
    public static void main(String[] args) {
        int numeros[] = {5, 2, 8, 1, 10, 4, 7};
        int tam;
        float mediana;

        Arrays.sort(numeros);
        
        tam = numeros.length;

        if(tam%2==0){
            mediana = (numeros[tam/2] + numeros[tam/2+1])/2;
        }else{
            mediana = numeros[tam/2];
        }

        System.out.println("Mediana = "+mediana);
    }
}