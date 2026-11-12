/* Clientes Especiais (Strings): Crie dois vetores de String:
• String[] clientesVIP = {"Maria", "Jose", "Paulo", "Ana"};
• String[] clientesDevedores = {"Ana", "Luis", "Jose", "Marta"}; Use
laços aninhados para encontrar e imprimir o nome de quem está
em ambas as listas (são VIPs, mas também estão devendo).
Lembre-se de usar .equals() para comparar Strings. */

public class clientesEspeciais_4{
    public static void main(String[] args) {
        String clientesVIP[] = {"Maria", "Jose", "Paulo", "Ana"};
        String clientesDevedores[] = {"Ana", "Luis", "Jose", "Marta"};
        int i, j;
        
        for(i=0;i<clientesVIP.length;i++){
            for(j=0;j<clientesDevedores.length;j++){
                if(clientesVIP[i].equals(clientesDevedores[j])){
                    System.out.print(clientesVIP[i]+" ");
                }
            }
        }
    }
}