public class FindDuplicateElement {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,5};
        int count=0;

        for(int i=0; i<a.length; i++){
            for(int j=0; j<a.length; j++){
                if(a[i]==a[j] && i!=j){
                    count=i;
                }
        }
        } 
        if(count==0){
            System.out.println("No Duplicate Element in Array");
        }
        else{
        System.out.println("The Duplicate Element is: " + a[count]);
        }
        
    }
}
