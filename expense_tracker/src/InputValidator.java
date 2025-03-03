public class InputValidator {
	public static boolean checkAmountParser(double amount) {
		try {
			return amount > 0 && amount < 1000;
		}catch(Exception e) {
			return false;
		}
	}
	
	public static boolean checkCategoryParser(String category) {
		String[] categories = {"food", "travel", "bills", "entertainment", "other"};
		try {
			return Arrays.steam(categories).anyMatch(c->c.equalsIgnoreCase(category));
		}catch(Exception e) {
			return false;
		}
	}
	
}