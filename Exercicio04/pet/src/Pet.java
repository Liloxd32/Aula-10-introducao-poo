public class Pet {
    
    public String nome;
    public String especie;
    public String raca;
    public int idade;
    public double peso;

    public Pet() {
    }

    public void apresentar() {

        System.out.println("Olá! Meu nome é " + nome +
                ", sou um " + especie +
                " da raça " + raca + ".");

        System.out.println("Tenho " + idade +
                " anos e peso " + peso + " kg.");
    }

    public void aniversario() {

        idade++;

        System.out.println(nome +
                " fez aniversário e agora tem " +
                idade + " anos.");
    }

    public void avaliarPeso(double pesoIdeal) {

        if (peso < pesoIdeal) {

            System.out.println(nome +
                    " está abaixo do peso ideal (" +
                    pesoIdeal + " kg).");

        } else if (peso == pesoIdeal) {

            System.out.println(nome +
                    " está no peso ideal.");

        } else {

            System.out.println(nome +
                    " está acima do peso ideal (" +
                    pesoIdeal + " kg).");
        }
    }
}
