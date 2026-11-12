/*Multiplicador de Vetores: Crie dois vetores de inteiros:
• int[] vetorA = {2, 5};
• int[] vetorB = {10, 20, 30}; Use laços aninhados para multiplicar cada elemento do vetorA
por cada elemento do vetorB. A saída deve ser:
2 * 10 = 20
2 * 20 = 40
2 * 30 = 60
5 * 10 = 50
5 * 20 = 100
5 * 30 = 150*/

public class multiplicadorDeVetores_1{
    public static void main(String[] args) {
        int vetorA[] = {2, 5}; 
        int vetorB[] = {10, 20, 30};
        int i, j;

        for(i = 0; i < vetorA.length ; i++){
            for(j = 0; j<vetorB.length ; j++){
                System.out.println(vetorA[i]+" * "+vetorB[j]+" = "+ vetorA[i] * vetorB[j]);
            }
        }
    }
}