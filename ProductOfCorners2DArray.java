public class ProductOfCorners2DArray {

//-------------------- Product of Corners in 2D Array --------------------------

    public static void main(String[] args) {
        int[][] arr= 
        {
        {1,2,3},
        {4,5,6},
        {7,8,9}
        };

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }

        int product = arr[0][0] * arr[0][arr[0].length-1] * arr[arr.length-1][0] * arr[arr.length-1][arr[0].length-1];
        System.out.println("Product of corners: " + product);

    }
}
