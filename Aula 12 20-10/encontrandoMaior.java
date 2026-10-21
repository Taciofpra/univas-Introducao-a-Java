public class encontrandoMaior{
    public static void main(String[] args) {
        int numeros[] = {25, 14, 88, 41, 37};
        int i;
        int maior;

        maior = numeros[0];

        for(i=0;i<numeros.length;i++){
            if(maior < numeros[i]){
                maior = numeros[i];
            }
        }

        System.out.println("Maior numero do vetor: "+maior);
    }
}