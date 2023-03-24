
// import java.util.Arrays;


public class stringToChar {
    public static void main(String[] args) {
        String str ="Hello World";
        char [] chars = str.toCharArray();

        for (char c : chars) {
            //System.out.println(c);
        }

        // System.out.println(chars);
        // System.out.println(Arrays.toString(chars)); //*[H, e, l, l, o,  , W, o, r, l, d] */

        for (int i = 0; i < str.length(); i++) {
            //System.out.println(str.charAt(i));
        }

        
        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.println(str.charAt(i));
        }
    }
}
