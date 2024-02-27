public class Main {
    public static void main(String[] args) {
        BmiService calculate = new BmiService();
        int bmi = calculate.weight(98, 1.87);
        System.out.println("индекс массы тела = " + bmi);
    }
}
