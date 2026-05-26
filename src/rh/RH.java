package rh;

import java.util.ArrayList;
import java.util.Scanner;

public class RH {

    public static void main(String[] args) {
        // Criando o scanner para ler o teclado
        Scanner scanner = new Scanner(System.in);
        
        // Criando a lista única para guardar qualquer tipo de Funcionário (Polimorfismo)
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        
       // Laço de repetição para cadastrar até 10 funcionários
        for (int i = 0; i < 10; i++) {
            System.out.println("\n--- Cadastro do Funcionário " + (i + 1) + " ---");
            System.out.println("Escolha o tipo:");
            System.out.println("1 - Assalariado");
            System.out.println("2 - Horista");
            System.out.println("0 - Sair (Encerrar cadastros)");
            System.out.print("Opção: ");
            int tipo = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do teclado
            
            // Se o usuário digitar 0, quebra o laço e para de cadastrar
            if (tipo == 0) {
                break;
            }
            
            // Validação de opção incorreta
            if (tipo != 1 && tipo != 2) {
                System.out.println("Opção inválida! Tente novamente.");
                i--; // Volta um índice para repetir este cadastro
                continue;
            }
            
            // Dados que servem para os dois tipos de funcionários
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("CPF: ");
            String cpf = scanner.nextLine();
            System.out.print("Endereço: ");
            String endereco = scanner.nextLine();
            System.out.print("Telefone: ");
            String telefone = scanner.nextLine();
            System.out.print("Setor: ");
            String setor = scanner.nextLine();
            
            // Se for Assalariado
            if (tipo == 1) {
                System.out.print("Salário Mensal: R$ ");
                double salario = scanner.nextDouble();
                scanner.nextLine();
                
                // Cria o objeto Assalariado e adiciona na lista única
                Assalariado f = new Assalariado(nome, cpf, endereco, telefone, setor, salario);
                funcionarios.add(f);
                
            // Se for Horista
            } else if (tipo == 2) {
                System.out.print("Horas Trabalhadas: ");
                double horas = scanner.nextDouble();
                System.out.print("Valor da Hora: R$ ");
                double valorHora = scanner.nextDouble();
                scanner.nextLine();
                
                // Cria o objeto Horista e adiciona na mesma lista única
                Horista f = new Horista(nome, cpf, endereco, telefone, setor, horas, valorHora);
                funcionarios.add(f);
            }
        }

       // 1. Mostrar os funcionários cadastrados inicialmente
        System.out.println("\n=== Funcionários Cadastrados ===");
        for (Funcionario f : funcionarios) {
            System.out.println("---------------------------------");
            f.mostrarDados(); // Chama o método polimórfico
        }
        
        // 2. Solicitar o aumento geral
        System.out.println("\n---------------------------------");
        System.out.print("Informe o percentual de reajuste geral (%): ");
        double aumento = scanner.nextDouble();
        
        // Aplica o aumento para todos da lista usando o Polimorfismo
        for (Funcionario f : funcionarios) {
            f.aplicarAumento(aumento);
        }
        
        // 3. Mostrar os dados novamente com os valores atualizados
        System.out.println("\n=== Pagamentos Atualizados após Aumento ===");
        for (Funcionario f : funcionarios) {
            System.out.println("---------------------------------");
            f.mostrarDados();
        }
        
        // Fecha o leitor do teclado
        scanner.close();
        
    }
}