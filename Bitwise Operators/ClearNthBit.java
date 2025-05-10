public class ClearNthBit {
    public static void main(String[] args) {
        int n=7;
        int k=2;  //Index to be Cleared.

        System.out.println(n&~(1<<k));
    }
}
