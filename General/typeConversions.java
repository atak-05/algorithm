public class typeConversions {
    public static void main(String[] args) {

        //String to Integer
        String strNumber = "5";
        int number1 = Integer.parseInt(strNumber);
        System.out.println(number1);

        //Integer to String
        strNumber= Integer.toString(number1);
        System.out.println(strNumber);

        //String to Double
        double number2 = Double.parseDouble(strNumber);
        System.out.println(number2);


        //Double to Integer
        int number4 = (int) number2;
        System.out.println(number4);

        //Integer to Double
        int number5 = (int) number4;
        System.out.println(number5);

    }
}
