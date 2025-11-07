import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banco banco = new Banco();
        Conta contaLogada = null;
        int opcao;
        do {
            System.out.println("\n=== MENU INICIAL ===");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Login");
            System.out.println("3 - Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Login: ");
                    String login = scanner.nextLine();
                    System.out.print("Senha: ");
                    String senha = scanner.nextLine();
                    banco.cadastrarConta(nome, login, senha);
                    break;

                case 2:
                    System.out.print("Login: ");
                    String loginUser = scanner.nextLine();
                    System.out.print("Senha: ");
                    String senhaUser = scanner.nextLine();
                    contaLogada = banco.fazerLogin(loginUser, senhaUser);

                    if (contaLogada != null) {
                        menuConta(scanner, contaLogada);
                    }
                    break;

                case 3:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 3);
    }
    public static void menuConta(Scanner scanner, Conta conta) {
        int opcao;
        do {
            System.out.println("\n=== MENU CONTA ===");
            System.out.println("1 - Ver saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Sair da conta");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Saldo atual: R$ " + conta.getSaldo());
                    break;

                case 2:
                    System.out.print("Valor do depósito: ");
                    double deposito = scanner.nextDouble();
                    conta.depositar(deposito);
                    break;

                case 3:
                    System.out.print("Valor do saque: ");
                    double saque = scanner.nextDouble();
                    conta.sacar(saque);
                    break;

                case 4:
                    System.out.println("Saindo da conta...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 4);
    }
}
