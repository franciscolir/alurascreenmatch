public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.nombre = "Encanto";
        miPelicula.fechaDeLanzamiento = 2021;
        miPelicula.duracionEnMinutos = 120;
        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(7.8);
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        System.out.println(miPelicula.sumaDeLasEvaluaciones);
        System.out.println(miPelicula.totalDeLasEvaluaciones);
        System.out.println(miPelicula.calculaMedia());
        System.out.println("***************************************************");
        Pelicula otraPelicula = new Pelicula();
        otraPelicula.nombre = "Matrix";
        otraPelicula.fechaDeLanzamiento = 1998;
        otraPelicula.duracionEnMinutos = 188;
        otraPelicula.muestraFichaTecnica();
        otraPelicula.evalua(15);
        otraPelicula.evalua(15);
        otraPelicula.evalua(15);
        otraPelicula.evalua(15);
        System.out.println(otraPelicula.sumaDeLasEvaluaciones);
        System.out.println(otraPelicula.totalDeLasEvaluaciones);
        System.out.println(otraPelicula.calculaMedia());
        System.out.println("***************************************************");
        Pelicula terceraPelicula = new Pelicula();
        terceraPelicula.nombre = "up";
        terceraPelicula.fechaDeLanzamiento = 2009;
        terceraPelicula.duracionEnMinutos = 156;
        terceraPelicula.muestraFichaTecnica();
        terceraPelicula.evalua(20);
        terceraPelicula.evalua(20);
        terceraPelicula.evalua(20);
        terceraPelicula.evalua(20);
        System.out.println(terceraPelicula.sumaDeLasEvaluaciones);
        System.out.println(terceraPelicula.totalDeLasEvaluaciones);
        System.out.println(terceraPelicula.calculaMedia());
        System.out.println("***************************************************");
    }
}
