interface AdvancedArithmetic {
    int divisor_sum(int n); 
}


class MyCalculator implements AdvancedArithmetic {
    public int divisor_sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {  
                sum += i;
            }
        }
        return sum;
    }
}


public class DivisorSumDemo {
    public static void main(String[] args) {
        MyCalculator calc = new MyCalculator();
        int number = 12;  
        System.out.println("Sum of divisors of " + number + " = " + calc.divisor_sum(number));
    }
}
