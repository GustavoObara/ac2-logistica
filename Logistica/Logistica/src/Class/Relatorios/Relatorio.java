package Class.Relatorios;

import Class.Funcionarios.Condutor;
import Class.Veiculos.Automovel;
import Class.Viagens.Viagem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Relatorio {
    private List<Condutor> condutores;
    private List<Automovel> automoveis;
    private List<Viagem> viagens;
    
    public Relatorio(){
        condutores = new ArrayList<>();
        automoveis = new ArrayList<>();
        viagens = new ArrayList<>();
    }
    
    //são utilizados para adicionar os objetos às listas.
    public void adicionarCondutor(Condutor condutor){
        condutores.add(condutor);
    }
    
    //são utilizados para adicionar os objetos às listas.
    public void adicionarAutomovel(Automovel automovel){
        automoveis.add(automovel);
    }
    
    //são utilizados para adicionar os objetos às listas.
    public void adicionarViagem(Viagem viagem){
        viagens.add(viagem);
    }
    
    //O método imprimeCondutores() imprime todos os condutores ordenados por CPF.
    public void imprimeCondutores(){
         Collections.sort(condutores, Comparator.comparing(Condutor::getCpf));
         
         System.out.println("\nCondutores");
         
         for(Condutor condutor : condutores){
            System.out.println("Nome: " + condutor.getNome());
            System.out.println("CPF: " + condutor.getCpf());
            System.out.println("Data de Nascimento: " + condutor.getData_nascimento());
            System.out.println("Salario: R$" + condutor.getSalario());
            System.out.println("--------------------");
         }
    }
    
    //O método imprimeVeiculos() imprime todos os veículos de todos os tipos (moto, carro, caminhão) ordenados por nome. 
    public void imprimeVeiculos() {
        Collections.sort(automoveis, Comparator.comparing(Automovel::getPlaca));

        System.out.println("Veiculos:");

        for (Automovel automovel : automoveis) {
            System.out.println("Tipo: " + automovel.getClass().getSimpleName());
            System.out.println("Placa: " + automovel.getPlaca());
            System.out.println("Combustivel: " + automovel.getCombustivel());
            System.out.println("Consumo: " + automovel.getConsumo());
            System.out.println("--------------------");
        }
    }
    
    //O método imprimeViagens() imprime todas as viagens ordenadas pelo custo.
    public void imprimeViagens() {
        Collections.sort(viagens, Comparator.comparing(Viagem::custo));

        System.out.println("Viagens:");

        for (Viagem viagem : viagens) {
            System.out.println("Custo: R$" + viagem.custo());
            System.out.println("Veiculo: " + viagem.getAutomovel().getClass().getSimpleName());
            System.out.println("Condutor: " + viagem.getCondutor().getNome());
            System.out.println("--------------------");
        }
    }
}
