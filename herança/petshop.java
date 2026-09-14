package herança;

public class petshop {
    private String nomeAnimal;
    private int idade;
    private double peso;
    private String nomeDono;

    public petshop(String nomeAnimal, int idade, double peso, String nomeDono) {
        this.nomeAnimal = nomeAnimal;
        this.idade = idade;
        this.peso = peso;
        this.nomeDono = nomeDono;
    }

    public void nome_animal() {
        System.out.println("o nome do animal é: " + this.nomeAnimal);
    }

    public void idade() {
        System.out.println("a idade do animal é: " + this.idade + " anos");
    }

    public void peso() {
        System.out.println("o peso do animal é: " + this.peso + " kg");
    }

    public void nome_dono() {
        System.out.println("o nome do dono é: " + this.nomeDono);
    }
}
