package Sintaxe;
import java.util.Scanner;

public class ContaTerminal {

    private Scanner entrada;

    public ContaTerminal() {
        // Cria um objeto da classe Scanner para ler os dados do terminal
        entrada = new Scanner(System.in);
    }

    public void iniciar() {
        // Solicita e lê o número da agência
        System.out.println("Por favor, digite o número da agência !");
        String agencia = entrada.nextLine();

        // Solicita e lê o número da conta
        System.out.println("Por favor, digite o número da conta !");
        int numero = Integer.parseInt(entrada.nextLine());

        // Solicita e lê o nome do cliente
        System.out.println("Por favor, digite o seu nome completo !");
        String nomeCliente = entrada.nextLine();

        // Solicita e lê o saldo da conta
        System.out.println("Por favor, digite o saldo da sua conta !");
        double saldo = Double.parseDouble(entrada.nextLine());

        // Exibe a mensagem de boas-vindas com os dados inseridos pelo usuário
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
