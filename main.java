import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Bem-vindo ao PetShop ===");
        System.out.print("Digite o nome do dono: ");
        String dono = sc.nextLine();

        System.out.print("Digite a espécie do animal: ");
        String especie = sc.nextLine();

        System.out.print("Digite o nome do animal: ");
        String animal = sc.nextLine();

        System.out.print("Digite a idade do animal: ");
        int idade = sc.nextInt();

        System.out.print("Digite o peso do animal em kg: ");
        double peso = sc.nextDouble();

        especies pet = new especies(especie, animal, idade, peso, dono);

        pet.nome_dono();
        pet.nome_animal();
        pet.idade();
        pet.peso();

        if (especie.equalsIgnoreCase("cachorro")) {
            pet.cachorro();
        } else if (especie.equalsIgnoreCase("gato")) {
            pet.gato();
        } else if (especie.equalsIgnoreCase("peixe")) {
            pet.peixe();
        } else if (especie.equalsIgnoreCase("passarinho")) {
            pet.passarinho();
        } else if (especie.equalsIgnoreCase("roedor")) {
            pet.roedor();
        } else {
            System.out.println("Espécie não cadastrada.");
        }

        sc.close();
    }
}