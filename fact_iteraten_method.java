// Java program to find factorial of given number
class iterativefunc {
    // Method to find the factorial of a given number
    static int factorialUsingIteration(int n)
    {
        int res = 1, i;

        // using iteration
        for (i = 2; i <= n; i++)
            res *= i;

        return res;
    }

    // Driver method
    public static void main(String[] args)
    {
        int num = 7;
        System.out.println("Factorial of " + num
                + " using Iteration is: "
                + factorialUsingIteration(7));
    }
}

