public class Filme {
    
 public String titulo;
    public String diretor;
    public int anoLancamento;
    public int duracao;
    public double nota;

    public String duracaoFormatada() {

        int horas = duracao / 60;
        int minutos = duracao % 60;

        return horas + "h " + minutos + "m";
    }

    public boolean recomendado() {
        return nota >= 7.0;
    }

    public void exibirDetalhes() {

        System.out.println("Título: " + titulo + " (" + anoLancamento + ")");
        System.out.println("Diretor: " + diretor);
        System.out.println("Duração: " + duracaoFormatada());
        System.out.println("Nota: " + nota + " ★");

        if (recomendado()) {
            System.out.println("Recomendado: SIM");
        } else {
            System.out.println("Recomendado: NÃO");
        }
    }
}
