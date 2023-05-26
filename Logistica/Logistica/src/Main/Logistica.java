package Main;

import Class.Funcionarios.Condutor;
import Class.Veiculos.Caminhao;
import Class.Veiculos.Carro;
import Class.Financeiro.FolhaDePagamento;
import Class.Veiculos.Moto;
import Class.Relatorios.Relatorio;
import Class.Viagens.Viagem;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Logistica {

    
    public static void main(String[] args) {
        Carro carro = new Carro("Creta", "SUV", 50, 10, "ABC1234", 4 );
        //validando placa
        System.out.println("Validacao da placa: ");
        System.out.println(carro.validarPlaca("ABC1234"));
        
        //utilizando os metodos gets e sets da interface Automovel 
        //carro.setConsumo(10.0); // Define o consumo do carro como 10 km/l
        //carro.setCombustivel(50.0); // Define a quantidade de combustível como 50 litros
        //carro.setPlaca("ABC-1234"); // Define a placa do carro como "ABC-1234"
        
        double gastoCarro = carro.calcularGastoCombustivel(100, 7.5); //Calcula o gasto com combustível para percorrer 100 km com um valor de combustível de R$ 4.5 por litro
        System.out.println("Gasto com combustivel: R$" + gastoCarro);
        System.out.println("Combustivel no tanque: " + carro.getCombustivel() + " litros");
        System.out.println("Placa do carro: " + carro.getPlaca());
        
        
        Moto moto = new Moto("XJ6", "moto", 50, 10, "DEF5678", 250);
        //validando placa
        System.out.println("--------------------------");
        System.out.println("Validacao da placa: ");
        System.out.println(moto.validarPlaca("DEF5678"));
        
        double gastoMoto = moto.calcularGastoCombustivel(100.0, 5.30);
        System.out.println("Gasto com combustivel: R$" + gastoMoto);
        System.out.println("Combustivel no tanque: " + moto.getCombustivel() + " litros");
        System.out.println("Placa da moto: " + moto.getPlaca());
        
        
        Caminhao caminhao = new Caminhao("FH500", "Carreta", 100, 10, "DFA1234", 9);
        //validando placa
        System.out.println("--------------------------");
        System.out.println("Validacao da placa: ");
        System.out.println(moto.validarPlaca("DFA1234"));
        
        double gastoCaminhao = caminhao.calcularGastoCombustivel(200, 6.50);
        System.out.println("Gasto com combustivel: R$" + gastoCaminhao);
        System.out.println("Combustivel no tanque: " + caminhao.getCombustivel() + " litros");
        System.out.println("Placa do caminhao: " + caminhao.getPlaca());
        
        
        Condutor condutor = new Condutor("Joao", "322.897.488-03", LocalDate.of(2004, 5, 10), 2500.0);
        Viagem viagem = new Viagem(carro, condutor, 800.0, 4.5, 100.0);
        double custoTotal = viagem.custo();
        System.out.println("Custo total da viagem: R$" + custoTotal);
        
        
        Relatorio relatorio = new Relatorio();
        
        // Criando alguns condutores
        Condutor condutor1 = new Condutor("Guilherme", "322.897.488-05", LocalDate.of(2004, 1, 10), 2500.0);
        Condutor condutor2 = new Condutor("Gustavo", "652.099.708-09", LocalDate.of(2004, 1, 15), 2800.0);
        Condutor condutor3 = new Condutor("Luiz", "926.526.588-40", LocalDate.of(2005, 4, 6), 3000.0);
        
        //validando CPF
        System.out.println("-------------");
        System.out.println("Validando CPF do condutor: " + condutor1.getNome());
        System.out.println(condutor1.validarCPF(condutor1.getCpf()));
        //validando CPF
        System.out.println("-------------");
        System.out.println("Validando CPF do condutor: " + condutor2.getNome());
        System.out.println(condutor2.validarCPF(condutor2.getCpf()));
        //validando CPF
        System.out.println("-------------");
        System.out.println("Validando CPF do condutor: " + condutor3.getNome());
        System.out.println(condutor3.validarCPF(condutor3.getCpf()));
        
        // Adicionando condutores ao relatório
        relatorio.adicionarCondutor(condutor1);
        relatorio.adicionarCondutor(condutor2);
        relatorio.adicionarCondutor(condutor3);

        
        // Adicionando automoveis aos relatorios
        relatorio.adicionarAutomovel(carro);
        relatorio.adicionarAutomovel(moto);
        relatorio.adicionarAutomovel(caminhao);
        
        Viagem viagem1 = new Viagem(carro, condutor1, 800.0, 4.5, 100.0);
        Viagem viagem2 = new Viagem(moto, condutor2, 500.0, 3.0, 50.0);
        Viagem viagem3 = new Viagem(caminhao, condutor3, 1000.0, 6.0, 150.0);
        
        // Adicionando viagens ao relatório
        relatorio.adicionarViagem(viagem1);
        relatorio.adicionarViagem(viagem2);
        relatorio.adicionarViagem(viagem3);
        
        
        // Imprimindo os relatórios
        relatorio.imprimeCondutores();
        System.out.println("---------------------------------");
        relatorio.imprimeVeiculos();
        System.out.println("---------------------------------");
        relatorio.imprimeViagens();
        
        
        
        // Adicionando condutores a uma lista
        List<Condutor> condutores = new ArrayList<>();
        condutores.add(condutor1);
        condutores.add(condutor2);
        condutores.add(condutor3);
        
        // Criando a folha de pagamento
        FolhaDePagamento folhaDePagamento = new FolhaDePagamento(4,2005, condutores);
        
        // Imprimindo a folha de pagamento
        folhaDePagamento.imprimir();

    }
    
}
