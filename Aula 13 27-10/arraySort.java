import java.util.Arrays;

public class arraySort{
    public static void main(String[] args) {
        String nomes[] = {"Mateus", "Gabriel", "Vinicius", "Tácio", "João"};

        Arrays.sort(nomes);

        for(String nome: nomes){
            System.out.print(nome+" ");
        }

    }
}