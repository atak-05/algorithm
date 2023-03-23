/**
 * Data Type :
 * int : tamsayi
 * String : metinler
 * double : ondalıklı
 * boolean : true-false
 * 
 * "\\" --> böyle bir ifade de sadece "\" bu görünür. İlk "\" görünmez!
 * "\t" --> bir tab boşluk bırakır
 * "\n" --> Bir alt satıra geçer
 */

public class dataType {
    public static void main(String[] args) {
        String name = "Gizem ", lastName = "Çırıkka";
        int numberOfChildren = 3;
        double weight = 75.0;
        boolean isMarried = true;

        System.out.println("Name: " + name +"\n"+ "Last Name: " + lastName + "\n"+ "Number Of Children: " + numberOfChildren + "\n"+ "Weight: \t " + weight + "\n"+ "IsMarried: \t " + isMarried);


    }
}
