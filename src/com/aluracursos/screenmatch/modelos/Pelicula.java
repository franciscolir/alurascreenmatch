package com.aluracursos.screenmatch.modelos;

public class Pelicula extends Titulo{
   private String director;
   private String tipo= "pelicula";

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
}

