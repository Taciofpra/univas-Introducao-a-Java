/* 7. Palavras Duplicadas (Lógica de um vetor):
Crie um vetor de String com palavras repetidas:
String[] palavras = {"Java", "C#", "Python", "Java", "PHP", "C#"};
Use laços aninhados (i e j) para comparar o vetor com ele mesmo e
imprimir quais palavras aparecem mais de uma vez.
Dica: Use .equals() para comparar e lembre-se de pular a verificação se i
== j. */
public class palavrasDuplicadas_7{
    public static void main(String[] args) {
        String[] palavras = {"Java", "C#", "Python", "Java", "PHP", "C#"};
        int i, j, k;
        int posRepetidas = 0;
        boolean jaVerificado;
        String[] repetidas = new String[palavras.length];

        System.out.println("Palavras repetidas: ");
        for(i=0;i<palavras.length;i++){
            jaVerificado = false;
            for(j=0;j<palavras.length;j++){
                if(palavras[i].equals(palavras[j]) && i != j){
                    for(k = 0; k<repetidas.length;k++){
                        if(palavras[i].equals(repetidas[k])){
                            jaVerificado = true;
                            k = repetidas.length;//para for k
                        }
                    }

                    if(!jaVerificado){
                        System.out.print(palavras[i]+" ");
                        repetidas[posRepetidas] = palavras[i];
                        posRepetidas++;
                    }
                }
            }
        }
    }
}