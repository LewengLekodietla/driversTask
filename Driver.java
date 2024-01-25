package CompulsoryTask2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

//Created the Driver Class and object that inherits from the Person Class
public class Driver extends Person {

	int currentLoad;

	public Driver(String firstName, String lastName, String cityLocation, String orderNumber, int currentLoad) {

		super(firstName, lastName, cityLocation, orderNumber);

		this.currentLoad = currentLoad;

	}

	//The method to find the driver nearest to the customer based on the city location
	public void findNearestDriver() {
		//Created and stored the file object to allow reading of contents at any given point in time
		File driverLocationFile = new File("/Users/sirlewengmakgopa/Library/CloudStorage/Dropbox/LM22110005904 (1)/2. Advanced Programming Concepts/L2T07/drivers.txt");

		try {
			//Scanner class created to allow reading of contents
			Scanner readingDriverFile = new Scanner(driverLocationFile);
			//String array intended to store driver names, each at an index point
			String[] driverArray = new String[30];
			//Below variable intends to store a variable that can be used to compare the customer's city location to that of the driver
			String customer = 
			
			while(readingDriverFile.hasNextLine()) {

				for(int i = 0; i < driverArray.length; i++) {
					
					driverArray[i] += "\n" + readingDriverFile.nextLine();
					if(driverArray[i].equals());
				}
				
				//System.out.println(readingDriverFile.nextLine());

			}
			System.out.println(Arrays.toString(driverArray));
			readingDriverFile.close();
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
