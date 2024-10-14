import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta !");
        int numeroConta = entrada.nextInt();

        entrada.nextLine(); //Quebra de linha. 

        System.out.println("Por favor, digite o número da Agência !");
        String agenciaConta = entrada.nextLine();

        System.out.println("Por favor, digite o seu nome !");
        String nomeCliente = entrada.nextLine();

        System.out.println("Por favor, digite o seu saldo!");
        String saldoStr = entrada.nextLine();
        saldoStr = saldoStr.replace(",", "."); //substituir vírgula por ponto. 
        double saldoConta = Double.parseDouble(saldoStr);

        ContaTerminal contaTerminal = new ContaTerminal(numeroConta, agenciaConta, nomeCliente, saldoConta);

        contaTerminal.imprimirDados();

        entrada.close();
    }
    
}
