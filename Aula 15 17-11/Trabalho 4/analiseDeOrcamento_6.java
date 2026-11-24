/* 6. Análise de Custo/Orçamento:
Crie dois vetores de double:
double[] orcamentos = {1000.00, 1500.00};
double[] custosProjetos = {950.00, 1200.00, 1600.00};
Use laços aninhados para comparar cada custo com cada orçamento.
Imprima uma mensagem sempre que um custo de projeto for menor ou
igual a um orçamento.
(Saída esperada: "Custo 950.00 cabe no orçamento 1000.00", "Custo 950.00
cabe no orçamento 1500.00", etc.) */

public class analiseDeOrcamento_6{
    public static void main(String[] args) {
        double[] orcamentos = {1000.00, 1500.00};
        double[] custosProjetos = {950.00, 1200.00, 1600.00};
        int i, j;

        for(i=0;i<orcamentos.length;i++){
            for(j=0;j<custosProjetos.length;j++){
                if(custosProjetos[j]<orcamentos[i]){
                    System.out.println("\"Custo de "+custosProjetos[j]+" cabe no orçamento de "+orcamentos[i]+"\", ");
                }
            }
        }
    }
}