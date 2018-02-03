public class Recursion{

    //1.1a
    public int fact(int n){
        if (n < 0){
            throw new IllegalArgumentException();
        }
        if (n == 0){
            return 1;
        }
        return n * fact(n - 1);
    }
 
    //1.1b
    public int fib(int n){
        if (n < 0){
            throw new IllegalArgumentException();
        }
        return fibHelp(1, 0, n);
    }

    public int fibHelp(int startNum, int sumSoFar, int numTimes){
        if (numTimes == 0){
            return sumSoFar;
        }
        return fibHelp(startNum + sumSoFar, startNum, numTimes - 1);
    }

    //1.1c
    public double sqrt(double n){
        if (n < 0){
            throw new IllegalArgumentException();
        }

    }

    public double guess(double n) {
        
        return null;
    }

    public boolean goodGuess(double n){

    }


    public static void main(String[] args) {
        Recursion recurse = new Recursion();
        //System.out.println(recurse.fact(-1));
        //System.out.println(recurse.fib(10));

    }

}