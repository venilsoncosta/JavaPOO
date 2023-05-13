package meusDesafios;

public class Desafio002 {
    public static void main(String[] args) {
        int numero = 7;
        int fatorial = 1;
        for (int i = 1; i < numero; i++) {
            fatorial = fatorial * i;
        }
        System.out.println(fatorial);
    }
}
