import javax.swing.JOptionPane;

public class arraysExamples {
    public static void main(String[] args) {
        int height =Integer.parseInt(JOptionPane.showInputDialog(null,"Number of student"));
        String[] students = new String[height];

        for (int i = 0; i < students.length; i++){
            students[i] = JOptionPane.showInputDialog(null, (i+1)+". Student name: ");

        }
        String message ="";
        for (String string : students){
            message+=string+"\n";
        }

        JOptionPane.showMessageDialog(null, message);
    }
}
