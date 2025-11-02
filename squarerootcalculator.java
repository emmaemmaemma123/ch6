package ch3;
public class squarerootcalculator{
    public static double squareRoot(double x){
        if(x<0){
            System.out.print("There is no square root.");
        }
        if (x==0){
            return 0;
        }
        double initialguess = x/2;
        double secondguess = (initialguess+x/initialguess)/2;
        while(Math.abs(initialguess-secondguess)>=0.0001){
            initialguess=secondguess;
            secondguess= (initialguess+x/initialguess)/2;
        }
        return secondguess;
    }
    public static void main (String [] args){
        double a = 9;
        System.out.print(squareRoot(a));
    }
}