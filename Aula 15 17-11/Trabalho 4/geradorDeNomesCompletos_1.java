/* Gerador de Nomes Completos:
Crie dois vetores de String:
String[] nomes = {"João", "Maria", "Carlos"};
String[] sobrenomes = {"Silva", "Santos"};
Use laços aninhados para imprimir todas as combinações de nomes
completos.
(Saída esperada: "João Silva", "João Santos", "Maria Silva", "Maria Santos",
etc.) */


public class geradorDeNomesCompletos_1{
    public static void main(String[] args) {
        String[] nomes = {"Joao", "Maria", "Carlos"};
        String[] sobrenomes = {"Silva", "Santos"};
        int i, j;

        for(i=0;i<nomes.length;i++){
            for(j=0;j<sobrenomes.length;j++){
                System.out.print("\""+nomes[i]+" "+sobrenomes[j]+"\", ");
            }
        }
    }
}