public class ContaBancaria {
    
 public String titular;
    public String numeroConta;
    public double saldo;

    public ContaBancaria() {
    }

    public void depositar(double valor) {

        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {

        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saque inválido ou saldo insuficiente.");
        }
    }

    public void exibirExtrato() {

        System.out.println("====== Extrato ======");
        System.out.println("Titular: " + titular);
        System.out.println("Conta: " + numeroConta);
        System.out.println("Saldo: R$ " + saldo);
        System.out.println("=====================");
    }
}
