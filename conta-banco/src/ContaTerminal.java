
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao nosso sistema de abertura de contas!");

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o Saldo da conta: ");
        double saldo = scanner.nextDouble();

        System.out.println("\Conta criada com sucesso!");
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta" + numeroConta + " e seu saldo " + String.format("%.2f", saldo) + " já está disponível para saque.");

        scanner.close();
    }
}
