package classe;

public class DataTeste {
    public static void main(String[] args) {
        Data meuNiver = new Data();
        meuNiver.dia = 7;
        meuNiver.mes = 8;
        meuNiver.ano = 1991;

        System.out.println(meuNiver.obterDataFormatada());

        System.out.println("Venilson nasceu no dia " + meuNiver.dia + " de agosto de " + meuNiver.ano);
    }
}
