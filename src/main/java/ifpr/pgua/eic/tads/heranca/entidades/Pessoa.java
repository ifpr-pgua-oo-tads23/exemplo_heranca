package ifpr.pgua.eic.tads.heranca.entidades;

public abstract class Pessoa {
   
    private String nome;
    private int idade;
    private String email;
    protected String restrito;
    
    public Pessoa(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }
    
    public void metodo1(){
        System.out.println("Executou metodo 1");
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + ", email=" + email + "]";
    }

    public String getNome(){
        return nome;
    }


    public abstract String imprimeDocInstitucional();
    


   
}
