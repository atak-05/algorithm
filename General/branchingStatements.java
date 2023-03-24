import javax.swing.JOptionPane;

public class branchingStatements {
    public static void main(String[] args) {
        // //* Break */
        // for (int i = 0; i <5 ; i++) {
        //     for (int j = 0; j < 3 ; j++) {
        //         if(i == 3){
        //             System.out.println("Buradan çıktı");
        //             break; //* hangi döngünün içindeysek onu sonlandırır.*/
        //         }
        //         System.out.println("i value: " + i + "j value: " + j);
        //     }
        //     System.out.println("***********************\n");
        // }
        //  //* Continue */
        //  for (int i = 0; i <5 ; i++) {
        //     for (int j = 0; j < 3 ; j++) {
        //         if(i == 3){
        //             System.out.println("Bu döngüyü geçmektir.");
        //             continue; //* hangi döngünün içindeysek onu belirtilen den birsonrakine devam ettirir..*/
        //         }
        //         System.out.println("i value: " + i + " j value: " + j);
        //     }
        //     System.out.println("***********************\n");
        // }
        //* Return */
        int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Write a number"));
        JOptionPane.showMessageDialog(null,number+ "!=" +faktoriyel(number));

        
        
    }
    private static int faktoriyel(int number){
                int f = 1;
                for(int i = 1; i <= number; i++){
                    f*=i;
                }
                return f;
    }
}