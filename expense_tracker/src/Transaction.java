import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Represents a transaction in the Expense Tracker application.
 * A transaction consists of an amount, a category, and a timestamp.
 */
public class Transaction {

    private double amount;       // The amount of the transaction.
    private String category;     // The category of the transaction.
    private String timestamp;   // The timestamp when the transaction was created.

    /**
     * Creates a new transaction with the specified amount and category.
     *
     * @param amount   The amount of the transaction.
     * @param category The category of the transaction.
     */
    public Transaction(double amount, String category) {
        this.amount = amount;
        this.category = category;
        this.timestamp = generateTimestamp();
    }

    /**
     * Returns the amount of the transaction.
     *
     * @return The amount of the transaction.
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Sets the amount of the transaction.
     *
     * @param amount The new amount to set for the transaction.
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * Returns the category of the transaction.
     *
     * @return The category of the transaction.
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the category of the transaction.
     *
     * @param category The new category to set for the transaction.
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Returns the timestamp of the transaction.
     *
     * @return The timestamp of the transaction in "dd-MM-yyyy HH:mm" format.
     */
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * Generates a timestamp for the transaction using the current date and time.
     *
     * @return The generated timestamp in "dd-MM-yyyy HH:mm" format.
     */
    private String generateTimestamp() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm");
        return sdf.format(new Date());
    }
}