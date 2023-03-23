import javax.swing.JOptionPane;

public class errorCatching {
    public static void main(String[] args) {
        //****************** try-catch method ******************************/
        int number1 = Integer.parseInt(JOptionPane.showInputDialog(null, "1.Number :"));
        int number2 = Integer.parseInt(JOptionPane.showInputDialog(null, "1.Number :"));

        double result;

    try {
       result =  number1/number2;
       JOptionPane.showMessageDialog(null, number1 + "/" + number2 + " = " + result);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Hata! \n " + e);
    }
    

}
}
