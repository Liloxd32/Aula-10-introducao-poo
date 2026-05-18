// Nome: Davi Fernandes Alves
// Matrícula: 1261946667

public class App {
    public static void main(String[] args) throws Exception {
        
    
        Produto produto = new Produto();

        produto.nome = "Caneta Azul";
        produto.preco = 2.50;
        produto.quantidadeEstoque = 100;

        produto.vender(30);

        produto.exibirInformacoes();
    }
}
