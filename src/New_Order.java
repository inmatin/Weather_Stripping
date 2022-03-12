/*
 *Student Name: Ishtiaque Matin
 *Theory Professor: Leanne Seaward
 *Theory Section Number: CST8116_360
 *Lab Professor: Siju Philip
 *Lab Section Number: CST8116_363
 * Due Date: Oct 8th, 2021
 * Modified: Oct 8th, 2021
 * Description: This class will calculate the order of how many packages of 
 * weather stripping is needed.
 */

//importing class Scanner
import java.util.Scanner;

public class New_Order {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// declaration
		Door_Measurement dm1 = new Door_Measurement();
		Weather_Stripping ws1 = new Weather_Stripping();

		int door;
		double height;
		double width;
		double weather_stripping_package;

		// prompt user to number of door
		System.out.print("How many doors: ");
		door = input.nextInt();

		// set the number of doors
		dm1.setDoor(door);

		// prompt user to enter the height of the door
		System.out.print("What is the height of the door (cm): ");
		height = input.nextDouble();

		// set the height of the door
		dm1.setHeight(height);

		// prompt user to enter the width of the door
		System.out.print("What is the width of the door (cm): ");
		width = input.nextDouble();

		// set the width of the door
		dm1.setWidth(width);

		// prompt user to enter the length of Weather Stripping in the package
		System.out.print("What is the length of Weather Stripping in the package (cm): ");
		weather_stripping_package = input.nextDouble();

		// output height and length of the door
		System.out.println("\n" + dm1.toString());

		// to calculate the weather stripping needed
		dm1.weatherstrippingneeded();

		// set weather stripping needed
		ws1.setWeatherStrippingNeeded(dm1.weather_stripping_needed);

		// set weather stripping package
		ws1.setWeatherStrippingPackage(weather_stripping_package);

		// calculate package needed
		ws1.packageneeded();

		// close scanner
		input.close();

	}

}
