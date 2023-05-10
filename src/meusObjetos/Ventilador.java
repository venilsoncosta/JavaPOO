package meusObjetos;

public class Ventilador {
    private int velocidade;
    private String marca;
    private String cor;

    Ventilador(int velocidade, String marca, String cor){
        this.velocidade = velocidade;
        this.marca = marca;
        this.cor = cor;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }


}
