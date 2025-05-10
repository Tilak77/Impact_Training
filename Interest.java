public class Interest {
    public static void main(String[] args) {
        double Interest=0;
        double principle= 10000 ;
        double rate= 10;
        double time= 5;


        while(time > 0){
            Interest=(principle*rate)/100;
            principle += Interest;
            time= time-1;
        }
        System.out.println(Interest);
        
    }
}
