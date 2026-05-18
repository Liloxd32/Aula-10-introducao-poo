public class Celular {

    public String marca;
    public String modelo;
    public int bateria;
    public boolean ligado;
    public double armazenamentoUsado;
    public double armazenamentoTotal;

    public void ligar() {
        if (bateria > 0) {
            ligado = true;
        }
    }

    public void desligar() {
        ligado = false;
    }

    public void carregarBateria(int percentual) {
        if (percentual > 0) {
            bateria += percentual;
            if (bateria > 100) {
                bateria = 100;
            }
        }
    }

public void usarArmazenamento(double gb) {
    if (armazenamentoUsado + gb <= armazenamentoTotal) {
            armazenamentoUsado += gb;
        } else {
            System.out.println("Armazenamento insuficiente.");
        }
    }

    public void exibirStatus() {

        System.out.println(marca + " " + modelo + (ligado ? " — LIGADO" : " — DESLIGADO"));
        System.out.println("Bateria: " + bateria + "%");
        System.out.println("Armazenamento: " + armazenamentoUsado + " GB / " + armazenamentoTotal + " GB usados");
    }
}
