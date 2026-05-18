public class Produto {
    
        public String nome;
    public double preco;
    public int quantidadeEstoque;

    public Produto() {
    }

    public void vender(int quantidade) {

        if (quantidade <= quantidadeEstoque) {
            quantidadeEstoque -= quantidade;
            System.out.println("Venda realizada.");
        } else {
            System.out.println("Estoque insuficiente.");
        }
    }

    public void repor(int quantidade) {
        quantidadeEstoque += quantidade;
    }

    public double calcularValorTotal() {
        return preco * quantidadeEstoque;
    }

    public void exibirInformacoes() {

        System.out.println("Produto: " + nome +
                " | Preço: R$ " + preco +
                " | Estoque: " + quantidadeEstoque + " unidades");

        System.out.println("Valor total em estoque: R$ " +
                calcularValorTotal());
    }
}
