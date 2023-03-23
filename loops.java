import java.util.Random;

import javax.swing.JOptionPane;

/**
 * For -Each
 * While
 * 
 */


public class loops {
    public static void main(String[] args) {
            //******************************* for loop ******************************************** */

        // for (int i = 0; i <= 100; i++) {
        //     if (i%2 == 0) {
        //         System.out.println(i);
        //     }
            
        // }
            //******************************* while loop ******************************************** */

            // Random random = new Random();
            // int number = random.nextInt(49);
            // int maxChoice = 3;
            
            // while (maxChoice >0 ) {
            //     int sayNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Number Prediction /n"+ "You have to choice :" + maxChoice  ));
            //     if(sayNumber == number){
            //         JOptionPane.showMessageDialog(null, "You are right! You win!!!" );
            //         System.exit(0);
            //     }else{
            //         JOptionPane.showMessageDialog(null, "You are wrong");
            //         maxChoice--;
                    
            //     }
            // }
            // JOptionPane.showMessageDialog(null, "You are done! You can come again tomorrow!");
            //******************************* Do while loop ******************************************** */
            //* şartı sağlamasa bile en az bir kere döndürülür.. */

            Random random = new Random();
            int number = random.nextInt(49);
            int maxChoice = 3;
            
            do{
                int sayNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Number Prediction /n"+ "You have to choice :" + maxChoice  ));
                if(sayNumber == number){
                    JOptionPane.showMessageDialog(null, "You are right! You win!!!" );
                    System.exit(0);
                }else{
                    JOptionPane.showMessageDialog(null, "You are wrong");
                    maxChoice--;
                    
                }
            }while (maxChoice >0 ) ;
            JOptionPane.showMessageDialog(null, "You are done! You can come again tomorrow!");



    }
}