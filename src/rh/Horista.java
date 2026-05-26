package rh;

public class Horista extends Funcionario {
    // Atributos específicos do funcionário horista
    private double horasTrabalhadas;
    private double valorHora;

    // Construtor: recebe os dados comuns da mãe + os dados específicos do horista
    public Horista(String nome, String cpf, String endereco, String telefone, String setor, double horasTrabalhadas, double valorHora) {
        super(nome, cpf, endereco, telefone, setor); // Repassa para a classe mãe Funcionario
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    // Cálculo do pagamento: horas trabalhadas multiplicadas pelo valor da hora
    @Override
    public double calcularPagamento() {
        return horasTrabalhadas * valorHora;
    }

    // Aplica o aumento percentual em cima do valor que ele ganha por hora
    @Override
    public void aplicarAumento(double porcentagem) {
        this.valorHora += this.valorHora * (porcentagem / 100);
    }

    // Getters e Setters para os atributos específicos
    public double getHorasTrabalhadas() { return horasTrabalhadas; }
    public void setHorasTrabalhadas(double horasTrabalhadas) { this.horasTrabalhadas = horasTrabalhadas; }

    public double getValorHora() { return valorHora; }
    public void setValorHora(double valorHora) { this.valorHora = valorHora; }
}