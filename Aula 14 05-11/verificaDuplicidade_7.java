/* 7. Verificador de Duplicatas (Lógica de um vetor): Crie um vetor
de inteiros com números repetidos:
• int[] numeros = {10, 5, 40, 5, 22, 10}; Use laços aninhados (i e j) para
comparar o vetor com ele mesmo. O objetivo é imprimir quais números
aparecem mais de uma vez. Dica: Você deve pular a verificação se i ==
j, pois um número sempre será igual a ele mesmo */

public class verificaDuplicidade_7{
    public static void main(String[] args){
        int numeros[] = {10, 5, 40, 5, 22, 10, 5, 33, 4, 44, 44, 33};
        int[] repetidos = new int[numeros.length];
        int aux = 0;
        int i, j, k;
        boolean achou = false;

        for(i=0;i<repetidos.length;i++){
            repetidos[i] = 0;
        }

        for(i=0;i<numeros.length;i++){
            achou = false;
            for(j=0;j<numeros.length;j++){
                if(numeros[i] == numeros[j] && i != j){
                    for(k=0;k<repetidos.length;k++){
                        if(repetidos[k] == numeros[j]){
                            achou = true;
                            break;
                        }
                    }
                    if(!achou){
                        System.out.print(numeros[j]+" ");
                        repetidos[aux] = numeros[j];
                        aux++;
                    }
                              
                }
            }
        }
    }
}