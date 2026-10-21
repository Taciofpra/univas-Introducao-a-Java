public class calculandoMedia{
    public static void main(String[] args) {
        double notasAluno[] = {8.5, 7.0, 9.5, 5.0};
        double media = 0;
        int i;

        for(i=0;i<notasAluno.length;i++){
            media += notasAluno[i];
        }
        media = media/notasAluno.length;

        System.out.println("Meia dos alunos: "+media);
    }
}