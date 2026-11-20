/* 3. Tabela de Jogos:
Crie dois vetores de String:
String[] times = {"Time A", "Time B", "Time C"};
String[] turnos = {"Turno 1", "Turno 2"};
Use laços aninhados para imprimir todos os jogos de cada time em cada
turno.
(Saída esperada: "Time A vs Turno 1", "Time A vs Turno 2", "Time B vs Turno
1", etc.) */

public class tabelaDeJogos_3{
    public static void main(String[] args) {
        String[] times = {"Time A", "Time B", "Time C"};
        String[] turnos = {"Turno 1", "Turno 2"};
        int i, j;

        for(i=0;i<times.length;i++){
            for(j=0;j<turnos.length;j++){
                System.out.print("\""+times[i]+" vs "+turnos[j]+"\", ");
            }
        }

    }
}