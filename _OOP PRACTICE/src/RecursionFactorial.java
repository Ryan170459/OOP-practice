public class RecursionFactorial {
    int n=0;

    public static int factorial(int n){
        int fact=1;
        if (n>1)
            fact = factorial(n-1)*n;
        return fact;
}

    public static void main(String[] args) {
        System.out.println("Fibonnaci of 4 is "+factorial(4));
    }

}
