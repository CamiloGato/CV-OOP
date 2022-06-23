import java.util.ArrayList;

public class Netflix {
    public static void main(String[] args) {

        ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
        ArrayList<Serie> series = new ArrayList<Serie>();

        // PELICULAS

        String[] tituloPeliculas = {
                "Barbie: la Princesa y la Costurera",
                "Barbie: Escuela de princesas",
                "Barbie: Fairytopia",
                "Barbie presenta: Pulgarcita",
                "Barbie: Una aventura de sirenas"
        };
        int[] anoPeliculas = {
                2004,
                2011,
                2005,
                2009,
                2010
        };
        String[] creadorPeliculas = {
                "William Lau",
                "Ezekiel Norton",
                "Walter P. Martishius, William Lau",
                "Conrad Helten",
                "Adam Wood"
        };
        String generoPeliculas = "Animación";
        int[] duracionPeliculas = {
                120,
                140,
                125,
                130,
                110
        };

        // SERIES

        String[] tituloSeries = {
                "Breaking Bad",
                "Los Soprano",
                "Juego de tronos",
                "The Wire",
                "Chernóbil "
        };
        int[] noTemporadasSeries = {
                5,
                6,
                8,
                5,
                1
        };
        String[] creadorSeries = {
                "Vince Gilligan",
                "David Chase",
                "David Benioff y D. B. Weiss",
                "David Simon",
                "Craig Mazin"
        };
        String[] generoSeries = {
                "Thriller",
                "Drama",
                "Fantasía. Drama",
                "Thriller",
                "Drama"
        };
        int[] duracionSeries = {
                30,
                25,
                20,
                50,
                30
        };

        // SE RELLENAN DE MANERA AUTOMÁTICA LAS SERIES Y PELÍCULAS
        // TOMANDO CONDICIONES COMO QUE SI ES CONGRUENTE MODULO 2 ENTONCES
        // SE MARCARÁN EN VISTO (Caso de las peliculas) Y EN CASO CONTRARIO
        // HAGAN OTRAS COSAS (Marca visto en caso de las series)

        for(int index = 0; index < 5; index++){
            peliculas.add(new Pelicula(
                    tituloPeliculas[index],
                    creadorPeliculas[index],
                    anoPeliculas[index]
            ));

            peliculas.get(index).setGenero(generoPeliculas);
            peliculas.get(index).setDuracion(duracionPeliculas[index]);

            if (index % 2 == 0) {
                peliculas.get(index).marcarVisto();
            }
        }

        for(int index = 0; index < 5; index++){
            if (index % 2 == 0){
                series.add(new Serie(
                        tituloSeries[index],
                        creadorSeries[index]
                ));
                series.get(index).setNoTemporadas(noTemporadasSeries[index]);
                series.get(index).setGenero(generoSeries[index]);
                series.get(index).setDuracion(duracionSeries[index]);
            } else {
                series.add(new Serie(
                        tituloSeries[index],
                        generoSeries[index],
                        creadorSeries[index],
                        duracionSeries[index],
                        noTemporadasSeries[index]
                ));
                series.get(index).marcarVisto();
            }
        }

        // AÑADE PELICULAS EN ESTE ESPACIO, ADEMÁS PODRÁS DE HACER USO
        // DE LOS MÉTODOS DE LA CLASE PELICULA O SERIE

        try {
            peliculas.remove(100); // ERROR
        } catch (IndexOutOfBoundsException arrayE) {
            System.out.println("No se puede obtener un elemento, se ha pasado por parámetro un indice muy grande!");
        } finally {
            System.out.println("FIN DEL CÓDIGO PUESTO POR EL USUARIO");
        }

        // FIN DE AÑADIR CÓDIGO

        int temporadaSerie = 0;
        String nombreSerieMasTemp = "";

        int anoPeli = 0;
        String nombrePeliMasReciente = "";

        String videosVistos = "Las Películas y series vistas son: \n";

        for (int index = 0; index < peliculas.size(); index++){
            if (peliculas.get(index).esVisto()){
                videosVistos += peliculas.get(index).toString();
            }
            if (series.get(index).esVisto()){
                videosVistos += series.get(index).toString();
            }
            if (temporadaSerie < series.get(index).getNoTemporadas()){
                temporadaSerie = series.get(index).getNoTemporadas();
                nombreSerieMasTemp = series.get(index).getTitulo();
            }
            if (anoPeli < peliculas.get(index).getAno()){
                anoPeli = peliculas.get(index).getAno();
                nombrePeliMasReciente = peliculas.get(index).getTitulo();
            }
        }

        videosVistos += "\nHa visto un total de " + peliculas.get(0).tiempoVisto() + " minutos en peliculas y series, suponiendo que tienen un capitulo";

        System.out.println(videosVistos);
        System.out.println("La pelicula mas reciente es: " + nombrePeliMasReciente);
        System.out.println("La serie con mas temporadas es: " + nombreSerieMasTemp);

    }
}
