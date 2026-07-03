import java.util.Random;

public class NaroRainfallTracker {
    public static void main(String[] args) {
        double[] dailyRainfall = new double[30];
        Random random = new Random();
        
        double totalRainfall = 0;
        int wetDaysCount = 0;

        // 1. Generate 30 random daily rainfall readings between 0 and 60 mm
        for (int i = 0; i < dailyRainfall.length; i++) {
            dailyRainfall[i] = random.nextDouble() * 60.0;
            totalRainfall += dailyRainfall[i];
            
            // 3. Counts and reports the number of “wet days” (> 30 mm)
            if (dailyRainfall[i] > 30.0) {
                wetDaysCount++;
            }
        }

        // 2. Computes total and average monthly rainfall
        double averageRainfall = totalRainfall / dailyRainfall.length;

        System.out.printf("Total Monthly Rainfall: %.2f mm\n", totalRainfall);
        System.out.printf("Average Daily Rainfall: %.2f mm\n", averageRainfall);
        System.out.println("Total Number of Wet Days: " + wetDaysCount);

        // 4. If-else-if classification logic
        String classification;
        if (totalRainfall <= 300.0) {
            classification = "Dry";
        } else if (totalRainfall < 600.0) {
            classification = "Normal";
        } else {
            classification = "Flood-risk";
        }
        
        System.out.println("Monthly Weather Classification: " + classification);
    }
}