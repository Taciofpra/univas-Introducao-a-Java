

public class encontrandoPares{
    public static void main(String args){
        int numeros[] = {3, 45, 3, 24, 67, 54, 33, 65, 76, 32, 81, 97, 12};
        int cont = 0;
        int i;

        for(i=0; i<numeros.length ;i++){
            if(numeros[i]%2 == 0){
                cont++;
            }
        }
        System.out.println("Total de pares no vetor: "+cont);
    }
}