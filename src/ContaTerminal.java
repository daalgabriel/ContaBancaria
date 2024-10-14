public class ContaTerminal {
    //Atributo da Classe
    private int numeroConta;
    private String agenciaConta;
    private String nomeCliente ;
    private double saldoConta;

    //Método construtor
    public ContaTerminal(int numeroConta, String agenciaConta, String nomeCliente, double saldoConta){
        this.numeroConta = numeroConta;
        this.agenciaConta = agenciaConta;
        this.nomeCliente = nomeCliente;
        this.saldoConta = saldoConta;

        System.out.println("Os dados foram salvos corretamente.\n");
    }

    public void imprimirDados(){
        System.out.format(
            "Olá %s, obrigado por criar uma conta em nosso banco, " +
            "sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.\n",
            nomeCliente,
            agenciaConta,
            numeroConta,
            saldoConta

        );
    }

    //Métodos getters and setters
    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public String getAgenciaConta() {
        return agenciaConta;
    }
    public void setAgenciaConta(String agenciaConta) {
        this.agenciaConta = agenciaConta;
    }
    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public double getSaldoConta() {
        return saldoConta;
    }
    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }
}

