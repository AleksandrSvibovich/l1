package HM.part14.task_05;

/**
 * Created by Aleksandr_Svibovich on 11/30/2018.
 */
public class TransferRunnable implements Runnable {
    private Bank bank;
    private int fromAccount;
    private double maxAmount;
    private int DELAY = 5000;

    public TransferRunnable(Bank b, int from, double max) {
        this.bank = b;
        this.fromAccount = from;
        this.maxAmount = max;
    }

    @Override
    public void run() {
        try {
            while (true) {
                int toAccount = (int) (bank.size() * Math.random());
                double amount = maxAmount * Math.random();
                bank.transfer(fromAccount, toAccount, amount);

                Thread.sleep(DELAY);

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
