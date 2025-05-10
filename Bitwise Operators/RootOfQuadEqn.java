public class RootOfQuadEqn {
    public static void main(String[] args) {
        double a=5;
        double b=10;
        double c=20;
        double dis= b*b - (4*a*c);

        if(dis>=0){
            double Ans1=(-b + (Math.sqrt(dis)) / (2*a));
            double Ans2=(-b - (Math.sqrt(dis)) / (2*a));
            System.out.println(Ans1);
            System.out.println(Ans2);    
        }
        else{
            System.out.println("The eqn has no Real Roots.");
        }
    }
  }

