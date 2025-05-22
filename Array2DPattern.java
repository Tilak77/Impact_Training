public class Array2DPattern {

    //Pattern:-
    //    1 2 3 4 5
    //            10
    // 11 12 13 14 15
    // 16
    // 21 22 23 24 25


    public static void main(String[] args) {
        int[][] arr= {{1,2,3,4,5},
                    {0,0,0,0,10},
                    {11,12,13,14,15},
                    {16,0,0,0,0},
                    {21,22,23,24,25}};

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i][j]!=0){
                    System.out.print(arr[i][j] + " ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
