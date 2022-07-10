package punto54;

import javax.swing.*;
import java.util.Arrays;

public class Disco extends Ventas {

    float duracion;

    public Disco(String titulo, float precio, float duracion) {
        super(titulo, precio);
        this.duracion = duracion;
    }

    @Override
    public void mostrar() {

        JOptionPane.showMessageDialog(null,
                "Titulo: " + titulo + "\n" +
                        "Precio: " + precio + "\n" +
                        "Duracion: " + duracion + " minutos\n" +
                        "Numero de ventas por mes: " + Arrays.toString(this.meses) + "\n"
                ,"INFORMACION DEL DISCO",
                JOptionPane.INFORMATION_MESSAGE);


    }

}
