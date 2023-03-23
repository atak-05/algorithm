public class stringCompare {
    public static void main(String[] args) {
        String user = "admin";
        String password = "1334";

        if (user.equals("admin")&& password.equals("1234")) {
            System.out.println("Welcome to " + user );
        }else{
            System.out.println("Wrong username or password");
        }
    }
}
