import java.util.HashMap;
import java.util.Map;

public class AtmOperationImpl implements AtmOperationInter {
    ATM atm = new ATM();
    Map<Double, String> miniState = new HashMap<>();

    @Override
    public void viewBalance() {
        System.out.println("Available Balance is: " + atm.getBalance());
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if (atm.getBalance() - withdrawAmount < 0) {
            System.out.println("Insufficient Balance !!");
        } else {
            atm.setBalance(atm.getBalance() - withdrawAmount);
            System.out.println("Congrats, Withdraw Successful \n Collect Your Cash: " + withdrawAmount);
            miniState.put(withdrawAmount, " Withdraw Amount");
            viewBalance();
        }
    }

    @Override
    public void depositMoney(double depositMoney) {
        miniState.put(depositMoney, " Deposited Money");
        System.out.println(depositMoney + " Deposit Successful !!");
        atm.setBalance(atm.getBalance() + depositMoney);
        viewBalance();
    }

    @Override
    public void viewMiniStatement() {
        for (Map.Entry<Double, String> m : miniState.entrySet()) {
            System.out.println(m.getKey() + "" + m.getValue());
        }
    }
}
