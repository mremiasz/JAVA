public class Factorial {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        int factArg = 12;

        int result = f.factorial(factArg);

        System.out.println("Silnia z " + factArg + " : " + result);
    }

    private int factorial(int n) {
        return n > 1 ? n*factorial(n-1): 1;
    }
}
