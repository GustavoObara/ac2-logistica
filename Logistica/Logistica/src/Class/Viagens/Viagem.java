package Class.Viagens;


import Class.Funcionarios.Condutor;
import Class.Veiculos.Automovel;

public class Viagem {
    private Automovel automovel;
    private Condutor condutor;
    private double distancia;
    private double valorCombustivel;
    private double valorDiariaCondutor;

    public Viagem(Automovel automovel, Condutor condutor, double distancia, double valorCombustivel, double valorDiariaCondutor) {
        //validando campos
        if(distancia <=0){
            throw new RuntimeException("A distancia nao pode ser menor ou igual a zero");
        }else{
            if(valorCombustivel <= 0){
                throw new RuntimeException("O valor do combustivel nao pode ser menor ou igual a zero");
            }else{
                if(valorDiariaCondutor <= 0){
                    throw new RuntimeException("O valor da diaria do condutor nao pode ser menor ou igual a zero");
                }
            }
        }
        
        this.automovel = automovel;
        this.condutor = condutor;
        this.distancia = distancia;
        this.valorCombustivel = valorCombustivel;
        this.valorDiariaCondutor = valorDiariaCondutor;
    }
    
    // Método para calcular o custo total da viagem
    /*A classe Viagem possui um construtor que recebe um objeto Veiculo, um objeto Condutor, a distância da viagem, o valor do combustível e o valor da diária do condutor. 
    O método custo() calcula o custo total da viagem, considerando o gasto com combustível e as diárias do condutor. 
    O cálculo do custo das diárias é feito dividindo a distância total da viagem por 700 (limite de quilômetros por dia) e arredondando para cima usando Math.ceil().
    */
    public double custo() {
        double custoCombustivel = automovel.calcularGastoCombustivel(distancia, valorCombustivel);
        double custoDiariaCondutor = Math.ceil(distancia / 700) * valorDiariaCondutor;
        return custoCombustivel + custoDiariaCondutor;
    }

    public Automovel getAutomovel() {
        return automovel;
    }

    public void setAutomovel(Automovel automovel) {
        this.automovel = automovel;
    }

    public Condutor getCondutor() {
        return condutor;
    }

    public void setCondutor(Condutor condutor) {
        this.condutor = condutor;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getValorCombustivel() {
        return valorCombustivel;
    }

    public void setValorCombustivel(double valorCombustivel) {
        this.valorCombustivel = valorCombustivel;
    }

    public double getValorDiariaCondutor() {
        return valorDiariaCondutor;
    }

    public void setValorDiariaCondutor(double valorDiariaCondutor) {
        this.valorDiariaCondutor = valorDiariaCondutor;
    }
    
    

}
