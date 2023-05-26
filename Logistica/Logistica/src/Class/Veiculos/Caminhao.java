package Class.Veiculos;


public class Caminhao extends Automovel {
    private int qtd_eixos;

    public Caminhao(String nome, String tipo, double combustivel, double consumo, String placa, int qtd_eixos) {
        super(nome, tipo, combustivel, consumo, placa);
        //validando campo
        if(qtd_eixos <=0){
            throw new RuntimeException ("Quantidade de eixos invalida, nao pode ser igual ou menor que zero");
        }  
        this.qtd_eixos = qtd_eixos;
    }

    public int getQtd_eixos() {
        return qtd_eixos;
    }

    public void setQtd_eixos(int qtd_eixos) {
        this.qtd_eixos = qtd_eixos;
    }
    
    
}
