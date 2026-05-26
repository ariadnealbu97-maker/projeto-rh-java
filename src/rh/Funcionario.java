package rh;

public abstract class Funcionario {
    // Atributos privados (Encapsulamento)
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private String setor;
    
    // Construtor para inicializar as variáveis
    public Funcionario(String nome, String cpf, String endereco, String telefone, String setor) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.setor = setor;
    }

    // Método abstrato para o cálculo do salário/pagamento
    public abstract double calcularPagamento();

    // Método abstrato para aplicar o aumento percentual
    public abstract void aplicarAumento(double porcentagem);
    
    // Método comum para mostrar os dados na tela
    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
        System.out.println("Setor: " + setor);
        System.out.printf("Pagamento: R$ %.2f\n", calcularPagamento());
    }

    // Métodos Get e Set para encapsulamento
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public String getSetor() { return setor; }
    public void setSetor(String setor) { this.setor = setor; }
}