package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Series;
import com.aluracursos.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PrincipalConListas {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto",2021);
        miPelicula.evalua(9);
        Pelicula otraPelicula = new Pelicula("Mulan",2002);
        otraPelicula.evalua(6);
        var peliculaDeEjemplo = new Pelicula("El Señor de los anillos", 2001);
        peliculaDeEjemplo.evalua(10);
        Series casaDragon = new Series("La casa del dragón",2022);

        ArrayList<Titulo> lista= new ArrayList<>();

        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(peliculaDeEjemplo);
        lista.add(casaDragon);

        for (Titulo item: lista){
            System.out.println(item.getNombre());
            if (item instanceof Pelicula pelicula ) {
                System.out.println(pelicula.getClasificacion());
            }else {
                System.out.println("No tiene calificacion");
            }
        }
        ArrayList<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Penelope Cruz");
        listaDeArtistas.add("Antonio Banderas");
        listaDeArtistas.add("Ricardo Darin");
        listaDeArtistas.add("Mario Moreno");

        //Collectios.sort ordena lista
        Collections.sort(listaDeArtistas);
        System.out.println("List de artistas: " + listaDeArtistas);

        Collections.sort(lista);
        System.out.println("Lista de titulos ordenados: " + lista);    }
}
