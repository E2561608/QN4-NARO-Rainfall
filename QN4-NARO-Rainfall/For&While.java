public class For&While {

    public static void main(String[] args) {

// For Loop Example
double[] rainfallFor = new double[30];
for (int day = 0; day < 30; day++) {
    rainfallFor[day] = getSensorReading(day); // Predefined boundary loop
}

// While Loop Example
double[] rainfallWhile = new double[30];
int dayCounter = 0;
while (dayCounter < 30) {
    rainfallWhile[dayCounter] = getSensorReading(dayCounter);
    dayCounter++; // Manual index manipulation
}

    }
}

