package Project;

import java.util.ArrayList;

import javax.swing.JOptionPane;;

public class SignIn {

    ArrayList students = new ArrayList<>();

    public static void main(String[] args) {
        SignIn a = new SignIn();
        a.start();
    }

    private void start() {
        programMenu();
    }

    private void programMenu() {
        String str = "";
        str += "Yapmak istediğiniz işlem \n";
        str += "******************* \n";
        str += "[0 veya Esc ] Çıkış \n";
        str += "[1] Kayıt Ekle \n";
        str += "[2] Kayıt Sil \n";
        str += "[3] Kayıt Listele \n";

        String choices = JOptionPane.showInputDialog(null, str);

        if (choices == null) {
            choices = "0";

        }
        int choiceNumber = Integer.parseInt(choices);

        switch (choiceNumber) {
            case 0:
                programExit();
                break;
            case 1:
                signIn();
                break;
            case 2:
                delete();
                break;
            case 3:
                list();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Yanlış Seçim 0-3 arası seçim yapınız!");
                this.programMenu();
                break;
        }
    }

    private void list() {
        String message = "";
        message += "Öğrenci Listesi \n";
        message += "***************\n\n";

        for (Object object : students) {
            message+=object+"\n";

        }
        message+="";
        JOptionPane.showMessageDialog(null, message);
        this.programMenu();
    }

    private void delete() {
        String student = JOptionPane.showInputDialog(null, "Öğrenci Adı :");
        if (students.contains(student)) {
            students.remove(student);
            JOptionPane.showMessageDialog(null, "Silme Başarılı");
        } else {
            JOptionPane.showMessageDialog(null, "Böyle bir kayıt yok!");
        }
        this.programMenu();
    }

    private void signIn() {
        String student = JOptionPane.showInputDialog(null, "Öğrenci Adı :");
        if (students.contains(student)) {
            JOptionPane.showMessageDialog(null, "Böyle bir kayıt var!");
        } else {
            students.add(student);
            JOptionPane.showMessageDialog(null, "Kayıt Başarılı ");
        }
        this.programMenu();
    }

    private void programExit() {
        int choices = JOptionPane.showConfirmDialog(null, "Çıkmak istediğinizden emin misiniz!");
        if (choices == 0) {
            System.exit(0);
        } else {
            this.programMenu();
        }

    }

}
