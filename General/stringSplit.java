import java.util.Arrays;

public class stringSplit {
    public static void main(String[] args) {
        String str = "Gizem Çırıkka Cenk Çırıkka Atak Çırıkka Bıdık Çırıkka";
        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words));

        for(String string : words) {
            if(string.equals("Çırıkka") ){
                string = "";
                System.out.println(string);
            }else{
                System.out.println(string);

            }     
            
        }
    }
}
