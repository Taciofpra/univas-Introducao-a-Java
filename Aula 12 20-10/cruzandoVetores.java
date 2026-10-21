public class cruzandoVetores{
    public static void main(String[] args) {
        String produtos[] = {"Arroz", "Feijão", "Óleo", "Sal"};
        int estoque[]= {15, 8, 20, 30};
        int i;

        System.out.println("Produtos com estoque baixo: ");
        for(i=0;i<estoque.length;i++){
            if(estoque[i]<10){
                System.out.println(produtos[i]+": ("+estoque[i]+" unidades)");
            }
        }
    }
}