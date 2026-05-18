// Nome: Davi Fernandes Alves
// Matrícula: 1261946667

public class App {
    public static void main(String[] args) throws Exception {
    

   Celular cel = new Celular();

    cel.marca = "Samsung";
    cel.modelo = "Galaxy A54";
    cel.bateria = 15;
    cel.ligado = false;
    cel.armazenamentoUsado = 50.0;
    cel.armazenamentoTotal = 128.0;

     cel.ligar();
    cel.carregarBateria(85);
    cel.usarArmazenamento(20.0);

    cel.exibirStatus();
    }
}
