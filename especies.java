import herança.petshop;

public class especies extends petshop{
    public especies(String nomeAnimal) {
        super(nomeAnimal, 0, 0.0, "");
    }
    public void cachorro(){
    System.out.println("o animal é um cachorro");
    }

    public void gato(){
    System.out.println("o animal é um gato");
    }

    public void peixe(){
    System.out.println("o animal é um peixe");
    }

    public void passarinho(){
    System.out.println("o animal é um passarinho");
    }
     
    public void roedor(){
    System.out.println("o animal é um roedor");
    }
}