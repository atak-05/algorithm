import java.util.HashMap;;
public class mapping {
    public static void main(String[] args) {
        
        HashMap students = new HashMap<>();

        System.out.println(students);
        students.put("id" ,0);
        students.put("name" ,"Cenk Çırıkka");
        students.put("heigt" ,"1.95");
        students.put("weight" ,"95");

        System.out.println(students.size());
        System.out.println(students);
        System.out.println(students.get("name"));

    }
}
