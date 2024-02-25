public class BmiService {
    public int r (double kg, double sm) {
        double index;
        index = kg / (sm * sm);
        return (int) index;
    }


}

