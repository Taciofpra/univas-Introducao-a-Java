/* Atribuição de Permissões: Crie dois vetores de String:
• String[] usuarios = {"Ana", "Bruno", "Carla"};
• String[] permissoes = {"Leitura", "Escrita"}; Use laços aninhados para imprimir todas as
atribuições de permissão para cada usuário. A saída deve ser:
Ana : Leitura
Ana : Escrita
Bruno : Leitura
Bruno : Escrita */

public class autorizacaoDePermissoes_2{
    public static void main(String[] args) {
        String usuarios[] = {"Ana", "Bruno", "Carla"};
        String permissoes[] = {"Leitura", "Escrita"};
        int i, j;

        for(i=0;i<usuarios.length;i++){
            for(j=0;j<permissoes.length;j++){
                System.out.println(usuarios[i]+" : "+permissoes[j]);
            }
        }
        
    }
}