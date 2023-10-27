package ifpr.pgua.eic.tads.heranca.entidades;

public class Discente extends Pessoa{
    private String nSigaa;
    private String curso;
    private int anoEntrada;
    
    public Discente(String nome, int idade, String email, String nSigaa, String curso, int anoEntrada) {
        super(nome, idade, email);
        this.nSigaa = nSigaa;
        this.curso = curso;
        this.anoEntrada = anoEntrada;
    }

    public String verificarResultadoFinal(){
        //
        return "Aprovado ou Reprovado";
    }

    @Override
    public String toString() {
        return super.toString()+" Discente [nSigaa=" + nSigaa + ", curso=" + curso + ", anoEntrada=" + anoEntrada + "]";
    }

    @Override
    public String imprimeDocInstitucional(){
        return "Doc Institucional:"+nSigaa;
    }

    
}
