
public class muli_2en4 {
     public static void fuckin_up()
    {
        int i,x2,x=1;
        
        for(i=1;i<=4;i++){
            
            System.out.print(i+"	");
            
             for(x2=1;x2<=4;x2++){
                System.out.print((x*2)+" ");
                
                x++;
            }
            System.out.println();
        }
    }
    public static void main(String[]arg){
        int [][]array=new int [4][4] ;
        int i;
        int i1;
        int x= 2;
        for(i=0;i!=4;i++){
            System.out.print((i+1)+" ");
            
            for(i1=0;i1!=4;i1++){
            array[i][i1]=x;
            x=x+2;
            System.out.print(array[i][i1]+" ");
            }
            System.out.println();
        }
        
        
        
        
        
    }
   
}
