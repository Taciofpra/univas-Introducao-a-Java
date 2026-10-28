
public class modificandoValores{
    public static void main(String[] args) {
        int numeros[] =  {1, 2, 3, 4, 5};

        for(int i = 0; i<numeros.length;i++){
            numeros[i] *= 2;
        }
        for(int numero:numeros){
            System.out.println(numero);
        }
    }   
}