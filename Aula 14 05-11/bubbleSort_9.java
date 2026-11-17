/* Ordenação Simples (Bubble Sort): Crie um vetor de
inteiros desordenado:
• int[] dados = {5, 2, 8, 1, 4}; Use laços aninhados para comparar
cada elemento (i) com os elementos à sua frente (j = i + 1). Se
dados[i] for maior que dados[j], troque-os de lugar. Dica: Você
precisará de uma variável int aux para guardar o valor
temporariamente durante a troca. No final de todos os laços,
imprima o vetor dados (usando Arrays.toString() ou um for each)
para ver se ele está ordenado. */
import java.util.Arrays;

public class bubbleSort_9{
    public static void main(String[] args) {
        int dados[] = {5, 2, 8, 1, 4};
        int i, j;
        int aux_substituicao;

        for(i=0;i<dados.length;i++){
            for(j=i+1;j<dados.length;j++){
                if(dados[i] > dados[j]){
                    aux_substituicao = dados[j];
                    dados[j] = dados[i];
                    dados[i] = aux_substituicao;
                }
            }
        }

        System.out.print(Arrays.toString(dados));
    }
}