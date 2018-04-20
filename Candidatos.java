import java.util.ArrayList;

public class Candidatos {

    private String Nombre_Candidato;
    private int voto_candidato;


    //constructores
    public Candidatos(String nombre_Candidato, int voto) {
        Nombre_Candidato = nombre_Candidato;
        voto_candidato = voto_candidato;
    }

    //setters
    public void setNombre_Candidato(String nombre_Candidato) {
        Nombre_Candidato = nombre_Candidato;
    }

    public void setVoto_candidato(int voto_candidato) {
        this.voto_candidato = voto_candidato;
    }

    //getters
    public String getNombre_Candidato() {
        return Nombre_Candidato;
    }

    public int getVoto() {
        return voto_candidato;
    }
}
