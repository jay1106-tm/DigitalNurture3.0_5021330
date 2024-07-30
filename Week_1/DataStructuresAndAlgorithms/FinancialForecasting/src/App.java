public class App {
    public static void main(String[] args) throws Exception {
        double presentValue = 1000.0; 
        double annualGrowthRate = 0.05; 
        int years = 8;
        double futureValue = calculateFutureValue(presentValue, annualGrowthRate, years);
        System.out.println("Future Value after " + years + " years: " + String.format("%.2f", futureValue));
    }

    public static double calculateFutureValue(double presentValue, double growthRate, int years) {
        if (years == 0) {
            return presentValue;
        } else {
            return calculateFutureValue(presentValue*(1+growthRate), growthRate, years-1);
        }
    }
}


/* Understand Recursive Algorithms: 
  1. Explain the concept of recursion and how it can simplify certain problems.
  --> Recursion is when a function calls itself to solve a problem. It breaks down the problem into smaller parts until it reaches the simplest part, called the base case, which can be solved directly.
  --> Recursion makes some problems easier by breaking them down into smaller, similar problems.
  * Factorial Calculation:
  --> Factorial of n (n!) is n×(n−1)!. Base case is 0!=1.
  * Fibonacci Sequence:
  --> Each number is the sum of the two preceding ones. Base cases are F(0)=0 and F(1)=1.
 */

 /* Analysis: 
  1. Discuss the time complexity of your recursive algorithm.
  --> The time complexity of the calculateFutureValue function is O(n), where n is the number of years. This is because the function makes one recursive call per year until it reaches the base case.

  2. Explain how to optimize the recursive solution to avoid excessive computation.
  --> Memoization involves storing the results of expensive function calls and reusing them when the same inputs occur again. This can be applied to our recursive solution to avoid redundant calculations. With memoization, the time complexity remains O(n), but the performance is significantly improved by avoiding repeated calculations.
  */