package Junior.Final;

import java.util.Comparator;
import java.util.PriorityQueue;

class Student {
    private final String name;
    private final int id;
    private final boolean isAthlete;
    private final double gpa;

    public Student(String name, int id, boolean isAthlete, double gpa) {
        this.name = name;
        this.id = id;
        this.isAthlete = isAthlete;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public boolean isAthlete() {
        return isAthlete;
    }

    public double getGpa() {
        return gpa;
    }
}

class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if (s1.isAthlete() && !s2.isAthlete()) {
            return -1;
        } else if (!s1.isAthlete() && s2.isAthlete()) {
            return 1;
        } else {
            int gpaComparison = Double.compare(s2.getGpa(), s1.getGpa());
            if (gpaComparison != 0) {
                return gpaComparison;
            } else {
                return Integer.compare(s1.getId(), s2.getId());
            }
        }
    }
}

public class scholarshipTest {
    public static void main(String[] args) {
        PriorityQueue<Student> scholarshipQueue = new PriorityQueue<>(new StudentComparator());

        scholarshipQueue.add(new Student("Jack", 1001, true, 3.3));
        scholarshipQueue.add(new Student("Jim", 1002, false, 3.7));
        scholarshipQueue.add(new Student("Bob", 1005, true, 3.8));
        scholarshipQueue.add(new Student("Brian", 1009, true, 3.3));
        scholarshipQueue.add(new Student("Annie", 1014, false, 3.1));
        scholarshipQueue.add(new Student("Mike", 1020, false, 2.9));
        scholarshipQueue.add(new Student("Mary", 1021, false, 3.7));
        scholarshipQueue.add(new Student("Dona", 1030, true, 3.2));

        int studentsToAward = 3;
        for (int i = 0; i < studentsToAward; i++) {
            Student student = scholarshipQueue.poll();
            assert student != null;
            System.out.println(student.getName() + ", " + student.getId() + ", " +
                    (student.isAthlete() ? "athlete" : "non-athlete") + ", " +
                    student.getGpa());
        }
    }
}

