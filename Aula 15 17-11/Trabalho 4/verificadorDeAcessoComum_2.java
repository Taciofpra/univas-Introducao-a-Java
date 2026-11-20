/* Verificador de Acesso Comum:
Crie dois vetores de int representando crachás que acessaram dois setores
diferentes:
int[] acessoSetorA = {101, 102, 105, 108};
int[] acessoSetorB = {105, 101, 109, 110};
Use laços aninhados para encontrar e imprimir quais crachás (int) estão
presentes em ambas as listas. */

public class verificadorDeAcessoComum_2{
    public static void main(String[] args) {
        int[] acessoSetorA = {101, 102, 105, 108};
        int[] acessoSetorB = {105, 101, 109, 110};
        int i, j;

        System.out.print("Crachás repetidos: ");
        for(i=0;i<acessoSetorA.length;i++){
            for(j=0;j<acessoSetorB.length;j++){
                if(acessoSetorA[i] == acessoSetorB[j]){
                    System.out.print(acessoSetorA[i]+" ");
                }
            }
        }
    }
}