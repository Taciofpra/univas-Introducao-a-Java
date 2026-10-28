public class inverteVetor{
    public static void main(String[] args) {
        int numeros[] = {10, 20, 30, 40, 50};  
        int temp;
        int i, j;

        j = numeros.length - 1;
        
        for(i=0;i<(numeros.length-1)/2;i++){
                temp = numeros[i];
                numeros[i]=numeros[j];
                numeros[j] = temp;
                j--;
        }
        
        for(int numero:numeros){
            System.out.print(numero+" ");
        }


    }
}