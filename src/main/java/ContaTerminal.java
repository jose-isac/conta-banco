import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("BANCO DE TERMINAL");
        System.out.println();

        System.out.print("Por favor, digite o código de sua agência: ");
        String agencia = scanner.nextLine();
        System.out.print("Por favor, digite o número de sua conta: ");
        int conta = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Por favor, digite o seu nome completo: ");
        String nome = scanner.nextLine();
        System.out.print("Por favor, digite o seu saldo: ");
        double saldo = scanner.nextDouble();

        scanner.close();

        System.out.println();
        String message = String.format("Olá, %s, obrigado por criar uma conta em nosso banco,%nsua agência é %s, conta" +
                        " %d e seu saldo R$ %.2f%njá está disponível para saque.%n", nome.toUpperCase(), agencia, conta,
                        saldo);

        System.out.println(message);

    }
}
