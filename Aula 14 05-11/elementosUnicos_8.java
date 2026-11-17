/* Elementos Únicos (Lógica com "Flag"): Crie dois vetores de
inteiros:
5. int[] vetorA = {1, 2, 3, 4, 5};
6. int[] vetorB = {2, 4, 6, 8}; O desafio é imprimir apenas os números do
vetorA que NÃO existem no vetorB. Dica: Você precisará de uma
variável boolean achou = false; dentro do laço externo, que muda para
true se você encontrar uma correspondência no laço interno. No final
do laço interno, você verifica if (!achou). */


public class elementosUnicos_8{
    public static void main(String[] args) {
        int vetorA[] = {1, 2, 3, 4, 5};
        int vetorB[] = {2, 4, 6, 8};
        boolean achou = false;
        int i, j;

        for(i=0;i< vetorA.length;i++){
            achou = false;
            for(j=0;j<vetorB.length;j++){
                if(vetorA[i] == vetorB[j]){
                    achou = true;
                    break;
                }
            }
            if(!achou){
                System.out.print(vetorA[i]+" ");
            }
        }
    }
}