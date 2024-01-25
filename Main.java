package CompulsoryTask2;

public class Main {

	public static void main(String[] args) {
		

		Customer customer = new Customer("Leweng", "Makgopa", "Durban", "ABC123", "0790900240", "967 Brook Road Weltevreden Park", "Lewengm@icloud.com",
				"Mozambik", "Roodepoort", "011-529-6677", 5, "Pizza", 500, "Remove Tomatoes", 5000);
		
		Driver driver = new Driver("Leweng", "Makgopa", "Durban", "ABC123", 3);
		
		System.out.println(customer.getCustomerInvoice());
		System.out.println("\n");
		driver.findNearestDriver();
		
		
	}

}
