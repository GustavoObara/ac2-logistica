package Interfaces;


public interface AutomovelInterface {
    double calcularGastoCombustivel(double distancia, double valorCombustivel);
    
    public double getCombustivel();
    
    public void setCombustivel(double combustivel);
    
    public double getConsumo();
    
    public void setConsumo(double consumo);
    
    public String getPlaca();
    
    public void setPlaca(String placa);
    
    
}
