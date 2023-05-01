package estruturaControle;

import java.util.Scanner;

public class if1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a media: ");
        double media = entrada.nextDouble();
        if (media <= 10 && media >= 7){
            System.out.println("aprovado");
            System.out.println("Parabéns!");
        }
        if (media < 7 && media >= 5){
            System.out.println("Recuperação");
        }



        entrada.close();
    }
}
