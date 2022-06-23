
public class Matrix {
    
    
    
public  void  generaMatriz()
    {
    int [][] mat = new int[4][4];
    int a = 0;
        
        for(int i=0; i < mat.length; i++)
        {   
            for(int j=0; j < mat.length; j++)
            {
                ++a;       
                mat[i][j] = a*2;
                System.out.print(mat[i][j]+"  ");
            }
            System.out.println();
                            
        }
    
    }
   public static void main(String[] args) {
        
        Matrix m = new Matrix();
        m.generaMatriz();
        
        } 

}
