/* 7. Verificador de Duplicatas (Lógica de um vetor): Crie um vetor
de inteiros com números repetidos:
• int[] numeros = {10, 5, 40, 5, 22, 10}; Use laços aninhados (i e j) para
comparar o vetor com ele mesmo. O objetivo é imprimir quais números
aparecem mais de uma vez. Dica: Você deve pular a verificação se i ==
j, pois um número sempre será igual a ele mesmo */

public class verificaDuplicidade{
    public static void main(String[] args){
        int numeros[] = {10, 5, 40, 5, 22, 10, 33, 33, 5};
        int i, j, k, l = 0;
        boolean repete = false;
        int duplicados[] = new int[numeros.length];

        for(i=0;i<numeros.length;i++){
            System.out.println(numeros[i]+" ");
            for(j=0;j<numeros.length;j++){
                
                if(numeros[i] == numeros[j] && i != j ){
                    for(k=0;k<duplicados.length;k++){
                        if(numeros[i] == duplicados[k]){
                            repete = true;
                        }
                    }
                    
                }
            }
            if(!repete){
                duplicados[l] = numeros[i];
                l++;
                repete = false;
            }
        }
        
        System.out.println("Numeros em duplicidade: ");
        for(i=0;i<=l;i++){
            System.out.print(duplicados[i]+" ");
        }
    }
}