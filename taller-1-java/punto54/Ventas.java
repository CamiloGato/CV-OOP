package punto54;

public abstract class Ventas extends Publicacion {

    float[] meses = new float[6];

    public Ventas(String titulo, float precio) {
        super(titulo, precio);
    }

    public void asignarVenta(int mes, int cantidad){
        meses[mes-1] = cantidad;
    }

    public float leer(int mes){
        return meses[mes-1];
    }

    public abstract void mostrar();

}
