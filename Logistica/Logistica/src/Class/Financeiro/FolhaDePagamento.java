package Class.Financeiro;

import Class.Funcionarios.Condutor;

import java.util.List;


public class FolhaDePagamento {
    private int mes;
    private int ano;
    private List<Condutor> condutores; //condutores é uma lista contendo todos os condutores a serem considerados na folha de pagamento

    public FolhaDePagamento(int mes, int ano, List<Condutor> condutores) {
        //validando campos
        if(mes <= 0){
            throw new RuntimeException("O mes nao pode ser menor ou igual a zero");
        }else{
            if(ano <= 0){
                throw new RuntimeException("O ano nao pode ser menor ou igual a zero");
            }
        }
        this.mes = mes;
        this.ano = ano;
        this.condutores = condutores;
    }
    //O método totalAPagar() percorre a lista de condutores e soma os salários de todos eles, retornando o valor total a ser pago.
    public double totalAPagar() {
        double total = 0.0;

        for (Condutor condutor : condutores) {
            total += condutor.getSalario();
        }
        return total;
    }
    /*O método imprimir() exibe na tela os nomes dos condutores e seus respectivos salários, bem como o total a pagar. 
    A folha de pagamento é apresentada com o formato "Folha de Pagamento - mês/ano"*/ 
    public void imprimir() {
        System.out.println("Folha de Pagamento - " + mes + "/" + ano);
        System.out.println("-----------------------------------------");
        System.out.println("Condutores e Salarios:");

        for (Condutor condutor : condutores) {
            System.out.println("Nome: " + condutor.getNome());
            System.out.println("Salario: R$" + condutor.getSalario());
            System.out.println("--------------------");
        }

        System.out.println("Total a Pagar: R$" + totalAPagar());
    } 
}
