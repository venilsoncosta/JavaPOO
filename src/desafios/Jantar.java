package desafios;

public class Jantar {
    public static void main(String[] args) {
        Comida c1 = new Comida("macarrão", 0.8);
        Comida c2 = new Comida("Arroz", 0.7);

        Pessoa louise = new Pessoa("Louise",  53.0);
        System.out.println(louise.apresentar());
        louise.comer(c1);
        louise.comer(c2);
        System.out.println(louise.apresentar());

    }
}
