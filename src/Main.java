public class Main {
    public static void main(String[] args) {
        BmiService bmiService = new BmiService();
        double result = bmiService.calculate(100, 1.8);
        System.out.println(result);
    }
}
