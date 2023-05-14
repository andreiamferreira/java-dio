package ContaBanco;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia, nomeCliente;
        double saldo;
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, digite seu nome completo: ");
        nomeCliente = sc.nextLine();

        System.out.print("Por favor, digite o número da agência: ");
        agencia = sc.nextLine();

        System.out.print("Por favor, digite o número da sua conta: ");
        numero = sc.nextInt();

        System.out.print("Por favor, digite seu saldo: ");
        saldo = sc.nextDouble();

        System.out.print("\"Olá " + nomeCliente
                + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                +", conta " + numero
                +"e seu saldo R$" + saldo + " já está disponível para saque\".");

    }

}