public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int bmi = service.calculate(57f, 1.68f);
        System.out.println("Индекс массы тела: " + bmi);
    }
}