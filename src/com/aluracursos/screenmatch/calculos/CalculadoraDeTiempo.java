package com.aluracursos.screenmatch.calculos;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Titulo;

public class CalculadoraDeTiempo {

    private int tiempoTotal;

    private int cantidadDeTitulosIncluidos;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye(Titulo titulo){

        this.tiempoTotal += titulo.getDuracionEnMinutos();
        cantidadDeTitulosIncluidos ++;
    }
    public int getCantidadDeTitulosIncluidos() {

        return cantidadDeTitulosIncluidos;
    }


}
