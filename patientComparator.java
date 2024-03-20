package Junior;
import java.util.Comparator;

public class patientComparator implements Comparator<patient> {
    public int compare(patient a, patient b) {
        int aESI = a.getESI();
        int bESI = b.getESI();
        if (aESI != bESI) {
            return a.getESI()-(b.getESI());
        } else {
            return a.getArrivalTime().compareTo(b.getArrivalTime());
        }
    }
}
