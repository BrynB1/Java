package Junior.Final;
import java.util.Comparator;
import java.util.PriorityQueue;
/*
Thank you professor. Although this was a very short class I am glad that I had you as my teacher. Both you and Vincent helped
me with the assignments I didn't understand. I hope one day in the future I will have you as my professor again.
Thanks,
Bryn
 */
class Student2 {
    private final String name;
    private final int id;
    private final double gpa;
    private final int creditsLeft;
    public Student2(String name, int id, double gpa, int creditsLeft) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
        this.creditsLeft = creditsLeft;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getGpa() {
        return gpa;
    }

    public int getCreditsLeft(){
        return creditsLeft;
    }
}
class gradeComparator implements Comparator<Student2> {
    public int compare(Student2 s1, Student2 s2) {
        if (s1.getCreditsLeft() > s2.getCreditsLeft()) {
            return 1;
        }
        else if(s1.getCreditsLeft() < s2.getCreditsLeft()){
            return -1;
        }
        else {
            int gpaComparison = Double.compare(s2.getGpa(), s1.getGpa());
            if (gpaComparison != 0) {
                return gpaComparison;
            }
            else {
                return Integer.compare(s1.getId(), s2.getId());
            }
        }
    }

    public static class gradeQueue {
        public static void main(String[] args) {
            PriorityQueue<Student2> gradeQueue = new PriorityQueue<>(new gradeComparator());
            gradeQueue.add(new Student2("Jack", 1001, 3.3, 56));
            gradeQueue.add(new Student2("Jim", 1002, 3.7, 36));
            gradeQueue.add(new Student2("Bob", 1003, 3.8, 42));
            gradeQueue.add(new Student2("Brian", 1004, 3.3, 36));
            gradeQueue.add(new Student2("Annie", 1005, 3.1, 18));
            gradeQueue.add(new Student2("Katie", 1006, 3.8, 42));
            gradeQueue.add(new Student2("Mike", 1007, 2.9, 68));
            gradeQueue.add(new Student2("Mary", 1008, 3.7, 71));
            gradeQueue.add(new Student2("Dona", 1009, 3.2, 92));
            for (int i = 0; i < 9; i++) {
                Student2 student2 = gradeQueue.poll();
                assert student2 != null;
                System.out.println(student2.getName() + ", " + student2.getId() + ", Credits Left: " + student2.getCreditsLeft()+ ", GPA: " +
                        student2.getGpa());
            }
        }
    }
}

