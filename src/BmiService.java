public class BmiService {
    public int calculate(float weightInKg, float heightInMeters) {
        return (int) (weightInKg / Math.pow(heightInMeters, 2));
    }
}
