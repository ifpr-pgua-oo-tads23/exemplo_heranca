package ifpr.pgua.eic.tads.heranca;

import java.util.ArrayList;

import ifpr.pgua.eic.tads.heranca.entidades.Discente;
import ifpr.pgua.eic.tads.heranca.entidades.Docente;
import ifpr.pgua.eic.tads.heranca.entidades.Pessoa;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        
        ArrayList<Pessoa> listaPessoas = new ArrayList<>();
        Pessoa p;

        p = new Docente("Zé",35,"ze@teste.com","1234",1000);
    
        listaPessoas.add(p);

        p = new Discente("Chico",18,"chico@teste.com","345","TADS",2020);
        
        listaPessoas.add(p);

        
        for(int i=0;i<listaPessoas.size();i++){
            System.out.println(listaPessoas.get(i).toString());
        }

        for(Pessoa p1:listaPessoas){
            p1.metodo1();
            System.out.println(p1.imprimeDocInstitucional());
            System.out.println(p1.getClass().getName());
            System.out.println(p1 instanceof Docente);
            System.out.println(p1 instanceof Discente);
            if(p1 instanceof Docente){
                Docente d = (Docente)p1;
                System.out.println(d.calcularValorFerias());
            }
        }


    
    }
}
