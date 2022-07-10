package punto54;

import javax.swing.*;
import java.util.Arrays;

public class Libro extends Ventas {
    int paginas;
    int publicacion;

    public Libro(String titulo, float precio, int paginas, int publicacion) {
        super(titulo, precio);
        this.paginas = paginas;
        this.publicacion = publicacion;
    }

    @Override
    public void mostrar() {
        JOptionPane.showMessageDialog(null,
                "Titulo: " + titulo + "\n" +
                        "Precio: " + precio + "\n" +
                        "Numero de paginas: " + paginas + "\n" +
                        "Publicacion: " + publicacion + "\n" +
                        "Numero de ventas por mes: " + Arrays.toString(this.meses) + "\n"
                ,"INFORMACION DEL LIBRO",
                JOptionPane.INFORMATION_MESSAGE);
    }

}