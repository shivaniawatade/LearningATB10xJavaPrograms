package Interview_questions;

public class DurationParser {
    public static void main(String[] args) {
        String duration = "1hr 5min 6s 10ms";
        double result = calculateMinutes(duration);
        System.out.println("Total minutes: " + String.format("%.2f", result));
    }

    public static double calculateMinutes(String duration) {
        double totalMinutes = 0;

        // Split the string by space
        String[] parts = duration.split(" ");

        for (String part : parts) {
            if (part.contains("hr")) {
                // Extract number from "1hr"
                double hours = Double.parseDouble(part.replace("hr", ""));
                totalMinutes += hours * 60;
            }
            else if (part.contains("min")) {
                // Extract number from "5min"
                double minutes = Double.parseDouble(part.replace("min", ""));
                totalMinutes += minutes;
            }
            else if (part.contains("s") && !part.contains("ms")) {
                // Extract number from "6s"
                double seconds = Double.parseDouble(part.replace("s", ""));
                totalMinutes += seconds/60;
            }
            else if (part.contains("ms")) {
                // Extract number from "10ms"
                double milliseconds = Double.parseDouble(part.replace("ms", ""));
                totalMinutes += milliseconds/(1000 * 60);
            }
        }

        return totalMinutes;
    }
}