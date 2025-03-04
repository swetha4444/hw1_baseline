import java.util.Arrays;

public class InputValidator {
	public static boolean checkAmountParser(double amount) throws InvalidAmountException {
		if(amount < 0 || amount > 1000){
				throw new InvalidAmountException("Amount not in range");
			}
			return true;
	}
	
	public static boolean checkCategoryParser(String category) throws  InvalidCategoryException{
		String[] categories = {"food", "travel", "bills", "entertainment", "other"};
		if (Arrays.stream(categories).anyMatch(c -> c.equalsIgnoreCase(category))) {
            return true;
        }
        throw new InvalidCategoryException("Invalid category inputted, please input a category among: \"food\", \"travel\", \"bills\", \"entertainment\", \"other\".");
	}
	
}