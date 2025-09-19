import java.util.Scanner;

public class BankingProgram {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        double balance = 1254.8937;
        int choice;
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("........................");
            System.out.println("Banking Programme!");
            System.out.println("........................");
            System.out.println("Choice 1: Check Balance");
            System.out.println("Choice 2: Deposit ");
            System.out.println("Choice 3: Withdraw ");
            System.out.println("Choice 4: Exit ");
            System.out.println("........................");

            System.out.print("Enter A Choice(1-4): ");
            choice = sc.nextInt();
            System.out.println("Pls Enter 4 When You Are Done");

            switch (choice) {
                case 1 -> balanceCheck(balance);
                case 2 -> System.out.println("Your New Balance is : "+(balance+=depositCase()));
                case 3 -> System.out.println(balance-=withdrawCase(balance));
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid Choice!");
            }
        }
        System.out.println("...............................");
        System.out.println("Thank You! Have A Niece Day");
        System.out.println("...............................");
    }

    public static void balanceCheck(double balance) {
        System.out.printf("$%.3f\n", balance);
    }

    public static double depositCase() {

        System.out.print("Enter Amount of Money You Want To Deposit : ");
         double deposit =sc.nextDouble();
         if(deposit<=0){
            System.out.println("Invalid Amount!");
            return 0;
        }
        else {
            return deposit;
        }
    }
    public static double withdrawCase(double balance){
        System.out.print("Enter Ammount of Money You Want To Withdraw:");
        double withdraw=sc.nextDouble();
        if(withdraw>balance){
            System.out.println("Insufficient Fund");
            return 0;
        } else if (withdraw<=0) {
            System.out.println("Amount Can't Be O or Negative");
           return 0;
        } else {
            return withdraw;
        }
    }
}