package HM.part14.task_05;

/**
 * Created by Aleksandr_Svibovich on 11/30/2018.
 */
public class UnsynchBankTest {
    private static final int INITIAL_BALLANCE = 1000;
    private static final int NACCOUNTS = 100;

    public static void main(String[] args) {
        Bank b = new Bank(NACCOUNTS, INITIAL_BALLANCE);
        for (int i = 0; i <NACCOUNTS ; i++) {
            TransferRunnable r = new TransferRunnable(b,i,INITIAL_BALLANCE);
            Thread t = new Thread(r);
            t.start();
        }
    }
}
