/* 8. Verificador de Pedido (Lógica com "Contador"):
Crie dois vetores de int:
int[] estoque = {10, 20, 30, 40, 50};
int[] pedido = {20, 40, 10};
O desafio é verificar se TODOS os itens do pedido existem no estoque.
Dica: Você precisará de uma variável int itensEncontrados = 0; antes dos
laços. Dentro do laço interno (if de comparação), incremente o contador.
No final de todos os laços, verifique se itensEncontrados == pedido.length.
Imprima "Pedido pode ser atendido" ou "Pedido não pode ser atendido". */

public class verificadorDePedido_8{
    public static void main(String[] args){
        int[] estoque = {10, 20, 30, 40, 50};
        int[] pedido = {20, 40, 10};
        int i, j;
        int itensLocalizados = 0;

        for(i=0;i<pedido.length;i++){
            for(j=0;j<estoque.length;j++){
                if(pedido[i] == estoque[j]){
                    itensLocalizados++;
                    j = estoque.length; //parar o for j
                }
            }
        }

        if(itensLocalizados == pedido.length){
            System.out.println("Pedido pode ser atendido");
        }else{
            System.out.println("Pedido não pode ser atendido");
        }
    }
}