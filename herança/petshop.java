package herança;

public class petshop{
    private String nome;
     
     public petshop(String nome){
        this.nome = nome;
     }

     public void nome_animal(){
        System.err.println("o nome do animal é: " + this.nome);
     }
     
     public void idade(){
        System.err.println("a idade do do animal é:");
    }

    public void peso(){
        System.err.println("o peso do animal é:");
    }

    public void nome_dono(){
        System.err.println("o nome do dono é:");
    }
}