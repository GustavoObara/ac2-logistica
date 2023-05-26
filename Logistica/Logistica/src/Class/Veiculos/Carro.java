package Class.Veiculos;


public class Carro extends Automovel {
    private int qtd_portas;

    public Carro(String nome, String tipo, double combustivel, double consumo, String placa, int qtd_portas) {
        super(nome, tipo, combustivel, consumo, placa);
        //validando campo
        if(qtd_portas < 2){
            throw new RuntimeException("Quantidade de portas invalidas, nao pode ser menor que dois");
        }
        this.qtd_portas = qtd_portas;
    }

    public int getQtd_portas() {
        return qtd_portas;
    }

    public void setQtd_portas(int qtd_portas) {
        this.qtd_portas = qtd_portas;
    }
    
    
    
}
