public class pattern4 {
    public static void main(String[] args) {
        int num=9;
        for(int i=1; i<=num; i++){
            for(int j=1; j<num+1; j++){
                if((i+j)%2==0){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
