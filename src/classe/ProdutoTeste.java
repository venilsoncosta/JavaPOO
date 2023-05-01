package classe;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.nome = "Notebook";
        p1.preco = 2456;
        p1.desconto = 0.25;
        System.out.println(p1.nome);
        System.out.println(p1.precoComDesconto());
        double precoFinal = (p1.precoComDesconto() + p1.precoComDescontoGerente()) / 2;
        System.out.println(precoFinal);
    }
}
