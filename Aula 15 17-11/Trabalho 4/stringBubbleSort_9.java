/* 9. Ordenação de Nomes (Bubble Sort com String):
• Crie um vetor de String desordenado:
• String[] nomes = {"Carla", "Ana", "Zeca", "Beto", "Maria"};
• Usando a mesma lógica do Exercício 9 da aula anterior (Bubble
Sort) , ordene este vetor alfabeticamente.
• Dica: Para comparar Strings, você não pode usar >. Use o método
nomes[i].compareTo(nomes[j]) > 0. Se esse método retornar um
número positivo, significa que nomes[i] vem depois de nomes[j]
alfabeticamente e eles precisam ser trocados (usando uma String
aux).
• No final, imprima o vetor ordenado (pode usar Arrays.toString()). */

import java.util.Arrays;

public  class stringBubbleSort_9{
    public static void main(String[] args) {
        String[] nomes = {"Carla", "Ana", "Zeca", "Beto", "Maria"};
        String aux_substituicao;
        int i, j;

        for(i=0;i<nomes.length;i++){
            for(j=i+1;j<nomes.length;j++){
                if(nomes[i].compareTo(nomes[j]) > 0){
                    aux_substituicao = nomes[j];
                    nomes[j] = nomes[i];
                    nomes[i] = aux_substituicao;
                }
            }
        }

        System.out.print(Arrays.toString(nomes));
    }
}