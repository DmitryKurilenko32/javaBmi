public class Main {
    public static void main(String[] args) {
        BmiService calculate = new BmiService();
        int index = calculate.bmi(98, 1.87);
        System.out.println("индекс массы тела = " + index);
    }
}
