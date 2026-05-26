package rh;

public class Assalariado extends Funcionario {
    // Atributo específico desta classe filha
    private double salarioMensal;

    // Construtor: recebe os dados comuns + o salário mensal
    public Assalariado(String nome, String cpf, String endereco, String telefone, String setor, double salarioMensal) {
        // O super() repassa os dados para o construtor da classe mãe Funcionario
        super(nome, cpf, endereco, telefone, setor);
        this.salarioMensal = salarioMensal;
    }

    // Código que calcula o pagamento (para o assalariado é o próprio salário fixo)
    @Override
    public double calcularPagamento() {
        return salarioMensal;
    }

    // Código que aplica o aumento em porcentagem sobre o salário
    @Override
    public void aplicarAumento(double porcentagem) {
        this.salarioMensal += this.salarioMensal * (porcentagem / 100);
    }

    // Getter e Setter para o atributo específico
    public double getSalarioMensal() { return salarioMensal; }
    public void setSalarioMensal(double salarioMensal) { this.salarioMensal = salarioMensal; }
}