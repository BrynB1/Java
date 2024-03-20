package Junior;
import java.util.LinkedList;
import java.util.Queue;

class Transaction {
    int shares;
    int price;

    public Transaction(int shares, int price) {
        this.shares = shares;
        this.price = price;
    }
}

public class stockCalc {

    public static int calcshares(Queue<Transaction> transactions, int sellShares, int sellPrice) {
        int capitalGain = 0;
        while (sellShares > 0 && !transactions.isEmpty()) {
            Transaction transaction = transactions.peek();
            int sell = Math.min(sellShares, transaction.shares);
            if (transaction.shares == sell) {
                transactions.poll();
            } else {
                transaction.shares -= sell;
            }
            int gainOrLoss = (sellPrice - transaction.price) * sell;
            capitalGain += gainOrLoss;
            sellShares -= sell;

            // Print transactions
            if (gainOrLoss >= 0) {
                System.out.println("Sold " + sell + " shares at $" + sellPrice + " each.");
            } else {
                System.out.println("Sold " + sell + " shares at $" + sellPrice + " each.");
            }
        }

        return capitalGain;
    }

    public static void main(String[] args) {
        Queue<Transaction> shares = new LinkedList<>();

        // Buy shares
        shares.add(new Transaction(20, 24));
        shares.add(new Transaction(200, 36));

        // Sell shares
        int sellShares = 150;
        int sellPrice = 30;

        // Print Shares / Total Capital Gain
        System.out.println("Bought Shares:");
        for (Transaction transaction : shares) {
            System.out.println("Bought " + transaction.shares + " shares at $" + transaction.price + " each.");
        }
        System.out.println("\nSold Shares:");
        int capitalGain = calcshares(shares, sellShares, sellPrice);
        System.out.println("\nTotal Capital Gain: $" + capitalGain);
    }
}
