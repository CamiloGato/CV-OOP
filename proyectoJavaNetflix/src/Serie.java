public class Serie extends Video {

    private int noTemporadas;

    public Serie(String titulo, String genero, String creador, int duracion, int noTemporadas) {
        super(titulo, genero, creador, duracion);
        this.noTemporadas = noTemporadas;
    }

    public Serie(String titulo, String creador) {
        this(titulo, "", creador, 0, 1);
    }

    // GETTERS AND SETTERS

    public int getNoTemporadas() {
        return noTemporadas;
    }

    public void setNoTemporadas(int noTemporadas) {
        this.noTemporadas = noTemporadas;
    }

    @Override
    public String toString() {
        return "\nSerie:\t'" + getTitulo() + '\''+
                super.toString();
    }
}
