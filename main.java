import java.util.Scanner;

public class main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.err.println("=== Bem-vindo ao PetShop ===");
        System.out.print("Digite o nome do dono:");
        String dono = sc.nextLine();

        
        System.out.println("Digite a espécie do animal:");
        String especie = sc.nextLine();
        
        System.out.println("Digite o nome do animal:");
        String animal = sc.nextLine();
        especies pet = new especies(animal);
        pet.nome_animal();

    }
}