public class MaxProductOfTwoElement {
// --------------------To find Maximum Product of Two Element in Array.--------------------------------
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        int maxProduct=0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    continue;
                }

                int product=arr[i]*arr[j];
                if(product > maxProduct ){
                    maxProduct=product;
                }
            }
        }
        System.out.println(maxProduct);        
    }

}
