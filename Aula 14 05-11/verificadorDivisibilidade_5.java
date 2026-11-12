/* 5. Verificador de Divisibilidade: Crie dois vetores de inteiros:
• int[] numeros = {10, 15, 20, 25};
• int[] divisores = {2, 5}; Use laços aninhados para testar cada número
contra cada divisor. Imprima uma mensagem apenas se o número for
divisível pelo divisor. (Use o operador % (módulo)). (Saída esperada:
"10 é divisível por 2", "10 é divisível por 5", "15 é divisível por 5", etc.) */

public class verificadorDivisibilidade_5{
    public static void main(String[] args) {
        int numeros[] = {10, 15, 20, 25};
        int divisores[] = {2, 5};
        int i, j;

        for(i=0;i< numeros.length;i++){
            for(j=0;j< divisores.length;j++){
                if(numeros[i] % divisores[j] == 0){
                    System.out.println(numeros[i] + " é divisivel por " + divisores[j]);
                }
            }
        }
    }
}