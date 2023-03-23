import java.time.LocalDateTime;

// import java.util.Random;
// import java.util.Scanner;

public class decisionStructures {
    
    public static void main(String[] args) {
        // Random random = new Random();
        // Scanner scanner = new Scanner(System.in);
        // int number;
        // System.out.println("Write a number : ");
        // number = scanner.nextInt();
        
        // if (number%2 == 0) {
        //     System.out.println(number + " is a even number.");
        // }else{
        //     System.out.println(number + " is  a odd number.");

        // }
        // scanner.close();
            LocalDateTime now = LocalDateTime.now();
            // System.out.println(now);
            int month = now.getMonthValue();
            switch (month) {
                case 1|2|3 :
                    System.out.println("The Winter");
                    break;
                case 4|5 :
                    System.out.println("The Spring");
                    break;
                case 6|7|8 :
                    System.out.println("The Summer");
                    break;
                case 9|10|11:
                    System.out.println("The Fall");
                default:
                    break;
            }

        System.exit(0);
    }
}
