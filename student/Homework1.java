package student;

public class Homework1 {

    public double shippingCalculator(int n){
       public static double calculateShippingCost(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 10.95;
        } else {
            return 10.95 + (n - 1) * 2.95;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of items purchased: ");
        int n = scanner.nextInt();

        double shippingCost = calculateShippingCost(n);

        System.out.println("Shipping cost: $" + shippingCost);
    }
        return 0;
    }
    public boolean isValidTriangle(int a, int b, int c){
        //TODO Write your code here for problem 2
        return false;

    }
    public boolean isPrime(int number){
        //TODO Write your code here for problem 3
        return false;
    }

    public  int hex2int(String hex) {
        //TODO Write your code here for problem 4
        return 0;
    }
    public String int2hex(int value) {
        //TODO Write your code here for problem 4
        return "";
    }


}
