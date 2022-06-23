public class Proyecto {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        int contador = 0;
        for(int[] row : matriz){
            for(int col : row){
                contador+=2;
                col = contador;
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
