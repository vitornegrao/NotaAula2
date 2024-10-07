import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Sistema Bancário!");
        System.out.print("Digite o nome do titular da conta: ");
        String titular = scanner.nextLine();

        System.out.println("Selecione o tipo de conta:");
        System.out.println("1. Conta Corrente");
        System.out.println("2. Conta Poupança");
        int opcaoConta = scanner.nextInt();

        if (opcaoConta == 1) {
            ContaCorrente contaCorrente = new ContaCorrente(titular);
            menuContaCorrente(contaCorrente, scanner);
        } else if (opcaoConta == 2) {
            System.out.print("Digite a taxa Selic atual: ");
            double selic = scanner.nextDouble();
            ContaPoupanca contaPoupanca = new ContaPoupanca(titular, selic);
            menuContaPoupanca(contaPoupanca, scanner);
        } else {
            System.out.println("Opção inválida!");
        }

        scanner.close();
    }

    private static void menuContaCorrente(ContaCorrente conta, Scanner scanner) {
        int opcao;
        do {
            System.out.println("\n--- Menu Conta Corrente ---");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Usar Cheque Especial");
            System.out.println("4. Exibir Dados da Conta");
            System.out.println("5. Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor do depósito: ");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                case 2:
                    System.out.print("Digite o valor do saque: ");
                    double valorSaque = scanner.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                case 3:
                    System.out.print("Digite o valor a usar do cheque especial: ");
                    double valorCheque = scanner.nextDouble();
                    conta.usarChequeEspecial(valorCheque);
                    break;
                case 4:
                    conta.exibirDadosConta();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 5);
    }

    private static void menuContaPoupanca(ContaPoupanca conta, Scanner scanner) {
        int opcao;
        do {
            System.out.println("\n--- Menu Conta Poupança ---");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Calcular Rendimento");
            System.out.println("4. Exibir Dados da Conta");
            System.out.println("5. Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor do depósito: ");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                case 2:
                    System.out.print("Digite o valor do saque: ");
                    double valorSaque = scanner.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                case 3:
                    conta.calcularRendimento();
                    break;
                case 4:
                    conta.exibirDadosConta();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 5);
    }
}
