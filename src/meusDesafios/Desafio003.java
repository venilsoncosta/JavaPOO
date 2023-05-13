package meusDesafios;

import java.util.Scanner;

public class Desafio003 {
    public static void main(String[] args) {
        Scanner cpf = new Scanner(System.in);
        String validaCPF = cpf.next();
        if (validaCPF.length() < 11){
            System.out.println("CPF inválido");
        } else if (validaCPF.length() == 11) {
            System.out.println("CPF válido");
        }
        else {
            System.out.println("CPF inválido");
        }
    }
}
