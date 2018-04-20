import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        Candidatos c1, c2, c3, nulo;
        Scanner scanner;

        int total_votos= 0;

        c1 = new Candidatos("Fram", 0);
        c2 = new Candidatos("Turin", 0);
        c3 = new Candidatos("Kathie", 0);
        nulo = new Candidatos("Nulo", 0);

        System.out.println("Indique el nombre de su candidato favorito: ");
        System.out.println("Fram: ");
        System.out.println("Turin: ");
        System.out.println("Kathie: ");

        scanner = new Scanner(System.in);
        String votos = scanner.nextLine();

        System.out.println("\n" + votos);

        while (!"F".equals(votos)){

            total_votos = total_votos + 1;

            if ("Fram".equals(votos)){
                c1.setVoto_candidato(c1.getVoto()+1);
            }
            if ("Turin".equals(votos)){
                c2.setVoto_candidato(c2.getVoto()+1);
            }
            if ("Kathie".equals(votos)){
                c3.setVoto_candidato(c3.getVoto()+1);
            }
            if (!"Fram".equals(votos) && !"Turin".equals(votos) && !"Kathie".equals(votos)){
                nulo.setVoto_candidato(nulo.getVoto()+1);
            }
            System.out.println("Ingrese su voto: ");
            votos = scanner.nextLine();
        }

        //porcentajes
        int p1 = c1.getVoto()*100/total_votos;
        int p2 = c2.getVoto()*100/total_votos;
        int p3 = c3.getVoto()*100/total_votos;
        int pn = nulo.getVoto()*100/total_votos;

        //mostrar candidatos con su porcentaje
        System.out.println(c1.getNombre_Candidato() + ": " + p1 + "%");
        System.out.println(c2.getNombre_Candidato() + ": " + p2 + "%");
        System.out.println(c3.getNombre_Candidato() + ": " + p3 + "%");
        System.out.println(nulo.getNombre_Candidato() + ": " + pn + "%");
        System.out.println("Hubo " + total_votos + " votos en total.");

        //ganador o empate
        if (c1.getVoto() > c2.getVoto() && c1.getVoto() > c3.getVoto())
        {
            System.out.println("Ha ganado el candidato " + c1.getNombre_Candidato() + ".");
        }
        if (c2.getVoto() > c1.getVoto() && c2.getVoto() > c3.getVoto())
        {
            System.out.println("Ha ganado el candidato " + c2.getNombre_Candidato()+".");
        }
        if (c3.getVoto() > c2.getVoto() && c3.getVoto() > c1.getVoto())
        {
            System.out.println("Ha ganado el candidato " + c3.getNombre_Candidato()+".");
        }
        if (c1.getVoto() == c2.getVoto() && c1.getVoto() > c3.getVoto())
        {
            System.out.println("Hubo un empate entre " + c1.getNombre_Candidato() + " y " + c2.getNombre_Candidato()+".");
        }
        if (c1.getVoto() > c2.getVoto() && c1.getVoto() == c3.getVoto())
        {
            System.out.println("Hubo un empate entre " + c1.getNombre_Candidato() + " y " + c3.getNombre_Candidato()+".");
        }
        if (c3.getVoto() == c2.getVoto() && c1.getVoto() < c3.getVoto())
        {
            System.out.println("Hubo un empate entre " + c1.getNombre_Candidato() + " y " + c2.getNombre_Candidato()+".");
        }
        if (c1.getVoto() == c2.getVoto() && c1.getVoto() == c3.getVoto())
        {
            System.out.println("Hubo un empate entre los tres candidatos.");
        }

    }
}
