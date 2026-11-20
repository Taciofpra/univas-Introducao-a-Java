/* 4. Filtro de Nomes:
Crie dois vetores de String:
String[] nomes = {"Ana", "Antonio", "Beatriz", "Carlos"};
String[] letras = {"A", "B"};
Use laços aninhados para verificar e imprimir quais nomes começam com
quais letras. (Dica: use o método String.startsWith()).
(Saída esperada: "Ana começa com A", "Antonio começa com A", "Beatriz
começa com B") */

public class filtroDeNomes_4{
    public static void main(String[] args) {
        String[] nomes = {"Ana", "Antonio", "Beatriz", "Carlos"};
        String[] letras = {"A", "B"};
        int i, j;

        for(i=0;i<nomes.length;i++){
            for(j=0;j<letras.length;j++){
                if(nomes[i].startsWith(letras[j])){
                    System.out.print("\""+nomes[i]+" começa com "+letras[j]+"\", ");
                }
            }
        }
    }
}