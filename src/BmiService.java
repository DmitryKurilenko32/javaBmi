public class BmiService {
    public int bmi(double kg, double sm) {
        double index;
        index = kg / (sm * sm);
        return (int) index;
    }


}

