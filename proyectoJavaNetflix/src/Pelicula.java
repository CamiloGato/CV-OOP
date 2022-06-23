public class Pelicula extends Video {
    private int ano;

    public Pelicula(String titulo, String creador, int ano) {
        super(titulo, "", creador, 0);
        this.ano = ano;
    }

    // GETTERS AND SETTERS

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "\nPelicula:\t'" + getTitulo() + '\''+
                super.toString();
    }
}
