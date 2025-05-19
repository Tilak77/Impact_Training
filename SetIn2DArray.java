import java.util.*;
public class SetIn2DArray{

    //--------------Find Set of Elements in 2D Array------------------------
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] arr1= new int[row][col];

        

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr1[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        
        
        int x=sc.nextInt();

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){            
            if(x==arr1[i][j]){
                System.out.print("(" + i + ", " + j + ")");
            }
        }
        }
    
    sc.close();
    }
}