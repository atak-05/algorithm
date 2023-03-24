import java.util.ArrayList;;


public class arrayClass {
    public static void main(String[] args) {
        ArrayList students = new ArrayList<>();
        System.out.println(students);
        students.add("Cenk Çırıkka");
        System.out.println(students);    
        students.add("Gizem Çırıkka");
        System.out.println(students);
        System.out.println(students.size());
        System.out.println(students.get(0));
        students.remove(0);
        System.out.println(students);
        students.remove("Gizem Çırıkka");
        System.out.println(students);

    }
}
