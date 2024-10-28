package Junior.Final;
import java.util.Map;
import java.util.TreeMap;

class TreeMapExample {
    public static void main(String[] args) {
        simpleTree();
        mapToTreeMap();
        treeMapWithComparator();
        treeMapExample();
    }

    public static void simpleTree() {
        Map<Integer, String> tmap = new TreeMap<>();
        tmap.put(20, "A");
        tmap.put(10, "B");
        tmap.put(-1, "C");
        tmap.put(23, "D");
        tmap.put(4, "E");
        tmap.put(19, "F");
        tmap.put(19, "H"); // update

        System.out.println("19: " + tmap.get(19));
        System.out.println("-1: " + tmap.get(-1));
    }

    public static void mapToTreeMap() {
        Map<Integer, String> map = new TreeMap<>();
        map.put(20, "A");
        map.put(10, "B");
        map.put(-1, "C");
        map.put(23, "D");
        map.put(4, "E");
        map.put(19, "F");
        System.out.println(map);
        Map<Integer, String> tmap = new TreeMap<>(map);
        System.out.println(tmap);
    }

    public static void treeMapWithComparator() {
    }
    public static void treeMapExample() {
        TreeMap<Student, Integer> tmap = new TreeMap<>();

        Student student1 = new Student(123, "Joe");
        Student student2 = new Student(124, "Alice");
        Student student3 = new Student(101, "Bob");

        tmap.put(student1, 20);
        tmap.put(student2, 25);
        tmap.put(student3, 30);
        for (Map.Entry<Student, Integer> entry : tmap.entrySet()) {
            Student student = entry.getKey();
            int value = entry.getValue();
            System.out.println(student + " - Score: " + value);
        }
    }

    static class Student implements Comparable<Student> {
        private int id;
        private String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }
        public int compareTo(Student other) {
            return Integer.compare(this.id, other.id);
        }

        public String toString() {
            return "Student [id=" + id + ", name=" + name + "]";
        }
    }
}
