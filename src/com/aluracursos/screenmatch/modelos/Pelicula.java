package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.calculos.Clasificacion;

public class Pelicula extends Titulo implements Clasificacion {
   private String director;
   private String tipo = "pelicula";

    public Pelicula(String nombre) {
        this.setNombre(nombre);
    }

    @Override
   public String getTipo() {
        return tipo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClasificacion() {
        return (int) (calculaMedia() / 2);
    }
    //sobrescribir metodo toString de ArrayList
    public String toString(){
     return "Pelicula: " + this.getNombre() + "(" + this.getFechaDeLanzamiento() + ")";
    }
}

