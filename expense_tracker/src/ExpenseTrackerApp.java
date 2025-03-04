import javax.swing.table.DefaultTableModel;

/**
 * The ExpenseTrackerApp class allows users to add/remove daily transactions.
 */
public class ExpenseTrackerApp {

  public static void main(String[] args) {
    
    // Create MVC components
    DefaultTableModel tableModel = new DefaultTableModel();
    tableModel.addColumn("Serial");
    tableModel.addColumn("Amount");
    tableModel.addColumn("Category");
    tableModel.addColumn("Date");
    

    
    ExpenseTrackerView view = new ExpenseTrackerView(tableModel);

    // Initialize view
    view.setVisible(true);

    // Handle add transaction button clicks
    view.getAddTransactionBtn().addActionListener(e -> {
      
      // Get transaction data from view
      double amount = view.getAmountField(); 
      String category = view.getCategoryField();
      
      //Adding Input Validators
      try {
          InputValidator.checkAmountParser(amount);
          InputValidator.checkCategoryParser(category);
      } catch (InvalidAmountException invalidAmountException) {
          //Display error
          view.displayError(invalidAmountException.getMessage());
          invalidAmountException.printStackTrace();
          return;
      } catch (InvalidCategoryException invalidCategoryException) {
          //Display
          view.displayError(invalidCategoryException.getMessage());
          invalidCategoryException.printStackTrace();
          return;
      }

      // Create transaction object
      Transaction t = new Transaction(amount, category);

      // Call controller to add transaction
      view.addTransaction(t);
    });

  }

}