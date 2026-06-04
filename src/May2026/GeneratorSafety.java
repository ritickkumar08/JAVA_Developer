package May2026;

public class GeneratorSafety {

    /**
     * Returns the minimum number of generators to switch off so that
     * no two adjacent generators both exceed the safe temperature threshold.
     *
     * For each contiguous block of n "hot" generators, the minimum
     * removals needed is floor(n / 2).
     *
     * @param temperatures array of generator temperatures
     * @param threshold    safe temperature limit (inclusive)
     * @return minimum generators to switch off
     */
    public static int minSwitchOff1(int[] temperatures, int threshold) {
        int totalSwitchOff = 0;
        int blockSize = 0;

        for (int i = 0; i < temperatures.length; i++) {
            if (temperatures[i] > threshold) {
                blockSize++;
            } else {
                // End of a hot block — apply floor(n / 2)
                totalSwitchOff += blockSize / 2;
                blockSize = 0;
            }
        }

        // Handle a hot block at the end of the array
        totalSwitchOff += blockSize / 2;

        return totalSwitchOff;
    }
    public static int minSwitchOff(int[] temperatures, int threshold) {
        int totalSwitchOff = 0;
        int count = 0;

        for (int i = 0; i < temperatures.length; i++) {
            if (temperatures[i] > threshold) {
                count++;
                if(count % 2 == 0){
                    totalSwitchOff++;
                }
            }
        }

        // Handle a hot block at the end of the array
//        totalSwitchOff += blockSize / 2;

        return totalSwitchOff;
    }

    public static void main(String[] args) {
        // Example: temperatures, threshold = 70
        int[] temps = {80, 90, 85, 60, 95, 88, 92, 87, 50, 75, 78};
        int threshold = 70;

        System.out.println("Temperatures: ");
        for (int i = 0; i < temps.length; i++) {
            System.out.printf("  G%d: %d°  (%s)%n", i, temps[i],
                    temps[i] > threshold ? "HOT" : "safe");
        }

        int result = minSwitchOff(temps, threshold);
        System.out.println("\nThreshold: " + threshold);
        System.out.println("Minimum generators to switch off: " + result);

        // Additional test cases
        System.out.println("\n--- More test cases ---");

        // All hot: [90, 90, 90, 90, 90] → floor(5/2) = 2
        int[] allHot = {90, 90, 90, 90, 90};
        System.out.println("All 5 hot       → switch off: " + minSwitchOff(allHot, 70)); // 2

        // Alternating: [90, 50, 90, 50] → 0 (no adjacent hot pair)
        int[] alternating = {90, 50, 90, 50};
        System.out.println("Alternating     → switch off: " + minSwitchOff(alternating, 70)); // 0

        // Two hot adjacent: [90, 90] → 1
        int[] pair = {90, 90};
        System.out.println("One pair        → switch off: " + minSwitchOff(pair, 70)); // 1

        // Single hot: [90] → 0
        int[] single = {90};
        System.out.println("Single hot      → switch off: " + minSwitchOff(single, 70)); // 0

        // Empty array
        int[] empty = {};
        System.out.println("Empty array     → switch off: " + minSwitchOff(empty, 70)); // 0
    }
}