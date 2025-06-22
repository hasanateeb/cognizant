package week1.FinancialForecast;

import java.util.HashMap;

public class OptimizedForecast {
    private static HashMap<Integer, Double> cache = new HashMap<>();

    public static double forecast(double currentValue, double growthRate, int years) {
        if (years == 0) return currentValue;

        if (cache.containsKey(years)) {
            return cache.get(years);
        }

        double result = forecast(currentValue, growthRate, years - 1) * (1 + growthRate);
        cache.put(years, result);
        return result;
    }
}
