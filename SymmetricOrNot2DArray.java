public class SymmetricOrNot2DArray {

//-------------------- 2D Array is Symmetric Or Not --------------------------

    public static void main(String[] args) {
        int[][] arr= {
        {1,2,1},
        {3,2,3},
        {1,2,1}
    };

        int count=0;
        int m=arr.length;
        int n=arr[0].length;
        if(m!=n){
            System.out.println("False");
        }


        for(int i=0; i<m; i++){
            for(int j=0; j<m; j++){
                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }

        for(int i=0; i<m; i++){
            for(int j=0; j<m; j++){
                if(arr[i][j] != arr[i][j]){
                    count++;
                }
            }
        }
        if(count>0){
            System.out.println("False");
        }
        else{
            System.out.println("True");
        }
    }
}

