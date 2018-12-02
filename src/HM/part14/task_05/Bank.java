package HM.part14.task_05;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Aleksandr_Svibovich on 11/30/2018.
 */
public class Bank {
    private final double[] accounts;
    private Lock bankLock = new ReentrantLock();

    public Bank(int n, double initialBlance) {
        this.accounts = new double[n];
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = initialBlance;
        }
    }

    public void transfer(int from, int to, double amount) {
        bankLock.lock();
        try {
            if (accounts[from] < amount) return;
            System.out.println(Thread.currentThread());
            accounts[from] -= amount;
            System.out.printf(" %10.2f from %d to %d", amount, from, to);
            accounts[to] += amount;
            System.out.printf(" Totla balance: %10.2f%n", getTotalBalance());
        }finally {
            bankLock.unlock();
        }
    }

    public double getTotalBalance() {
        double sum = 0;
        for (double a : accounts) {
            sum += a;
        }
        return sum;
    }

    public int size() {
        return accounts.length;
    }
}
