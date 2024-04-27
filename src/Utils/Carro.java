package Utils;

public class Carro {
    private String model;
    private int anoFabricacao;
    private char cor;

    public Carro(int anoFabricacao, String model, char cor) {
        this.anoFabricacao = anoFabricacao;
        this.model = model;
        this.cor = cor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public char getCor() {
        return cor;
    }

    public void setCor(char cor) {
        this.cor = cor;
    }

    public void showCarInfo() {
        System.out.println(this.anoFabricacao + "-" + this.model + "-" + this.cor);
    }

    public boolean compareWith(Carro carro) {
        return  (this.anoFabricacao == carro.getAnoFabricacao() && this.model.equals(carro.getModel()) && this.cor == carro.getCor());
    }
}
