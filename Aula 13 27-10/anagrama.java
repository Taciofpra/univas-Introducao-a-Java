import java.util.Arrays;

public class anagrama{
    public static void main(String[] args) {
        String palavra1 = "roma";
        String palavra2 = "amor";
        char letras1[] = new char[20];
        char letras2[] = new char[20];
        int anagrama = 1;
        letras1 = palavra1.toCharArray();
        letras2 = palavra1.toCharArray();

        Arrays.sort(letras1);
        Arrays.sort(letras2);

        for(int i=0;i<letras1.length;i++)
            if(letras2[i]!=letras2[i]){
                anagrama = 0;
            }
        
        if(anagrama == 0){
            System.out.println("Não é um anagrama");
        }else{
            System.out.println("É um anagrama!");
        }
    }
}