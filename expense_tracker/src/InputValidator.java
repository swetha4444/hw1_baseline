import java.util.Arrays;

/**
 * The InputValidator class validates user input.
 */
public class InputValidator {
	//Check constants
	static int MIN_AMOUNT = 0;
	static int MAX_AMOUNT = 1000;
	static String[] categories = {"food", "travel", "bills", "entertainment", "other"};

	//Error Messages
	static String amountError = "Amount not in range";
	static String categoryError = "Invalid category inputted, please input a category among: \"food\", \"travel\", \"bills\", \"entertainment\", \"other\".";

	//Creating Amount Validator
	public static boolean checkAmountParser(double amount) throws InvalidAmountException {
		if(amount < MIN_AMOUNT || amount > MAX_AMOUNT){
				throw new InvalidAmountException(amountError);
			}
			return true;
	}
	//Creating Category Validator
	public static boolean checkCategoryParser(String category) throws  InvalidCategoryException{
		if (Arrays.stream(categories).anyMatch(c -> c.equalsIgnoreCase(category))) {
            return true;
        }
        throw new InvalidCategoryException(categoryError);
	}
	
}