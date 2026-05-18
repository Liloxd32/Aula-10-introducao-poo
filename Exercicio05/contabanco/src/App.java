// Nome: Davi Fernandes Alves
// Matrícula: 1261946667


public class App {
    public static void main(String[] args) throws Exception {
    
      ContaBancaria conta = new ContaBancaria();

        conta.titular = "Carlos Souza";
        conta.numeroConta = "0042-7";
        conta.saldo = 0;

        conta.depositar(1500.00);
        conta.depositar(250.00);
        conta.sacar(300.00);

        conta.exibirExtrato();
    }
}
