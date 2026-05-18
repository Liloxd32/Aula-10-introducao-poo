// Nome: Davi Fernandes Alves
// Matrícula: 1261946667


public class App {
    public static void main(String[] args) throws Exception {
        
        Pet pet = new Pet();

        pet.nome = "Rex";
        pet.especie = "cachorro";
        pet.raca = "Labrador";
        pet.idade = 3;
        pet.peso = 28.5;

        pet.apresentar();

        pet.avaliarPeso(30.0);

        pet.aniversario();  
    }
}
