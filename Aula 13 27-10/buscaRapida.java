import java.util.Arrays;
import java.util.Scanner;

public class buscaRapida{
    public static void main(String[] args) {
        int numeros[] = {90, 10, 70, 50, 30, 80};
        int indice;
        int key;

        Arrays.sort(numeros);


        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero para buscar no vetor: ");
        key = input.nextInt();

        indice = Arrays.binarySearch(numeros, key);
        if(indice >= 0){
            System.out.println("Valor localizado na posição: "+indice);
        }else{
            System.out.println("Valor localizado posição retornada: "+indice);
        }

        System.out.print("Digite um numero para a segunda busca no vetor: ");
        key = input.nextInt();
        input.close();
        
        indice = Arrays.binarySearch(numeros, key);
        if(indice >= 0){
            System.out.println("Valor localizado na posição: "+indice);
        }else{
            System.out.println("Valor localizado posição retornada: "+indice);
        }
    }
}