public class Personagem {

   public String nome;
    public String classe;
    public int nivel;
    public int pontosDeVida;
    public int pontosDeVidaMaximos;
    public int ataque;
    public int defesa;

    public void receberDano(int dano) {
        pontosDeVida -= dano;

        if (pontosDeVida < 0) {
            pontosDeVida = 0;
        }
    }

    public void atacar(Personagem alvo) {

        int dano = this.ataque - alvo.defesa;

        if (dano < 1) {
            dano = 1;
        }

        alvo.receberDano(dano);
    }

    public void curar(int valor) {

        if (valor > 0) {
            pontosDeVida += valor;

            if (pontosDeVida > pontosDeVidaMaximos) {
                pontosDeVida = pontosDeVidaMaximos;
            }
        }
    }

    public boolean estaVivo() {
        return pontosDeVida > 0;
    }

    public void subirNivel() {

        nivel++;

        ataque += 5;
        defesa += 3;
        pontosDeVidaMaximos += 10;
        pontosDeVida = pontosDeVidaMaximos;
    }

    public void exibirStatus() {

        System.out.println("[" + nome + " - " + classe + " Nv." + nivel + "] " +
                "HP: " + pontosDeVida + "/" + pontosDeVidaMaximos +
                " | ATK: " + ataque +
                " | DEF: " + defesa);
    }
}
