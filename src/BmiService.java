public class BmiService {
    public int weight(double kg, double sm) {
        double index;
        index = kg / (sm * sm);
        return (int) index;
    }


}

