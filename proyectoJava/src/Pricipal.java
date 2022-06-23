public class Pricipal{
	
	public static void main(String[] args) {
		
		int[][] milista = new int[4][4];
		int n =2;
		for(int j = 0 ; j < 4 ; j++) {
			
			for(int i=0 ; i < 4 ; i++) {
				milista[j][i] = n;
				n=n+2;
				System.out.print(milista[j][i]);
			}
		}
		
		
	}
}
