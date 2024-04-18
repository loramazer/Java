package br.com.alura.lauraflix.calculos;

import br.com.alura.lauraflix.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui (Titulo t) {
        tempoTotal += t.getDuracaoEmMinutos();
    }
}
