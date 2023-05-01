package classe;

public class Produto {
    String nome;
    double preco;
    double desconto;

    double precoComDesconto(){
        return preco * (1 - desconto);
    }
    double precoComDescontoGerente(){
        return preco * (1 - desconto + 0.06);
    }
}

