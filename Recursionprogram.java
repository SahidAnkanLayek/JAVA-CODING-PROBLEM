public class Recursionprogram {
        // Function to calculate factorial of a number 
        public static long calculateFactorial(int n) {
            if (n == 0 || n == 1) {
                return 1;
            } else {
                return n * calculateFactorial(n - 1);
            }
        }
    

    // Function to calculate HCF (GCD) using recursion
    public static int calculateHCF(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return calculateHCF(b, a % b);
        }
    }

    // Function to calculate LCM using recursion
    public static int calculateLCM(int a, int b) {
        // LCM * HCF = a * b
        return (a * b) / calculateHCF(a, b);
    }

    public static void main(String[] args) {
        int num1 = 24;
        int num2 = 18;

        int hcf = calculateHCF(num1, num2);
        int lcm = calculateLCM(num1, num2);

        System.out.println("HCF of " + num1 + " and " + num2 + " is " + hcf);
        System.out.println("LCM of " + num1 + " and " + num2 + " is " + lcm);




            int number = 5; 
            long factorial = calculateFactorial(number);
            System.out.println("Factorial of " + number + " is " + factorial);


       
        }


































    }


