import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        int idade = sc.nextInt();
        System.out.println(idade);
        System.out.println(nome.length());
        sc.close();
    }
}


