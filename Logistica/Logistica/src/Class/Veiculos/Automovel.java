package Class.Veiculos;


import Interfaces.AutomovelInterface;

public class Automovel implements AutomovelInterface {
    
    private String nome;
    private String tipo;
    private double combustivel;
    private double consumo;
    private String placa;

    public Automovel(String nome, String tipo, double combustivel, double consumo, String placa) {
        //validando campos
        if(nome == null || nome.isEmpty()){
            throw new RuntimeException("O nome nao pode ser vazio");
        }else{
            if(tipo == null || tipo.isEmpty()){
                throw new RuntimeException("O tipo nao pode ser vazio");
            }else{
                if(combustivel <= 0){
                     throw new RuntimeException("O combustivel nao pode ser menor ou igual a zero");
                }else{
                    if(consumo <= 0){
                         throw new RuntimeException("O consumo nao pode ser menor ou igual a zero");
                    }else{
                        if(placa == null || placa.isEmpty()){
                            throw new RuntimeException("A placa nao pode ser vazia");
                        }
                    }
                }
            }
        }
        this.nome = nome;
        this.tipo = tipo;
        this.combustivel = combustivel;
        this.consumo = consumo;
        this.placa = placa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public double getCombustivel() {
       return combustivel;
    }

    @Override
    public void setCombustivel(double combustivel) {
        this.combustivel = combustivel;
    }

    @Override
    public double getConsumo() {
       return consumo;
    }

    @Override
    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    @Override
    public String getPlaca() {
        return placa;
    }

    @Override
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public double calcularGastoCombustivel(double distancia, double valorCombustivel) {
        if(distancia <= 0){
            throw new RuntimeException("A distancia nao pode ser menor ou igual a zero");
        }else{
            if(valorCombustivel <= 0){
                throw new RuntimeException("O valor do combustivel nao pode ser menor ou igual a zero");
            }
        }
        double gasto = (distancia / consumo) * valorCombustivel;
        return gasto;
    }
    
    //O método validarPlaca recebe como entrada uma String placa.
    public boolean validarPlaca(String placa) {
    //Verifica se a placa é nula ou não tem 7 caracteres. Se sim, retorna false.
    if (placa == null || placa.length() != 7) {
        return false;
    }
    //Separa as três primeiras letras
    String letras = placa.substring(0, 3);
    
    //Separa os quatro números da placa
    String numeros = placa.substring(3);
    
    //Verifica se as três primeiras letras são todas maiúsculas. Se não, retorna false.
    for (int i = 0; i < 3; i++) {
        char letra = letras.charAt(i);
        if (!Character.isUpperCase(letra)) {
            return false;
        }
    }
    
    //Verifica se os quatro números são realmente números. Se não, retorna false.
    for (int i = 0; i < 4; i++) {
        char numero = numeros.charAt(i);
        if (!Character.isDigit(numero)) {
            return false;
        }
    }
    
    //Se chegou até aqui, a placa é válida e o método retorna true.
    return true;
}

}
