package week1.FinancialForecast;

public class Main {
    public static void main(String[] args) {
        double initialValue = 1000.0; // ₹1000
        double growthRate = 0.1;      // 10% growth
        int years = 5;

        double result = FinancialForecast.forecast(initialValue, growthRate, years);
        System.out.println("Recursive Forecast Value after " + years + " years: ₹" + result);

        double optimizedResult = OptimizedForecast.forecast(initialValue, growthRate, years);
        System.out.println("Optimized Forecast Value after " + years + " years: ₹" + optimizedResult);
    }
}
