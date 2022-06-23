package paquete2.paquete3;

import org.jetbrains.annotations.NotNull;
import paquete2.ClaseB;

class ClaseD {
    private int atrib1D;
    private int atrib2D;
    private int atrib3D;

    boolean diffClaseD(@NotNull ClaseB objeto){
        return objeto.atrib1B != atrib1D && objeto.atrib2B != atrib2D || objeto.diffClaseB(null);
    }

    public static void main(String[] args) {
        ClaseD objD = new ClaseD();
        ClaseB objB = new ClaseB();
        System.out.println(objD.diffClaseD(objB));
    }
}
