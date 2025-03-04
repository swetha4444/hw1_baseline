public class InputValidator {
	public static boolean checkAmountParser(double amount) {
		try {
			if(amount > 0 && amount < 1000)
				return True;
			else
				throw new InvalidAmountException("Amount not in range")
		}catch(Exception e) {
			throw new InvalidAmountException("Amount must be a valid number.");
			return False;
		}
	}
	
	public static boolean checkCategoryParser(String category) {
		String[] categories = {"food", "travel", "bills", "entertainment", "other"};
		if (Arrays.stream(categories).anyMatch(c -> c.equalsIgnoreCase(category))) {
            return true;
        }
        throw new InvalidCategoryException("Invalid category inputted, please input a category among: \"food\", \"travel\", \"bills\", \"entertainment\", \"other\".");
        return False;
	}
	
}