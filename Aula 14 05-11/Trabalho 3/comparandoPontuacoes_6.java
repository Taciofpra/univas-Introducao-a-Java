

/* Comparação de Pontuações: Crie dois vetores de double
representando pontuações:
• double[] timeA = {8.5, 9.0, 7.0};
• double[] timeB = {7.5, 8.8, 9.5}; Use laços aninhados para comparar
cada pontuação do timeA com todas as pontuações do timeB. Imprima
uma mensagem sempre que uma pontuação de A for maior que uma
de B. (Saída esperada: "A (8.5) > B (7.5)", "A (9.0) > B (7.5)", "A (9.0) > B
(8.8)") */


public class comparandoPontuacoes_6{
    public static void main(String[] args) {
        double timeA[] = {8.5, 9.0, 7.0};
        double timeB[] = {7.5, 8.8, 9.5};
        int i, j;

        for(i=0;i<timeA.length;i++){
            for(j=0;j<timeB.length;j++){
                if(timeA[i]>timeB[j]){
                    System.out.println("A ("+timeA[i]+") > B ("+timeB[j]+")");
                }
            }
        }
    }
}