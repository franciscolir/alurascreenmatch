package com.aluracursos.screenmatch.modelos;

public class Series extends Titulo{
    private int temporadas;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;

    @Override
    public int getDuracionEnMinutos() {
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }
    @Override
    public void muestraFichaTecnica(){
        System.out.println("El nombre de la serie es: " + getNombre());
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }
}
