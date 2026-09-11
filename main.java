import java.util.Scanner;

public class main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.err.println("Digite o nome do animal:");
        String animal = sc.nextLine();
        petshop pet = new petshop(animal);

    }
}