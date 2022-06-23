public class Video implements Visualizable {
    protected String titulo;
    protected String genero;
    protected String creador;
    protected int duracion; // Duración en Minutos
    protected boolean visto;
    protected static int tiempoTotalVisto; // Total visto en minutos

    // CONSTRUCT

    public Video(String titulo, String genero, String creador, int duracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.creador = creador;
        this.duracion = duracion;
    }

    // GETTERS AND SETTERS
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    // METHODS

    @Override
    public String toString() {
        return "\ngenero:\t'" + getGenero() + '\'' +
                "\ncreador:\t'" + getCreador() + '\'' +
                "\nduracion:\t" + getDuracion() + " minutos"+
                "\nvisto:\t"+ esVisto();
    }

    @Override
    public void marcarVisto() {
        this.visto = true;
        Video.tiempoTotalVisto += this.duracion;
    }

    @Override
    public boolean esVisto() {
        return visto;
    }

    @Override
    public int tiempoVisto() {
        return tiempoTotalVisto;
    }
}
