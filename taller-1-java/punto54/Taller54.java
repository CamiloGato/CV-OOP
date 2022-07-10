package punto54;

import javax.swing.*;

public class Taller54 {


    public static void main(String[] args) {

        String titulo;
        int nroVentas, paginas, publicacion;
        float precio, duracion;

        titulo = JOptionPane.showInputDialog(null, "Titulo del Disco ", "SOLICITANDO DATOS", JOptionPane.QUESTION_MESSAGE);
        duracion = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la duracion en minutos: ", "SOLICITANDO DATOS", JOptionPane.QUESTION_MESSAGE));
        precio = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el precio: ", "SOLICITANDO DATOS", JOptionPane.QUESTION_MESSAGE));

        Disco disco = new Disco(titulo, precio, duracion);

        for (int I = 1; I <= 6; I++) {
            nroVentas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese las ventas del mes " + I, "SOLICITANDO DATOS", JOptionPane.QUESTION_MESSAGE));
            disco.asignarVenta(I, nroVentas);
        }

        titulo = JOptionPane.showInputDialog(null, "Titulo del libro: ", "SOLICITANDO DATOS", JOptionPane.QUESTION_MESSAGE);
        paginas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese numero de paginas: ", "SOLICITANDO DATOS", JOptionPane.QUESTION_MESSAGE));
        publicacion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese ano de publicacion: ", "SOLICITANDO DATOS", JOptionPane.QUESTION_MESSAGE));
        precio = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el precio del libro: ", "SOLICITANDO DATOS", JOptionPane.QUESTION_MESSAGE));

        Libro libro = new Libro(titulo, precio, paginas, publicacion);

        for (int I = 1; I <= 6; I++) {
            nroVentas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la venta del mes " + I, "SOLICITANDO DATOS", JOptionPane.QUESTION_MESSAGE));
            libro.asignarVenta(I, nroVentas);
        }

        disco.mostrar();
        libro.mostrar();

        // Quiere saber cuanto vendio en algun mes?

    }

}