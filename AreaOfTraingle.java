class AreaOfTraingle{
    public static void main(String[] args) {
        int a,b,c;
        a=4;
        b=6;
        c=8;
        int S=(a+b+c)/2;
        
        int Area= (S*(S-a)*(S-b)*(S-c));
        System.out.println(Math.sqrt(Area));
    }
}