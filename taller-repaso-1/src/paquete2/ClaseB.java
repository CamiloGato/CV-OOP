package paquete2;
import paquete1.ClaseA;

public class ClaseB {
    public int atrib1B;
    public int atrib2B;
    private int atrib3B;

    public boolean diffClaseB(ClaseA objeto){
        if (objeto == null){
            objeto = new ClaseA();
        }
        return atrib1B != objeto.atrib1A;
    }
}
