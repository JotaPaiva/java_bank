import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double saldo = 0;
        int opcao = 0;

        System.out.println("*****************************************************");
        System.out.println("Bem vindo ao Java Bank! É um prazer ter você conosco.");
        System.out.println("*****************************************************");

        System.out.print("Para abrir uma conta, insira seu nome completo: ");
        String nomeDoCliente = scanner.nextLine();

        System.out.print("Selecione o tipo de conta desejado: ");
        String tipoDeConta = scanner.nextLine();

        System.out.println("***************************************");
        System.out.println("[JAVA BANK] Bem vindo/vinda, " + nomeDoCliente + "!");
        System.out.println("[JAVA BANK] Tipo de conta: " + tipoDeConta);
        System.out.println("[JAVA BANK] Saldo inicial: R$" + saldo);
        System.out.println("***************************************");

        while (opcao != 4){
            System.out.println("\nOperações:");
            System.out.println();
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depositar valor");
            System.out.println("3 - Sacar valor");
            System.out.println("4 - Encerrar sessão");

            System.out.print("\nSelecione a operação desejada [1-4]: ");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("\nO saldo atual é: R$" + saldo);
                    break;
                case 2:
                    System.out.print("\nInsira o valor a ser depositado: R$");
                    double valorDeposito = scanner.nextDouble();
                    saldo += valorDeposito;
                    System.out.println("\nDepósito realizado com sucesso. Saldo atual: R$" + saldo);
                    break;
                case 3:
                    System.out.print("\nInsira o valor a ser sacado: R$");
                    double valorSaque = scanner.nextDouble();
                    if (valorSaque > saldo) {
                        System.out.println("\nO saldo é insuficiente para o saque. Saldo atual: R$" + saldo);
                    } else {
                        saldo -= valorSaque;
                        System.out.println("\nSaque realizado com sucesso. Saldo atual: R$" + saldo);
                    }
                    break;
                case 4:
                    System.out.println("\nObrigado por usar o Java Bank. Até a próxima!");
                    break;
                default:
                    System.out.println("\nOpção inválida, tente novamente!");
            }

            System.out.println("\n***************************************");

        }

    }

}