/*
 *Student Name: Ishtiaque Matin
 *Theory Professor: Leanne Seaward
 *Theory Section Number: CST8116_360
 *Lab Professor: Siju Philip
 *Lab Section Number: CST8116_363
 * Due Date: Oct 8th, 2021
 * Modified: Oct 8th, 2021
 * Description: This class will calculate the amount of weather stripping
 * needed. 
 */

public class Weather_Stripping {

	// declaration
	double weather_stripping_package;
	double weather_stripping_needed;
	double package_needed;

	// set weather stripping package
	public double setWeatherStrippingPackage(double weather_stripping_package) {
		return this.weather_stripping_package = weather_stripping_package;
	}

	// set weather stripping needed
	public double setWeatherStrippingNeeded(double weather_stripping_needed) {
		return this.weather_stripping_needed = weather_stripping_needed;

	}

	// process package needed
	public void packageneeded() {
		package_needed = weather_stripping_needed / weather_stripping_package;
		package_needed = Math.ceil(package_needed);
		System.out.println("So the customer needs: " + package_needed + " package(s) of Weather Stripping.");
	}

}
