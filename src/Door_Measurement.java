/*
 *Student Name: Ishtiaque Matin
 *Theory Professor: Leanne Seaward
 *Theory Section Number: CST8116_360
 *Lab Professor: Siju Philip
 *Lab Section Number: CST8116_363
 * Due Date: Oct 8th, 2021
 * Modified: Oct 8th, 2021
 * Description: This class will calculate the door measurement for the weather 
 * stripping.
 */

public class Door_Measurement {

	// declaration
	int door;
	double height;
	double width;
	double weather_stripping_needed;
	double weather_stripping_package;
	double package_needed;

	// set door
	public int setDoor(int door) {
		return this.door = door;
	}

	// set height
	public double setHeight(double height) {
		return this.height = height;
	}

	// set width
	public double setWidth(double width) {
		return this.width = width;
	}

	// calculate weather stripping needed
	public void weatherstrippingneeded() {

		weather_stripping_needed = ((height * 2) + width) * door;
		System.out.println("And the length of Weather Stripping needed by customer: " + weather_stripping_needed
				+ " cm for " + door + " door(s)");
	}

	// output height and width of the door
	@Override
	public String toString() {
		return "So the height of the door: " + height + " cm and width of the door: " + width + " cm";
	}

}
