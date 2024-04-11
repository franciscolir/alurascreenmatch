import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroDeRecomendacion;
import com.aluracursos.screenmatch.modelos.Episodio;
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

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.setNombre("Mulan");
        otraPelicula.setFechaDeLanzamiento(2002);
        otraPelicula.setDuracionEnMinutos(130);
        otraPelicula.setIncluidoEnElPlan(true);

        otraPelicula.muestraFichaTecnica();
        otraPelicula.evalua(9);
        otraPelicula.evalua(10);
        otraPelicula.evalua(10);
        System.out.println(otraPelicula.getTotalDeLasEvaluaciones());
        System.out.println("Media de las evaluaciones de la peicula: " + otraPelicula.calculaMedia());

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
        System.out.println("***************************************");

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        System.out.println("Cantidad de titulos incluidos: " + calculadora.getCantidadDeTitulosIncluidos());
        System.out.println("Tiempo total para ver tus titulos favoritos " + calculadora.getTiempoTotal() + " minutos");

        FiltroDeRecomendacion filtroDeRecomendacion = new FiltroDeRecomendacion();
        filtroDeRecomendacion.filtro(miPelicula);

        System.out.println("***************************************");

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La Casa Targaryen");
        episodio.setSeries(casaDragon);
        episodio.setTotalVisualizaciones(50);
        filtroDeRecomendacion.filtro(episodio);

        System.out.println("***************************************");
    }
}