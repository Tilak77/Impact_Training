public class pattern5 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            char ch='A';
            int count=1;
            for(char j=ch; j<=i+'A'; j+=count){
               count=count+2;
                System.out.print(j);

                // System.out.print("");
            }
            System.out.println();
        }
        }
}
