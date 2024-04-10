import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Series;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Encanto");
        miPelicula.setFechaDeLanzamiento(2021);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(7.8);
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        System.out.println(miPelicula.getTotalDeLasEvaluaciones());
        System.out.println("Media de las evaluaciones de la peicula: " + miPelicula.calculaMedia());

        System.out.println("************************************************");

        Series casaDragon = new Series();
        casaDragon.setNombre("La casa del dragón");
        casaDragon.setFechaDeLanzamiento(2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);

        casaDragon.muestraFichaTecnica();
        casaDragon.evalua(10);
        casaDragon.evalua(10);
        casaDragon.evalua(10);
        System.out.println(casaDragon.getTotalDeLasEvaluaciones());
        System.out.println("Media de las evaluaciones de la peicula: " + casaDragon.calculaMedia());

    }
}