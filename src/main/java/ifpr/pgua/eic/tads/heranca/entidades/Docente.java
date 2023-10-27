package ifpr.pgua.eic.tads.heranca.entidades;

public class Docente extends Pessoa{

    private String siape;
    private double salario;
    
    public Docente(String nome, int idade, String email, String siape, double salario) {
        super(nome, idade, email);
        this.siape = siape;
        this.salario = salario;
    }

    public double calcularValorFerias(){
        return salario*1/3;
    }

    @Override
    public String toString() {
        return "Docente [nome="+getNome()+"restrito="+restrito+", siape=" + siape + ", salario=" + salario + "]";
    }

    @Override
    public String imprimeDocInstitucional() {
        return "Doc. Institucional:"+siape;
    }


}
