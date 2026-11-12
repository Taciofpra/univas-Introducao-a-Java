/* Interseção de Listas (Números): Crie dois vetores de
inteiros com alguns números em comum:
• int[] lista1 = {10, 25, 30, 42};
• int[] lista2 = {15, 20, 25, 30, 50}; Use laços aninhados para
encontrar e imprimir apenas os números que existem em ambos
os vetores. (Saída esperada: 25 e 30). */

public class intersecaoDeLista_3{
    public static void main(String[] args) {
        int lista1[] = {10, 25, 30, 42};
        int lista2[] = {15, 20, 25, 30, 50};
        int i, j;

        for(i=0;i<lista1.length;i++){
            for(j=0;j<lista2.length;j++){
                if(lista1[i] == lista2[j]){
                    System.out.print(lista1[i]+" ");
                }
            }
        }
    }
}