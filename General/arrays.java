import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        double[] prices = {1.99,2.39,6.13,8.75};
        String[] names = {"Cenk", "Gizem","Atak","Bıdık"};


        System.out.println("*******************");

        System.out.println(Arrays.toString(prices));

        System.out.println("*******************");
        for (int number: numbers) { 
            System.out.println(number);
        }
        System.out.println("*******************");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        
    }
}
