// Nome: Davi Fernandes Alves
// Matrícula: 1261946667

public class App {
    public static void main(String[] args) throws Exception {
    
    Personagem heroi = new Personagem();

    heroi.nome = "Aragorn";
    heroi.classe = "Guerreiro";
    heroi.nivel = 5;
    heroi.pontosDeVidaMaximos = 100;
    heroi.pontosDeVida = 100;
    heroi.ataque = 35;
    heroi.defesa = 20;

    Personagem inimigo = new Personagem();

    inimigo.nome = "Orc Selvagem";
    inimigo.classe = "Inimigo";
    inimigo.nivel = 3;
    inimigo.pontosDeVidaMaximos = 60;
    inimigo.pontosDeVida = 60;
    inimigo.ataque = 25;
    inimigo.defesa = 10;

    heroi.atacar(inimigo);
    inimigo.atacar(heroi);

    heroi.exibirStatus();
    inimigo.exibirStatus();
    }
}
