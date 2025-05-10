public class AreaOfTriangle {
    public static void main(String[] args) {
        double Area;
        int x1=0; 
        int x2=2;
        int x3=6;
        int y1=4;
        int y2=8;
        int y3=6;
        Area = 0.5 * Math.abs(x1*(y2 - y3) + x2*(y3 - y1) + x3*(y1 - y2));
        System.out.println(Area);
    }

}