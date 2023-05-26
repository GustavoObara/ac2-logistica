package Class.Veiculos;


public class Moto extends Automovel {
    private int cilindradas;

    public Moto(String nome, String tipo, double combustivel, double consumo, String placa, int cilindradas) {
        super(nome, tipo, combustivel, consumo, placa);
        //validacao de campos
        if(cilindradas <=0 ){
            throw new RuntimeException ("Cilindradas invalida, nao pode ser igual ou menor que zero");
        }
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
    
    
}
