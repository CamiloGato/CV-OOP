public class MatrizCuadrada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 4;
		int elemento = 2;
		
		int[][] matrizCuadrada = new int[a][a];
		for (int i = 0; i < matrizCuadrada.length; i++) {
			//System.out.print((i+1) + ":         ");
			for (int j = 0; j < matrizCuadrada[i].length; j++) {
				matrizCuadrada[i][j] = elemento;
				elemento +=2;
				System.out.print(matrizCuadrada[i][j] + "\t");
				//if (j != matrizCuadrada[i].length - 1) System.out.print("\t");
			}
			System.out.println();
		}

	}

}
