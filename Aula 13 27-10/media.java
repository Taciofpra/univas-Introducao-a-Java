
public class media{
    public static void main(String[] args) {
        int numeros[] = {10, 20, 30, 40, 50};
        int soma = 0;
        float cont = 0;
        float media;

        for(int numero:numeros){
            soma += numero;
            cont++;
        }
        media = soma/cont;
        
        System.out.println("Media: "+media);

    }
}