import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: conhecer e importar a classe Scanner

        Scanner scanner = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("---------------CONTA BANCÁRIA---------------");
		System.out.println();
        System.out.println("Por favor, digite o número da Conta: (1234)");
        numero = scanner.nextInt();
        System.out.println();

        System.out.println("Por favor, digite o numero da Agencia !: (067-8)");
        agencia = scanner.next();
        System.out.println();

        System.out.println("Informe seu nome: ");
		nomeCliente = scanner.next();
		scanner.nextLine();
        System.out.println();

        System.out.println("Informe seu saldo atual: ");
		saldo = scanner.nextDouble();
        System.out.println();
        
		System.out.printf("Olá %s, obrigado por criar uma conta em "
				+ "nosso banco, sua agência é %s, "
				+ "conta %d e o seu saldo de %.2f já está disponível"
				+ " para saque.", nomeCliente, agencia, numero, saldo);

    }
}
