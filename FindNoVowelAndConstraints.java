public class FindNoVowelAndConstraints {
    public static void main(String[] args) {
        String s= "HELLOWORLD";
        int vowel=0;
        int str= s.charAt(0);
        for(int i=0; i<s.length(); i++){
            char ch= s.charAt(i);
            System.out.print(ch);
            if(i=='A' || i=='E' || i=='I' || i=='O' || i=='U'){
                vowel++;
            }
        }
        System.out.println(vowel);
    }
}
