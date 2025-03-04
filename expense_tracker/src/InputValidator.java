import java.util.Arrays;

public class InputValidator {
	public static boolean checkAmountParser(double amount) throws InvalidAmountException {
		try {
			if(amount > 0 && amount < 1000)
				return true;
			else
				throw new InvalidAmountException("Amount not in range");
		}catch(Exception e) {
			throw new InvalidAmountException("Amount must be a valid number.");
		}
	}
	
	public static boolean checkCategoryParser(String category) throws  InvalidCategoryException{
		String[] categories = {"food", "travel", "bills", "entertainment", "other"};
		if (Arrays.stream(categories).anyMatch(c -> c.equalsIgnoreCase(category))) {
            return true;
        }
        throw new InvalidCategoryException("Invalid category inputted, please input a category among: \"food\", \"travel\", \"bills\", \"entertainment\", \"other\".");
	}
	
}