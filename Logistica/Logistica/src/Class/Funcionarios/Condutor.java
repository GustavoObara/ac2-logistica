package Class.Funcionarios;

import java.time.LocalDate;


public class Condutor {
    private String nome;
    private String cpf;
    private LocalDate data_nascimento;
    private double salario;

    public Condutor(String nome, String cpf, LocalDate data_nascimento, double salario) {
        //validando campos
        if(nome == null || nome.isEmpty()){
            throw new RuntimeException("O nome nao pode ser vazio");
        }else{
            if(cpf == null || cpf.isEmpty()){
                 throw new RuntimeException("O CPF nao pode ser vazio");
            }else{
                if(data_nascimento == null){
                    throw new RuntimeException("Data de Nascimento Invalida");
                }else{
                    if(salario <= 0){
                        throw new RuntimeException("Salario invalido, nao pode ser menor ou igual a zero");
                    }
                }
            }
        }
        this.nome = nome;
        this.cpf = cpf;
        this.data_nascimento = data_nascimento;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(LocalDate data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
     public boolean validarCPF(String cpf) {
        // Remover caracteres não numéricos do CPF
        cpf = cpf.replaceAll("\\D", "");

        // Verificar se o CPF possui 11 dígitos
        if (cpf.length() != 11) {
            return false;
        }

        // Verificar se todos os dígitos são iguais (caso contrário, não é um CPF válido)
        if (cpf.matches("(\\d)\\1{10}")) {
            return false;
        }

        // Calcular o primeiro dígito verificador
        //Caso os dígitos verificadores calculados sejam iguais aos dígitos verificadores do CPF informado, o método retorna true, indicando que o CPF é válido.
        //Caso contrário, retorna false.
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += Integer.parseInt(String.valueOf(cpf.charAt(i))) * (10 - i);
        }
        int digito1 = 11 - (soma % 11);
        if (digito1 > 9) {
            digito1 = 0;
        }

        // Calcular o segundo dígito verificador
        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += Integer.parseInt(String.valueOf(cpf.charAt(i))) * (11 - i);
        }
        int digito2 = 11 - (soma % 11);
        if (digito2 > 9) {
            digito2 = 0;
        }

        // Verificar se os dígitos verificadores calculados são iguais aos do CPF informado
        return (digito1 == Integer.parseInt(String.valueOf(cpf.charAt(9))) && digito2 == Integer.parseInt(String.valueOf(cpf.charAt(10))));
    }
}
