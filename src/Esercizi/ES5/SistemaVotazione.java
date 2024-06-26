package Esercizi.ES5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SistemaVotazione {
    private Map<String, Integer> votiCandidati = new HashMap<>();
    private Set<String> elettoriVotanti = new HashSet<>();

    public void addCandidato(Candidato candidato) {
        votiCandidati.putIfAbsent(candidato.getCod(), 0);
    }

    public void vota(Elettore elettore, Candidato candidato) throws VotoException {
        if (elettoriVotanti.contains(elettore.getcodE())) {
            throw new ElettoreGiaVotatoException("L'elettore ha già votato!");
        }
        if (!votiCandidati.containsKey(candidato.getCod())) {
            throw new CandidatoNonEsistenteException("Il candidato non esiste!");
        }
        votiCandidati.put(candidato.getCod(), votiCandidati.get(candidato.getCod()) + 1);
        elettoriVotanti.add(elettore.getcodE());
    }

    @Override
    public String toString() {
        StringBuilder risultati = new StringBuilder();
        for (Map.Entry<String, Integer> entry : votiCandidati.entrySet()) {
            risultati.append("Candidato ")
                     .append(entry.getKey())
                     .append(": ")
                     .append(entry.getValue())
                     .append(" voti\n");
        }
        return risultati.toString();
    }
}