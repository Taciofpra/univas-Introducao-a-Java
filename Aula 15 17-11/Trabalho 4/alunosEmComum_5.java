/* 5. Alunos em Comum:
Crie dois vetores de String com nomes de alunos em atividades
extracurriculares:
String[] matriculadosMusica = {"Ana", "Beto", "Caio", "Maria"};
String[] matriculadosEsporte = {"Davi", "Beto", "Maria", "Zeca"};
Use laços aninhados para encontrar e imprimir o nome de quem está em
ambas as atividades. (Lembre-se de usar .equals()). */

public class alunosEmComum_5{
    public static void main(String[] args) {
        String[] matriculadosMusica = {"Ana", "Beto", "Caio", "Maria"};
        String[] matriculadosEsporte = {"Davi", "Beto", "Maria", "Zeca"};
        int i, j;

        System.out.print("Matriculados em ambas as atividades: ");
        for(i=0;i<matriculadosMusica.length;i++){
            for(j=0;j<matriculadosEsporte.length;j++){
                if(matriculadosMusica[i].equals(matriculadosEsporte[j])){
                    System.out.print(matriculadosMusica[i]+" ");
                }
            }
        }
    }
}