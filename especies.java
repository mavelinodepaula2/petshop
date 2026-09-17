import herança.petshop;

public class especies extends petshop {
    private String especie;

    public especies(String especie, String nomeAnimal, int idade, double peso, String nomeDono) {
        super(nomeAnimal, idade, peso, nomeDono);
        this.especie = especie;
    }


    public void cachorro() {
        System.out.println("o animal é um cachorro");
          if (getespecie() == "cachorro" ){
            System.out.println("=== TABELA DE PREÇOS PARA CACHORRO====");
        }else{
            
        }
        if (getPeso() > 20) {
            System.out.println("o cachorro é grande");
        } else {
            System.out.println("o cachorro é pequeno");
        }
    }

    public void gato() {
        System.out.println("o animal é um gato");
    }

    public void peixe() {
        System.out.println("o animal é um peixe");
    }

    public void passarinho() {
        System.out.println("o animal é um passarinho");
    }

    public void roedor() {
        System.out.println("o animal é um roedor");
    }
}