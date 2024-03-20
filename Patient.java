package Junior;


import java.util.*;

class patients {
    public static void main(String[] args) {
        List<patient> patients = new ArrayList<>();
        patients.add(new patient("John", 2));
        delay();
        patients.add(new patient("Alice", 1));
        delay();
        patients.add(new patient("Bob", 3));
        delay();
        patientComparator comparator = new patientComparator();
        patients.sort(comparator);

        for (patient p : patients) {
            System.out.println(p.getName() + ", ESI: " + p.getESI() + ", Arrival Time: " + p.getArrivalTime());
        }

    }

    public static void delay() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
class patient {
    private final String name;
    private final int ESI;
    private final Date arrivalTime;

    public patient(String name, int ESI) {
        this.name = name;
        this.ESI = ESI;
        this.arrivalTime = new Date();
    }
    public String getName() {
        return name;
    }

    public int getESI() {
        return ESI;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

}