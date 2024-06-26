package Esercizi.ES5;

public class App {
    static Candidato candidato1, candidato2, candidato3;
    static Elettore elettore1, elettore2;
    static SistemaVotazione votazione;

    public static void main(String[] args) throws VotoException{
        candidato1 = new Candidato("C1");
        candidato2 = new Candidato("C2");
        candidato3 = new Candidato("C3");

        elettore1 = new Elettore("CE1");
        elettore2 = new Elettore("CE2");

        votazione = new SistemaVotazione();

        addCandidato();
        vota();
        Risultati();

    }

    public static void addCandidato(){
        votazione.addCandidato(candidato1);
        votazione.addCandidato(candidato2);
    }

    public static void vota() throws VotoException{
        votazione.vota(elettore1, candidato1);
        votazione.vota(elettore2, candidato1);
        
        //votazione.vota(elettore1, candidato1);
        //votazione.vota(elettore2, candidato3);
    }

    public static void Risultati() throws VotoException{
        System.out.println(votazione);
    }


}
