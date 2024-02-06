import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AtmOperationInter op = new AtmOperationImpl();

        int atmNumber = 12345;
        int atmPin = 1520;
        Scanner scn = new Scanner(System.in);
        System.out.println("----------Welcome to ATM Machine--------");
        System.out.print("Enter ATM Number : ");
        int atmNumberInput = scn.nextInt();
        System.out.print("Enter ATM Pin : ");
        int pin = scn.nextInt();
        if (atmNumberInput == atmNumber && pin == atmPin) {
            while (true) {
                System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Deposit Money\n4.View Mini Statement\n5.Exit");
                System.out.println("Enter Your Choice : ");
                int choice = scn.nextInt();
                if (choice == 1) {
                    op.viewBalance();
                } else if (choice == 2) {
                    System.out.println("Enter Withdraw Amount : ");
                    double withdraw = scn.nextDouble();
                    op.withdrawAmount(withdraw);
                } else if (choice == 3) {
                    System.out.println("Enter Deposit Money : ");
                    double depositMoney = scn.nextDouble();
                    op.depositMoney(depositMoney);
                } else if (choice == 4) {
                    op.viewMiniStatement();
                } else if (choice == 5) {
                    System.out.println("Collect Your ATM card \n Thank You For Visiting ATM Machine.");
                    System.exit(0);
                } else {
                    System.out.println("Please Enter Valid Choice : ");
                }
            }
        } else {
            System.out.println("Check Your ATM pin OR ATM Number !!");
            System.exit(0);
        }
    }
}
