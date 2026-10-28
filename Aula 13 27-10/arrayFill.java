import java.util.Arrays;

public class arrayFill{
    public static void main(String[] args) {
        double notas[] = new double[20];
        Arrays.fill(notas, 0.0);
        
        for(double nota: notas){
            System.out.println(nota);
        }
    }
}